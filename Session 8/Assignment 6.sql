use assignment;

# show triggers;

/*drop trigger if exists trigger_delete_question;
delimiter $$
create trigger trigger_delete_question
before delete on question
for each row
begin
	delete
    from answer
	where question_id = old.question_id;
end $$
delimiter ;

delete 
from question
where question_id = 11;*/

# Question 1: Tạo trigger không cho phép người dùng nhập vào Group có ngày tạo trước 1 năm trước
-- trigger insert (insert/update-delete)
-- before (before/after)
drop trigger if exists trigger_check_group_create_date;
delimiter $$
create trigger trigger_check_group_create_date
before insert on `Group`
for each row
begin
	if new.create_date < date_sub(curdate(), interval 1 year) #interval 1 year: trước 1 năm trước
    then 
    signal sqlstate '45000'
    set message_text = 'Không được tạo Group có ngày tạo trước hơn 1 năm!';
    end if;
end $$
delimiter ;

INSERT INTO `group` (group_name, creator_id, create_date)
VALUES ('Group Cũ', 5, '2022-05-01');

# Question 2: Tạo trigger Không cho phép người dùng thêm bất kỳ user nào vào department "Sale" nữa, khi thêm thì hiện ra thông báo "Department "Sale" cannot add more user" 

drop trigger if exists trigger_block_insert_user_into_sale;
delimiter $$
create trigger trigger_block_insert_user_into_sale
before insert on account
for each row
begin
		declare v_depID tinyint;
        select d.department_id into v_depID from department d where
        d.department_name = 'Sale';
        if (new.department_id = v_depID) then
        signal sqlstate '45000'
		set message_text = 'Department "Sale" cannot add more user';
        end if ;
        
	/*if new.department_id = 2 
    then 
    signal sqlstate '45000'
	set message_text = 'Department "Sale" cannot add more user';
    end if ;
    */
end $$
delimiter ;

INSERT INTO account (email, account_username, full_name, department_id, position_id, create_date)
VALUES ('abc@example.com', 'abc123', 'Nguyễn Văn A', 2, 1, CURDATE());

# Question 3: Cấu hình 1 group có nhiều nhất là 5 user
drop trigger if exists trigger_limit_5_users_per_group;
delimiter $$
create trigger trigger_limit_5_users_per_group
before insert on GroupAccount
for each row
begin
	declare user_count int;
    
    select count(ga.group_id) into user_count
    from GroupAccount ga
    where ga.group_id = new.group_id;
    
    if (user_count) >= 5
    then 
    signal sqlstate '45000'
	set message_text = 'Khong the insert ban ghi';
    end if;
end $$
delimiter ;

INSERT INTO groupaccount (group_id, account_id, join_date)
VALUES (1, 101, curdate());

-- Question 4: Cấu hình 1 bài thi có nhiều nhất là 10 Question 
drop trigger if exists trigger_limit_10_questions_per_exam;
delimiter $$
create trigger trigger_limit_10_questions_per_exam 
before insert on ExamQuestion
for each row
begin
	declare var_CountQuesInExam tinyint;
    
    select count(eq.exam_id) into var_CountQuesInExam
    from ExamQuestion eq
    where eq.exam_id = new.exam_id;
    
    if (var_CountQuesInExam > 10)
    then 
    signal sqlstate '45000'
	set message_text = 'Nun Question in this Exam is limited 10';
    end if;
end $$
delimiter ;

SELECT COUNT(*) FROM question WHERE exam_id = 1;

# Question 5: Tạo trigger không cho phép người dùng xóa tài khoản có email là admin@gmail.com (đây là tài khoản admin, không cho phép user xóa), còn lại các tài khoản khác thì sẽ cho phép xóa và sẽ xóa tất cả các thông tin liên quan tới user đó

drop trigger if exists before_delete_account;
delimiter $$
create trigger before_delete_account
before delete on account
for each row
begin
	if old.email = 'admin@gmail.com' 
    then signal sqlstate '45000'
	set message_text = 'Đây là tài khoản admin, không cho phép user xóa';
    end if;
end $$
delimiter ;

delete from account where account_id = 15;

# Question 6: Không sử dụng cấu hình default cho field DepartmentID của table Account, hãy tạo trigger cho phép người dùng khi tạo account không điền vào departmentID thì sẽ được phân vào phòng ban "waiting Department

drop trigger if exists before_insert_account;
delimiter $$
create trigger before_insert_account
before insert on account
for each row
begin
	declare waiting_dept_id int;
    
    if new.department_id is null then
    select department_id into waiting_dept_id
    from department
    where department_id = 'waiting Department'
    limit 1;
    set new.department_id = waiting_dept_id;
    end if;
end $$
delimiter ;

# Question 7: Cấu hình 1 bài thi chỉ cho phép user tạo tối đa 4 answers cho mỗi question, trong đó có tối đa 2 đáp án đúng. 

drop trigger if exists before_insert_answer;
delimiter $$
create trigger before_insert_answer
before insert on Answer
for each row
begin
	declare total_answers int;
    declare total_correct int;
    
    select count(*) into total_answers
    from answer
    where question_id = new.question_id;
    
    if total_answers >= 4
    then signal sqlstate '45000'
	set message_text = 'Không thể thêm quá 4 đáp án cho một câu hỏi.';
    end if;
    
    if new.isCorrect = 1 then
    select count(*) into total_correct
    from answer
    where question_id = new.question_id and isCorrect = new.isCorrect;
    end if;
    
    if total_correct >= 2
    then signal sqlstate '45000'
	set message_text = 'Không thể có quá 2 đáp án đúng cho một câu hỏi.';
    end if;
    
end $$
delimiter ;

INSERT INTO Answer (Content, QuestionID, isCorrect) VALUES ('E', 1, 1);
-- INSERT INTO Answer (Content, Question_ID, isCorrect) VALUES ('E', 1, 1);

# Question 8: Viết trigger sửa lại dữ liệu cho đúng: Nếu người dùng nhập vào gender của account là nam, nữ, chưa xác định thì sẽ đổi lại thành M, F, U cho giống với cấu hình ở database

drop trigger if exists before_insert_account_gender;
delimiter $$
create trigger before_insert_account_gender
before insert on Account
for each row
begin
	if lower(new.gender) = 'nam' 
    then set new.gender = 'M';
    elseif lower(new.gender) in ('nữ' , 'nu') 
    then  set new.gender = 'F';
    elseif lower(new.gender) in ('chưa xác định' , 'chua xac dinh')
    then set new.gender = 'U';
    end if;
end $$
delimiter ;


INSERT INTO Account (Email, Account_Username, Full_Name, Gender, Department_ID, Position_ID, Create_Date) 
VALUES 
('Email13@gmail.com', 'Username13', 'Fullname13', 'nu', 5, 1, now());

# Question 9: Viết trigger không cho phép người dùng xóa bài thi mới tạo được 2 ngày

drop trigger if exists before_delete_recent_exam;
delimiter $$
create trigger before_delete_recent_exam
before delete on Exam
for each row
begin
	if datediff(curdate(), old.create_date) < 2
    then 
		SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Không được xóa bài thi mới tạo chưa quá 2 ngày!';
        end if;
end $$
delimiter ;

DELETE FROM Exam WHERE Exam_ID = 11;

# Question 10: Viết trigger chỉ cho phép người dùng chỉ được update, delete các question khi question đó chưa nằm trong exam nào 

drop trigger if exists before_delete_question_check_exam;
delimiter $$
create trigger before_delete_question_check_exam
before delete on Question
for each row
begin
	if exists (
		select 1 from examquestion where question_id = old.question_id
    ) then
    signal sqlstate '45000'
        set message_text = 'Không được sửa câu hỏi đã thuộc bài thi!';
    end if;
end $$
delimiter ;

drop trigger if exists before_update_question_check_exam;
delimiter $$
create trigger before_update_question_check_exam
before update on Question
for each row
begin
	if exists (
		select 1 from examquestion where question_id = old.question_id
    ) then
    signal sqlstate '45000'
        set message_text = 'Không được update câu hỏi đã thuộc bài thi!';
    end if;
end $$
delimiter 

DELETE FROM Question WHERE question_id = 5;
update Question set content = 'Câu mới' WHERE question_id = 5;

/* 
Question 12: Lấy ra thông tin exam trong đó: 
Duration <= 30 thì sẽ đổi thành giá trị "Short time" 
30 < Duration <= 60 thì sẽ đổi thành giá trị "Medium time" Duration > 60 thì sẽ đổi thành giá trị "Long time" 
*/

SELECT 
    *
FROM
    exam;
SELECT 
    e.exam_id,
    e.code,
    e.title,
    CASE
        WHEN e.duration <= 30 THEN 'Short time'
        WHEN 30 < e.duration AND e.duration <= 60 THEN 'Medium time'
        ELSE 'Long time'
    END AS duration1,
    e.duration
FROM
    exam e;
    
/*
Question 13: Thống kê số account trong mỗi group và in ra thêm 1 column nữa có tên là the_number_user_amount và mang giá trị được quy định như sau:
Nếu số lượng user trong group =< 5 thì sẽ có giá trị là few 
Nếu số lượng user trong group <= 20 và > 5  thì sẽ có giá trị là normal 
Nếu số lượng user trong group > 20 thì sẽ có giá trị là higher 
*/

SELECT 
    ga.group_id,
    COUNT(ga.account_id) AS total_users,
    CASE
        WHEN COUNT(ga.account_id) < 3 THEN 'few'
        WHEN
            COUNT(ga.account_id) <= 5
                AND COUNT(ga.account_id) > 3
        THEN
            'normal'
        ELSE 'higher'
    END AS the_number_user_amount
FROM
    groupaccount ga
GROUP BY ga.group_id;

# Question 14: Thống kê số mỗi phòng ban có bao nhiêu user, nếu phòng ban nào không có user thì sẽ thay đổi giá trị 0 thành "Không có User" 

	SELECT 
    COUNT(a.account_id) AS userInDepartment,
    d.department_id,
    CASE
        WHEN COUNT(a.account_id) > 0 THEN COUNT(a.account_id)
        ELSE 'Không có User'
    END AS userInDepartment2,
    d.department_id
FROM
    department d
        LEFT JOIN
    account a ON a.department_id = d.department_id
GROUP BY d.department_id

