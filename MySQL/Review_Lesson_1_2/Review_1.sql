drop database if exists Review_Lession_1_2;
create database if not exists Review_Lession_1_2;
use Review_Lession_1_2;

-- Table 1: Sinh vien
drop database if exists Student;
create table Student (
	student_id tinyint unsigned auto_increment primary key,
    student_name nvarchar(50)
);

drop database if exists StudentCard;
create table StudentCard (
	card_id tinyint unsigned auto_increment primary key,
    student_id tinyint unsigned not null,
    foreign key (student_id) references Student (student_id)
);

drop database if exists Subject;
create table Subject (
	subject_id tinyint unsigned auto_increment primary key,
    subject_name nvarchar(50)
);

drop database if exists Student_Subject;
create table Student_Subject (
	student_id tinyint unsigned not null,
    subject_id tinyint unsigned not null,
    primary key (studen_id, subject_id),
    foreign key (student_id) references Student (student_id),
    foreign key (subject_id) references Subject (subject_id)
);

drop database if exists Book;
create table Book (
	book_id tinyint unsigned auto_increment primary key,
    book_name nvarchar(50),
    student_id tinyint unsigned not null,
    foreign key (student_id) references Student (student_id)
);

drop database if exists Student_Book;
create table Student_Book (
	student_id tinyint unsigned not null,
    book_id tinyint unsigned not null,
    book_name nvarchar(50),
     primary key (studen_id, book_id),
     foreign key (student_id) references Student (student_id),
     foreign key (book_id) references Book (book_id)
);


-- lấy ds sinh viên và tên sách mỗi sv mượn
SELECT 
    s.student_id, s.tudent_name, b.book_name
FROM
    student s
        INNER JOIN
    book b ON s.student_id = b.student_id;

-- liệt kê tất cả các sinh viên và tên sách mà họ đã mượn (nếu có). Đối với sinh viên không mượn sách, hiển thị NULL trong cột tên sách
SELECT 
    s.student_id, s.student_name, sb.book_name
FROM
    student s
        LEFT JOIN
    student_book sb ON s.student_id = sb.student_id;

-- liệt kê tất cả các sách và tên sinh viên mà họ đã mượn sách đó (nếu có). Đối với sách không được mượn, hiển thị NULL trong cột tên sinh viên
SELECT 
    b.book_name, s.student_name
FROM
    student s
        LEFT JOIN
    book b ON s.student_id = b.student_id;
	

