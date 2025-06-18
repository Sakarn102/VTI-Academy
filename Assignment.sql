drop database if exists Assignment;
create database if not exists Assignment;
use Assignment;

-- Table 1: Department
drop table if exists Department;	
create table Department (
	DepartmentID int auto_increment primary key,
    DepartmentName varchar(50) not null
);

-- Table 2: Position
drop table if exists Position;
create table Position (
	PositionID int auto_increment primary key,
    PositionName varchar(30) not null
);

-- Table 3: Account
drop table if exists Account;
create table Account (
	AccountID int auto_increment primary key,
    Email varchar(50) unique not null,
    Username varchar(30) not null unique,
    FullName varchar(50) not null,
    DepartmentID int,
    PositionID int,
    CreateDate timestamp default current_timestamp,
    foreign key (DepartmentID) references Department(DepartmentID)
    /*foreign key (PositionID) references Position(PositionID)*/
    );
    
-- Table 4: Group(Team)
drop table if exists Team;
create table Team (
	GroupID int auto_increment primary key,
    GroupName varchar(50) not null,
    CreatorID int,
    CreateDate timestamp default current_timestamp
);

-- Table 5: GroupAccount
drop table if exists GroupAccount;
create table GroupAccount (
	GroupID int,
    AccountID int,
    JoinDate timestamp default current_timestamp,
    primary key (GroupID, AccountID),
    foreign key (GroupID) references Team(GroupID),
    foreign key (AccountID) references Account(AccountID)
);

-- Table 6: TypeQuestion
drop table if exists TypeQuestion;
create table TypeQuestion (
	TypeID int auto_increment primary key,
    TypeName varchar(50) not null
);

-- Table 7: CategoryQuestion
drop table if exists CategoryQuestion;
create table CategoryQuestion (
	CategoryID int auto_increment primary key,
    CategoryName varchar(50) not null
); 

-- Table 8: Question
drop table if exists Question;
create table Question (
	QuestionID int auto_increment primary key,
    Content text not null,
    CategoryID int,
    TypeID int,
    CreatorID int,
    CreateDate timestamp default current_timestamp,
    foreign key (CategoryID) references CategoryQuestion(CategoryID),
    foreign key (TypeID) references TypeQuestion(TypeID)
);

-- Table 9: Answer
drop table if exists Answer;
create table Answer (
	AnswerID int auto_increment primary key,
    Content text not null,
    QuestionID int,
    isCorrect boolean not null,
    foreign key (QuestionID) references Question(QuestionID)
);

-- Table 10: Exam
drop table if exists Exam;
create table Exam (
	ExamID int auto_increment primary key,
    Code int unique,
    Title text,
    CategoryID int,
    Duration time,
    CreatorID int,
    CreateDate timestamp default current_timestamp,
    foreign key (CategoryID) references CategoryQuestion(CategoryID)
);

-- Table 11: ExamQuestion
drop table if exists ExamQuestion;
create table ExamQuestion (
	ExamID int,
    QuestionID int,
    primary key (ExamID, QuestionID),
    foreign key (ExamID) references Exam(ExamID),
    foreign key (QuestionID) references Question(QuestionID)
);