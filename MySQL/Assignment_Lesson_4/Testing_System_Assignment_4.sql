use assignment;

-- Question 1: Tạo view có chứa danh sách nhân viên thuộc phòng ban sale
create view Question_1 as 
SELECT 
    a.*,d.department_name
FROM
    account a
INNER JOIN
    department d ON a.department_id = d.department_id
WHERE
    d.department_id = (
		SELECT department_id
		FROM department
		WHERE department_name = 'Sale'
	);
            
-- Question 2: Tạo view có chứa thông tin các account tham gia vào nhiều group nhất
create view Question_2 as
select
a.*,
count(ga.group_id) as note
from 
	Account a 
inner join 
	GroupAccount ga on a.account_id = ga.account_id
group by 
	a.account_id
having 
	count(ga.group_id) = (
    select max(account_group)
    from (
		select count(group_id) as account_group
        	from groupaccount 
        	group by account_id 
		) as sub
    );
    
-- Question 3: Tạo view có chứa câu hỏi có những content quá dài (content quá 300 từ được coi là quá dài) và xóa nó đi
create view question_3 as
select 
	question_id, content 
from 
	question 
where
	length(content) = (
		select length(content)
        from question 
        where length(content) > 300
    );
delete from 
	question
where 
	length(content) > 300;
    
-- Question 4: Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất
create view question_4 as
select 
	d.department_id, 
	d.department_name, 
	count(a.account_id) as note
from 
	account a 
inner join 
	department d on a.department_id = d.department_id 
group by 
	d.department_id, d.department_name
having 
	count(a.account_id) = (
	select max(max_account_group)
    from (
		select count(account_id) as max_account_group
		from account
		group by department_id
		) as sub
	);

-- Question 5: Tạo view có chứa tất các các câu hỏi do user họ Nguyễn tạo
select 
	a.account_id, 
	a.account_username, 
	q.content 
from 
	account a 
inner join 
	question q on a.account_id = q.creator_id 
where 
	a.account_id in (
	   select account_id 
    	   from account 
    	   where account_username like 'Username1%'
);

        
