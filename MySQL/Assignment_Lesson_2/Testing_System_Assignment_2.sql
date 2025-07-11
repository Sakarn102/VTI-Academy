USE Assignment;

-- Exercise 1
-- Question 2
select * from Department;
INSERT INTO Department(Department_Name)  
VALUES 
    ('Marketing'), 
    ('Sale'), 
    ('Bảo vệ'), 
    ('Nhân sự'), 	
    ('Kỹ thuật'), 
    ('Tài chính'), 
    ('Phó giám đốc'), 
    ('Giám đốc'), 
    ('Thư kí'), 
    ('No person'), 
    ('Bán hàng');
    
-- Exercise 2

-- Question 1: Thêm ít nhất 10 record vào mỗi table 

INSERT INTO Position (Position_Name) 
VALUES  
	('Dev'), 
	('Test'), 
	('Scrum Master'), 
	('PM'), 
	('PO'), 
	('DA'), 
	('BA'), 
	('Engineer Software'), 
	('CEO'), 
	('Master');
    
INSERT INTO Account(Email, Account_Username, Full_Name, Department_ID, Position_ID, Create_Date)
VALUES
    ('Email1@gmail.com', 'Username1', 'Fullname1', 5, 1, '2020-03-05'),
    ('Email2@gmail.com', 'Username2', 'Fullname2', 1, 2, '2020-03-05'),
    ('Email3@gmail.com', 'Username3', 'Fullname3', 2, 2, '2020-03-07'),
    ('Email4@gmail.com', 'Username4', 'Fullname4', 3, 4, '2020-03-08'),
    ('Email5@gmail.com', 'Username5', 'Fullname5', 4, 4, '2020-03-10'),
    ('Email6@gmail.com', 'Username6', 'Fullname6', 6, 3, '2020-04-05'),
    ('Email7@gmail.com', 'Username7', 'Fullname7', 2, 2, NULL),
    ('Email8@gmail.com', 'Username8', 'Fullname8', 8, 1, '2020-04-07'),
    ('Email9@gmail.com', 'Username9', 'Fullname9', 2, 2, '2020-04-07'),
    ('Email10@gmail.com', 'Username10', 'Fullname10', 10, 1, '2020-04-09'),
    ('Email11@gmail.com', 'Username11', 'Fullname11', 10, 1, DEFAULT),
    ('Email12@gmail.com', 'Username12', 'Fullname12', 10, 1, DEFAULT);
    
INSERT INTO `Group` (Group_Name, Creator_ID, Create_Date)
VALUES
    ('Testing System', 5, '2019-03-05'),
    ('Development', 1, '2026-03-07'),
    ('VTI Sale 01', 2, '2020-03-09'),
    ('VTI Sale 02', 3, '2020-03-10'),
    ('VTI Sale 03', 4, '2020-03-28'),
    ('VTI Creator', 6, '2020-04-06'),
    ('VTI Marketing 01', 7, '2020-04-07'),
    ('Management', 8, '2020-04-08'),
    ('Chat with love', 9, '2020-04-09'),
    ('Vi Ti Ai', 10, '2020-04-10');
    
INSERT INTO GroupAccount (Group_ID, Account_ID, Join_Date)
VALUES
    (1, 1, '2019-03-05'),
    (1, 2, '2022-03-07'),
    (3, 3, '2023-03-09'),
    (3, 4, '2024-03-10'),
    (5, 5, '2025-03-28'),
    (1, 3, '2020-04-06'),
    (1, 7, '2021-04-07'),
    (8, 3, '2022-04-08'),
    (1, 9, '2024-04-09'),
    (10, 10, '2024-04-10');

INSERT INTO TypeQuestion (Type_Name)
VALUES
    ('Essay'),  
    ('Multiple-Choice'),
    ('Essay'),  
    ('Multiple-Choice'),
    ('Essay'),  
    ('Multiple-Choice'),
    ('Essay'),  
    ('Multiple-Choice'),
    ('Essay'),  
    ('Multiple-Choice'),
    ('Essay'),  
    ('Multiple-Choice');

INSERT INTO CategoryQuestion (Category_Name)
VALUES
    ('Java'),
    ('ASP.NET'),
    ('ADO.NET'),
    ('SQL'),
    ('Postman'),
    ('Ruby'),
    ('Python'),
    ('C++'),
    ('C Sharp'),
    ('PHP');

-- SỬA LẠI INSERT QUESTION - CHỈ DÙNG TYPE_ID 1,2
INSERT INTO Question (Content, Category_ID, TypeID, Creator_ID, Create_Date)
VALUES
    ('Câu hỏi về Java', 1, 2, 1, '2020-04-05'),
    ('Câu hỏi về PHP', 10, 1, 1, '2020-04-05'),
    ('Hỏi về C#', 9, 2, 1, '2020-04-06'),
    ('Hỏi về Ruby', 6, 1, 1, '2020-04-06'),
    ('Hỏi về Postman', 5, 2, 1, '2020-04-06'),
    ('Hỏi về ADO.NET', 3, 1, 1, '2020-04-06'),
    ('Hỏi về ASP.NET', 2, 2, 1, '2020-04-06'),
    ('Hỏi về C++', 8, 1, 1, '2020-04-07'),
    ('Hỏi về SQL', 4, 2, 1, '2020-04-07'),
    ('Hỏi về Python', 7, 1, 1, '2020-04-07');

INSERT INTO Answer (Content, Question_ID, isCorrect)
VALUES
    ('Trả lời 01', 1, 0),
    ('Trả lời 02', 1, 0),
    ('Trả lời 03', 1, 0),
    ('Trả lời 04', 1, 1),
    ('Trả lời 05', 2, 1),
    ('Trả lời 06', 3, 1),
    ('Trả lời 07', 4, 0),
    ('Trả lời 08', 8, 0),
    ('Trả lời 09', 9, 1),
    ('Trả lời 10', 10, 1);

INSERT INTO Exam (Code, Title, Category_ID, Duration, Creator_ID, Create_Date)
VALUES
    ('VTIQ001', 'Đề thi C#', 1, 60, 5, '2019-04-05'),
    ('VTIQ002', 'Đề thi PHP', 10, 60, 2, '2019-04-06'),
    ('VTIQ003', 'Đề thi C++', 8, 120, 2, '2019-04-07'),
    ('VTIQ004', 'Đề thi Java', 1, 60, 3, '2020-04-08'),
    ('VTIQ005', 'Đề thi Ruby', 6, 60, 4, '2020-04-10'),
    ('VTIQ006', 'Đề thi Postman', 5, 60, 6, '2020-04-05'),
    ('VTIQ007', 'Đề thi SQL', 4, 60, 7, '2020-04-05'),
    ('VTIQ008', 'Đề thi Python', 7, 60, 8, '2020-04-07'),
    ('VTIQ009', 'Đề thi ADO.NET', 3, 90, 9, '2020-04-07'),
    ('VTIQ010', 'Đề thi ASP.NET', 2, 90, 10, '2020-04-08');

INSERT INTO ExamQuestion (Exam_ID, Question_ID)
VALUES  
    (1, 5),  
    (2, 10),  
    (3, 4),  
    (4, 3),  
    (5, 7),  
    (6, 10),  
    (7, 2),  
    (8, 10),  
    (9, 9),  
    (10, 8);

-- Question 2: Lấy ra tất cả các phòng ban
select * from department;

-- Question 3: Lấy ra id của phòng ban "Sale" 
select Department_ID from department where Department_Name = 'Sale';

-- Question 4: Lấy ra thông tin account có full name dài nhất 
select * from Account order by length(Full_Name) desc limit 1;

-- Question 5: Lấy ra thông tin account có full name dài nhất và thuộc phòng ban có id  = 3 
select * from Account where Department_ID = 3 order by length(Full_Name)  desc limit 1;

-- Question 6: Lấy ra tên group đã tham gia trước ngày 20/12/2019 
SELECT Group_Name FROM `Group` WHERE Create_Date < '2019-12-20';

-- Question 7: Lấy ra ID của question có >= 4 câu trả lời 
select Question_id from Answer group by Question_id having count(*) >= 4;

-- Question 8: Lấy ra các mã đề thi có thời gian thi >= 60 phút và được tạo trước ngày 20/12/2019 
select Code from Exam where Duration >= 60 and Create_Date < '2019-12-20';

-- Question 9: Lấy ra 5 group được tạo gần đây nhất
select * from `Group` order by Create_Date desc limit 5;

-- Question 10: Đếm số nhân viên thuộc department có id = 2 
select count(*) from Department where Department_ID = 2;

-- Question 11: Lấy ra nhân viên có tên bắt đầu bằng chữ "D" và kết thúc bằng chữ "o"
select * from Account where Full_Name like 'D%o';

-- Question 12: Xóa tất cả các exam được tạo trước ngày 20/12/2019  
delete from Exam where Create_Date < '2019-12-20';

-- Question 13: Xóa tất cả các question có nội dung bắt đầu bằng từ "câu hỏi" 
delete from Question where Content like 'câu hỏi%';

-- Question 14: Update thông tin của account có id = 5 thành tên "Nguyễn Bá Lộc" và email thành loc.nguyenba@vti.com.vn 
update Account set Full_Name = 'Nguyen Ba Loc' , Email = 'loc.nguyenba@vti.com.vn' where Account_id = 5;

-- Question 15: update account có id = 5 sẽ thuộc group có id = 4 
update Account set Group_ID = 4 where Account_ID = 5;
