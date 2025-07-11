DROP DATABASE IF EXISTS Extra_Assignment_1_2;
CREATE DATABASE IF NOT EXISTS Extra_Assignment_1_2;
USE Extra_Assignment_1_2;

-- Exercise 1: Design a table
DROP TABLE IF EXISTS Trainee;	
CREATE TABLE Trainee (
	TraineeID INT AUTO_INCREMENT PRIMARY KEY,
    Full_Name VARCHAR(50) NOT NULL,
    Birth_Date DATE,
    Gender ENUM('male', 'female', 'unknown') DEFAULT 'unknown' NOT NULL,
    ET_IQ TINYINT UNSIGNED, 
    ET_Gmath TINYINT UNSIGNED,
    ET_English TINYINT UNSIGNED,
    Training_Class VARCHAR(20) NOT NULL UNIQUE,
    Evaluation_Notes TEXT,
    VTI_Account VARCHAR(50) NOT NULL UNIQUE
);

-- Exercise 2: Data Types
DROP TABLE IF EXISTS DataTypes;	
CREATE TABLE DataTypes (
	ID INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(50) NOT NULL,
    Code CHAR(5) NOT NULL,
    ModiFiedDate DATETIME
);

-- Exercise 3: Data Types (2)
DROP TABLE IF EXISTS DataTypes_2;	
CREATE TABLE DataTypes_2 (
	ID INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(50) NOT NULL,
    BirthDate DATETIME,
    Gender CHAR(7) DEFAULT 'Unknown',  -- 0: Male, 1: Female, Null: Unknown
    IsDeletedFlag TINYINT(1) NOT NULL DEFAULT 0 -- 0: hoạt động, 1: đã xóa
);
