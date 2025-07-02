use assignment;

-- Question 1:  Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các account thuộc phòng ban đó 
drop procedure if exists get_account_department;
DELIMITER $$
	create procedure get_account_department (in in_dept_name varchar(50))
    begin
		select 
			a.account_id, 
            a.account_username, 
            d.department_name as name
        from 
			account a
        join 
			department d on a.department_id = d.department_id
        where 
			d.department_name = in_dept_name;
	end $$
DELIMITER ;

call get_account_department('No person');

-- Question 2: Tạo store để in ra số lượng account trong mỗi group
DELIMITER $$
	create procedure get_account_in_group ()
    begin 
		select 
			g.group_name, 
            count(ga.account_id) as total_accounts
        from 
			`group` g
        left join 
			groupaccount ga on g.group_id = ga.group_id
        group by 
			g.group_id, g.group_name;
	end$$
DELIMITER ;

call get_account_group();

-- Question 3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo trong tháng hiện tại
DELIMITER $$
create procedure get_number_question_in_curent_month(in input_typeId tinyint)
begin
	select 
		count(input_typeId) as NumberOfQuestion, 
		typeID
    from 
		question
    where 
		month(curdate()) = month(question.Create_Date)
    and 
		year(curdate()) = year(question.Create_Date)
    group by 
		typeID
    having 
		typeID = input_typeId;
end $$
DELIMITER ;

select * from question;
call get_number_question_in_curent_month(1);

-- Question 4: Question 4: Tạo store để trả ra id của type question có nhiều câu hỏi nhất 
DELIMITER $$
create procedure get_type_with_max_questions()
begin 
	select 
		type_ID, 
        count(type_ID) as note
    from 
		question 
    group by 
		type_ID
    order by note 
	desc limit 1;
end $$
DELIMITER ;

call get_type_with_max_questions();
-- Question 5: Question 5: Sử dụng store ở question 4 để tìm ra tên của type question
DELIMITER $$
create procedure get_name_type_question()
begin 
	DECLARE max_type_id INT;
     
	select type_ID
    INTO max_type_id
    from question 
    group by type_id
    order by count(*)
    desc limit 1;
    
    SELECT 
		tq.type_ID, 
        tq.type_name
    FROM 
		typequestion tq
    WHERE 
		tq.type_ID = max_type_id;
end $$
DELIMITER ;

call get_name_type_question();

-- Question 6: Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về group có tên chứa chuỗi của người dùng nhập vào hoặc trả về user có username chứa chuỗi của người dùng nhập vào
DELIMITER $$
create procedure search_group_or_user(in keyword varchar(100))
begin
	select 
		group_id as id, 
        group_name as name, 
        'group' as type
    from 
		`group`
    where 
		group_name like concat('%', keyword, '%')
    
    union 
    
	select 
		account_id as id, 
        account_username as name, 
        'account' as type
    from 
		account
    where 
		account_username like concat('%', keyword, '%');
end $$
DELIMITER ;

call search_group_or_user('username1');

-- Question 7: Viết 1 store cho phép người dùng nhập vào thông tin fullName, email và trong store sẽ tự động gán:  
 	/*username sẽ giống email nhưng bỏ phần @..mail đi  	
	positionID: sẽ có default là developer 
	departmentID: sẽ được cho vào 1 phòng chờ 
	Sau đó in ra kết quả tạo thành công */

drop procedure if exists insert_account;
delimiter $$
create procedure insert_account(in in_full_name varchar(50), in in_email varchar(50))
begin
	declare userName varchar(50) default substring_index(in_email, '@', 1);
    declare positionId int default 1;
    declare departmentId int default 2;
    insert into assignment.account (Email, Account_Username, Full_Name, Department_ID, Position_ID)
    values (in_email, userName, in_full_name, departmentId, positionId);
	select 'Insert thành công' as msg;
end $$
delimiter ;

call insert_account('VTI','vti01998@gmail.com');

-- Question 8: Viết 1 store cho phép người dùng nhập vào Essay hoặc Multiple-Choice để thống kê câu hỏi essay hoặc multiple-choice nào có content dài nhất 
drop procedure if exists get_longest_question;
delimiter $$
create procedure get_longest_question (in in_type varchar(30))
begin
	select 
		question_id, 
        content, 
        tq.type_name as name
    from 
		question q
    join 
		typequestion tq on tq.type_id = q.type_id
    where 
		tq.type_name = in_type
    order by 
		char_length(content) desc limit 1;
end $$
delimiter ;

call get_longest_question('Multiple-Choice');

-- Question 9: Viết 1 store cho phép người dùng xóa exam dựa vào ID 
-- Question 10: Question 10: Tìm ra các exam được tạo từ 3 năm trước và xóa các exam đó đi (sử dụng store ở câu 9 để xóa). Sau đó in số lượng record đã remove từ các table liên quan trong khi removing 
-- Question 11: Viết store cho phép người dùng xóa phòng ban bằng cách người dùng nhập vào tên phòng ban và các account thuộc phòng ban đó sẽ được chuyển về phòng ban default là phòng ban chờ việc 
DROP PROCEDURE IF EXISTS delete_department_by_name;
delimiter $$
CREATE PROCEDURE delete_department_by_name(IN in_dept_name VARCHAR(100))
begin 
declare v_dept_id int;

-- Kiểm tra phòng ban tồn tại hay không
select 
	department_id into v_dept_id
from 
	department
where 
	department_name = in_dept_name limit 1;

-- Tìm kiếm
if v_dept_id is null 
	then select concat('Phòng ban "', in_dept_name, '" không tồn tại') as msg;
else
-- chập nhật account về phòng chờ việc (giả sử id = 2)
	update account
    set 
		department_id = 2
    where 
		department_id = v_dept_id;
    
-- xóa phòng ban
delete from 
	department
where 
	department_id = v_dept_id;
end if;
end $$
delimiter ;

call delete_department_by_name('IT');

-- Question 12: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong năm nay 
DROP PROCEDURE IF EXISTS get_question_count_by_month;
DELIMITER $$
CREATE PROCEDURE get_question_count_by_month ()
begin 
	select 
		month(create_date) as month,
		COUNT(*) AS total_questions
    from 
		question
    where 
		year(create_date) = year(curdate())
    group by 
		month(create_date) order by month;
end $$
delimiter ;

call get_question_count_by_month();

-- Question 13: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong 6 tháng gần đây nhất (Nếu tháng nào không có thì sẽ in ra là "không có câu hỏi nào trong  tháng") 
