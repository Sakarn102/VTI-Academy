CREATE DATABASE IF NOT EXISTS exam;
USE exam;

DROP TABLE IF EXISTS user;
CREATE TABLE IF NOT EXISTS `user`(
	Id int primary key auto_increment,
    Fullname varchar(50),
    Email varchar(50),
    `Password` varchar(50),
    Exp_In_Year int,
    ProjectId varchar(50),
	Pro_Skill varchar(50),
    `Role` varchar(50) -- Manager, Employee,....
);