drop database if exists Extra_Assignment_5;
create database if not exists Extra_Assignment_5;
use Extra_Assignment_5;

-- Table 1: Employee
drop table if exists Employee;
create table Employee (
	EmployeeID tinyint auto_increment primary key,
    EmployeeLastName varchar(50),
    EmployeeFirstName varchar(50),
    EmployeeHireDate date,
    EmployeeStatus varchar(20),
    SupervisorID tinyint,
    SocialSecutityNumber varchar(20) unique,
    foreign key (SupervisorID) references Employee(EmployeeID)
);

-- Table 2: Project
drop table if exists Projects;
create table Projects (
	ProjectID tinyint auto_increment primary key,
    ManagerID tinyint not null,
    ProjectName varchar(50) unique,
    ProjectStartDate date,
    ProjectDescription text,
    ProjectDetailt text,
    ProjectCompletedOn  date,
    foreign key (ManagerID) references Employee(EmployeeID)
);

-- Table 3: Project_Modules
drop table if exists Project_Modules;
create table Project_Modules (
	ModuleID tinyint auto_increment primary key,
    ProjectID tinyint unique,
    EmployeeID tinyint unique,
    ProjectModulesDate date,
    ProjectModulesCompletedOn date,
    ProjectModulesDescription text,
    foreign key (ProjectID) references Projects(ProjectID),
    foreign key (EmployeeID) references Employee(EmployeeID)
); 

-- Table 4: Work_Done
drop table if exists Work_Done;
create table Work_Done (
	WorkDoneID tinyint auto_increment primary key,
    EmployeeID tinyint,
    ModuleID tinyint,
    WorkDoneDate date,
    WorkDoneDescription text,
    WorkDoneStatus varchar(20),
    foreign key (ModuleID) references Project_Modules(ModuleID),
    foreign key (EmployeeID) references Employee(EmployeeID)
);

-- Question 1: Tạo table với các ràng buộc và kiểu dữ liệu và thêm ít nhất 3 bản ghi vào mỗi table trên


