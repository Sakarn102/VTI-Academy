drop database if exists Assignment;
create database if not exists Assignment;
use Assignment;

-- Table 1: Department
drop table if exists Department;
CREATE TABLE Department (
    Department_ID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Department_Name NVARCHAR(50) NOT NULL UNIQUE
);

-- Table 2: Position
drop table if exists Position;
CREATE TABLE Position (
    Position_ID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Position_Name NVARCHAR(30) NOT NULL UNIQUE
);

-- Table 3: Account
drop table if exists Account;
CREATE TABLE Account (
    Account_ID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Email VARCHAR(50) NOT NULL UNIQUE,
    Account_Username VARCHAR(50) NOT NULL UNIQUE,
    Full_Name NVARCHAR(50) NOT NULL,
    Department_ID TINYINT UNSIGNED NOT NULL,
    Position_ID TINYINT UNSIGNED NOT NULL,
    Create_Date DATETIME DEFAULT NOW(),
    FOREIGN KEY (Department_ID)
        REFERENCES Department (Department_ID),
    FOREIGN KEY (Position_ID)
        REFERENCES Position (Position_ID)
);
    
-- Table 4: Group
drop table if exists `Group`;
CREATE TABLE `Group` (
    Group_ID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Group_Name NVARCHAR(50) NOT NULL UNIQUE,
    Creator_ID TINYINT UNSIGNED,
    Create_Date DATETIME DEFAULT NOW(),
    FOREIGN KEY (Creator_ID)
        REFERENCES Account (Account_ID)
);

-- Table 5: GroupAccount
CREATE TABLE GroupAccount (
    Group_ID TINYINT UNSIGNED NOT NULL,
    Account_ID TINYINT UNSIGNED NOT NULL,
    Join_Date DATETIME DEFAULT NOW(),
    PRIMARY KEY (Group_ID , Account_ID),
    FOREIGN KEY (Group_ID)
        REFERENCES `Group` (Group_ID),
    FOREIGN KEY (Account_ID)
        REFERENCES Account (Account_ID)
);

-- Table 6: TypeQuestion
drop table if exists TypeQuestion;
CREATE TABLE TypeQuestion (
    Type_ID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Type_Name ENUM('Essay', 'Multiple-Choice') NOT NULL UNIQUE
);

-- Table 7: CategoryQuestion
drop table if exists CategoryQuestion;
CREATE TABLE CategoryQuestion (
    Category_ID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Category_Name NVARCHAR(50) NOT NULL UNIQUE
);

-- Table 8: Question
drop table if exists Question;
CREATE TABLE Question (
    Question_ID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Content NVARCHAR(100) NOT NULL UNIQUE,
    Category_ID TINYINT UNSIGNED NOT NULL,
    Type_ID TINYINT UNSIGNED NOT NULL,
    Creator_ID TINYINT UNSIGNED NOT NULL,
    Create_Date DATETIME DEFAULT NOW(),
    FOREIGN KEY (Category_ID)
        REFERENCES CategoryQuestion (Category_ID),
    FOREIGN KEY (Type_ID)
        REFERENCES TypeQuestion (Type_ID),
    FOREIGN KEY (Creator_ID)
        REFERENCES Account (Account_ID)
);

-- Table 9: Answer
drop table if exists Answer;
CREATE TABLE Answer (
    Answer_ID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Content NVARCHAR(100) NOT NULL,
    Question_ID TINYINT UNSIGNED NOT NULL,
    isCorrect BIT DEFAULT 1,
    FOREIGN KEY (Question_ID)
        REFERENCES Question (Question_ID)
);

-- Table 10: Exam
drop table if exists Exam;
CREATE TABLE Exam (
    Exam_ID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Code CHAR(10) NOT NULL,
    Title NVARCHAR(50) NOT NULL,
    Category_ID TINYINT UNSIGNED NOT NULL,
    Duration TINYINT UNSIGNED NOT NULL,
    Creator_ID TINYINT UNSIGNED NOT NULL,
    Create_Date DATETIME DEFAULT NOW(),
    FOREIGN KEY (Category_ID)
        REFERENCES CategoryQuestion (Category_ID),
    FOREIGN KEY (Creator_ID)
        REFERENCES Account (Account_ID)
);

-- Table 11: ExamQuestion
drop table if exists ExamQuestion;
CREATE TABLE ExamQuestion (
    Exam_ID TINYINT UNSIGNED NOT NULL,
    Question_ID TINYINT UNSIGNED NOT NULL,
    PRIMARY KEY (Exam_ID , Question_ID),
    FOREIGN KEY (Exam_ID)
        REFERENCES Exam (Exam_ID),
    FOREIGN KEY (Question_ID)
        REFERENCES Question (Question_ID)
);

-- INSERT DATA - ĐÃ SỬA TÊN CỘT
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
                        
INSERT INTO Position (Position_Name)
VALUES  
    ('Dev'),
    ('Test'),
    ('Scrum Master'),
    ('PM');
    
INSERT INTO Account(Email, Account_Username, Full_Name, Department_ID, Position_ID, Create_Date)
VALUES
    ('Email1@gmail.com', 'Username1', 'Fullname1', 5, 1, '2020-03-05'),
    ('Email2@gmail.com', 'Username2', 'Fullname2', 1, 2, '2021-03-05'),
    ('Email3@gmail.com', 'Username3', 'Fullname3', 2, 2, '2022-03-07'),
    ('Email4@gmail.com', 'Username4', 'Fullname4', 3, 4, '2023-03-08'),
    ('Email5@gmail.com', 'Username5', 'Fullname5', 4, 4, '2024-03-10'),
    ('Email6@gmail.com', 'Username6', 'Fullname6', 6, 3, '2025-04-05'),
    ('Email7@gmail.com', 'Username7', 'Fullname7', 2, 2, NULL),
    ('Email8@gmail.com', 'Username8', 'Fullname8', 8, 1, '2023-04-07'),
    ('Email9@gmail.com', 'Username9', 'Fullname9', 2, 2, '2021-04-07'),
    ('Email10@gmail.com', 'Username10', 'Fullname10', 10, 1, '2025-04-09'),
    ('Email11@gmail.com', 'Username11', 'Fullname11', 10, 1, DEFAULT),
    ('Email12@gmail.com', 'Username12', 'Fullname12', 10, 1, DEFAULT);
    
INSERT INTO `Group` (Group_Name, Creator_ID, Create_Date)
VALUES
    ('Testing System', 5, '2019-03-05'),
    ('Development', 1, '2020-03-07'),
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
INSERT INTO Question (Content, Category_ID, Type_ID, Creator_ID, Create_Date)
VALUES
    ('Câu hỏi về Java', 1, 2, 1, '2019-04-05'),
    ('Câu hỏi về PHP', 10, 1, 1, '2020-04-05'),
    ('Hỏi về C#', 9, 2, 1, '2021-04-06'),
    ('Hỏi về Ruby', 6, 1, 1, '2022-04-06'),
    ('Hỏi về Postman', 5, 2, 1, '2023-04-06'),
    ('Hỏi về ADO.NET', 3, 1, 1, '2024-04-06'),
    ('Hỏi về ASP.NET', 2, 2, 1, '2025-04-06'),
    ('Hỏi về C++', 8, 1, 1, '2024-04-07'),
    ('Hỏi về SQL', 4, 2, 1, '2023-04-07'),
    ('Hỏi về Python', 7, 1, 1, '2022-04-07');

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
