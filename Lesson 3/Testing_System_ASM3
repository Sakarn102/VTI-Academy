use Assignment;
 
 -- Exxercise 1
 
-- Question 1: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ 
SELECT 
    *
FROM
    account a
        INNER JOIN
    department d ON d.department_id = a.department_id;
    
-- Question 2
SELECT 
    *
FROM
    Account
        INNER JOIN
    GroupAccount ON Account.Account_ID = GroupAccount.Account_ID
WHERE
    Account.Create_date > '2010-12-20';

-- Question 3: Viết lệnh để lấy ra tất cả các developer  
SELECT 
    *
FROM
    position
        INNER JOIN
    account ON Position.Position_ID = Account.Position_ID
WHERE
    Position.Position_Name = 'Dev';
    
-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên
SELECT 
    d.department_name, COUNT(a.account_id) AS employee_count
FROM
    department d
        LEFT JOIN
    account a ON d.department_id = a.department_id
GROUP BY d.department_id , d.department_name
HAVING COUNT(a.account_id) > 3;

-- Question 5: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất
SELECT 
    q.Content, 
    COUNT(eq.Exam_ID) AS TimeAppearing
FROM 
    ExamQuestion eq
JOIN 
    Question q ON eq.Question_ID = q.Question_ID
GROUP BY 
    q.Question_ID, q.Content
ORDER BY 
    TimeAppearing DESC
LIMIT 1;

-- Question 6: Thông kê mỗi category Question được sử dụng trong bao nhiêu Question
SELECT 
    cq.Category_ID,
    cq.Category_Name,
    q.Content,
    COUNT(cq.Category_ID) AS Statistic
FROM
    Question q
        JOIN
    CategoryQuestion cq ON cq.Category_ID = q.Category_ID
GROUP BY q.Category_ID , q.Content
ORDER BY Statistic;

-- Question 7: Thông kê mỗi Question được sử dụng trong bao nhiêu Exam 
SELECT 
    q.Question_ID, q.Content, COUNT(q.Question_ID) AS Statistic
FROM
    Question q
        JOIN
    ExamQuestion eq ON q.Question_ID = eq.Question_ID
GROUP BY q.Question_ID , q.Content
ORDER BY Statistic DESC;

-- Question 8:  Lấy ra Question có nhiều câu trả lời nhất 
SELECT 
    q.Question_ID, q.Content, COUNT(a.Answer_ID) AS Statistic
FROM
    Question q
        JOIN
    Answer a ON q.Question_ID = a.Question_ID
GROUP BY q.Question_ID , q.Content
ORDER BY Statistic DESC
LIMIT 1;

-- Question 9: Thống kê số lượng account trong mỗi group  
SELECT 
    g.Group_Name,
    COUNT(ga.Account_ID) AS NumberOfAccounts
FROM 
    `Group` g
JOIN 
    GroupAccount ga ON g.Group_ID = ga.Group_ID
GROUP BY 
    g.Group_ID, g.Group_Name;

-- Question 10: Tìm chức vụ có ít người nhất  
SELECT 
    p.Position_Name, COUNT(a.Account_ID) as Statistic
FROM
    Position p
        left JOIN
    Account a ON p.Position_ID = a.Position_ID
GROUP BY p.Position_ID
ORDER BY Statistic ASC
LIMIT 1;

-- Question 11: Thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM   
SELECT 
    d.department_name,
    COUNT(case when p.position_name = 'dev' then 1 end) as dev_count,
    COUNT(case when p.position_name = 'test' then 1 end) as test_count,
    COUNT(case when p.position_name = 'scrum master' then 1 end) as sc_count,
    COUNT(case when p.position_name = 'pm' then 1 end) as pm_count
FROM
    account a
        INNER JOIN
    department d ON a.department_id = d.department_id
        INNER JOIN
    position p ON p.position_id = a.position_id
GROUP BY d.department_name;

-- Question 12: Lấy thông tin chi tiết của câu hỏi bao gồm: thông tin cơ bản của question, loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì, … 
select q.Question_ID, q.Content, q.Creator_ID, a.Content
from Question q
inner join Answer a on q.Question_ID = a.Question_ID
order by q.Question_ID desc;

-- Question 13: Lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm
Select tq.Type_ID, tq.Type_Name, count(q.Question_ID) as ND
from Question q
join TypeQuestion tq on q.Type_ID = tq.Type_ID
group by q.Type_ID order by ND;

-- Question 14: Lấy ra group không có account nào 
SELECT 
    *
FROM
    `group` g
        left JOIN
    GroupAccount ga ON g.Group_ID = ga.Group_ID
WHERE
    ga.Account_ID IS NULL;
    
-- Question 15: Lấy ra group không có account nào 
SELECT 
    *
FROM
    `group` g
        left JOIN
    GroupAccount ga ON g.Group_ID = ga.Group_ID
WHERE
    ga.Account_ID IS NULL;
    
-- Question 16:  Lấy ra question không có answer nào 
SELECT 
    *
FROM
    Answer a
        right JOIN
    question q ON a.Question_ID = q.Question_ID
WHERE
    a.Answer_ID IS NULL; 

-- Exercise 2

-- Question 17
select * 
from GroupAccount ga
join Account a on ga.Account_ID = a.Account_ID
where ga.Account_ID = 1
union
select *
from GroupAccount ga
join Account a on ga.Account_ID = a.Account_ID
where ga.Account_ID = 2;

-- Question 18
select *
from `Group` g
join GroupAccount ga on g.Group_ID = ga.Group_ID
where g.Group_ID > 5
union all
select *
from `Group` g
join GroupAccount ga on g.Group_ID = ga.Group_ID
where g.Group_ID < 7
