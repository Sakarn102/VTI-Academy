use FresherManager;

-- Question 1: Thêm ít nhất 10 bản ghi vào table
INSERT INTO `freshermanager`.`trainee` (`Full_Name`, `Birth_Date`, `Gender`, `ET_IQ`, `ET_Gmath`, `ET_English`, `Training_Class`, `Evaluation_Notes`) 
VALUES 
	('Nguyen Tuan Anh', '2002-02-01', 'male', '20', '20', '50', 'VT1', 'Pass'),
	('Nguyễn Minh Khoa', '2001-07-22', 'male', '17', '10', '30', 'VT2', 'Pass'),
	('Trần Thị Thu Hằng', '1995-11-09', 'female', '10', '20', '40', 'VT3', 'Fail'),
	('Lê Văn Đức', '2000-01-30', 'male', '15', '19', '27', 'DA1', 'Pass'),
	('Phạm Ngọc Bích', '1992-06-18', 'female', '20', '20', '50', 'DA2', 'Pass'),
	('Hoàng Anh Dũng', '1999-12-05', 'male', '9', '19', '30', 'DA3', 'Fail'),
	('Đỗ Thị Mai Linh', '1996-08-24', 'female', '10', '20', '37', 'BA1', 'Fail'),
	('Bùi Quốc Huy', '2002-04-12', 'male', '20', '28', '48', 'BA2', 'Pass'),
	('Đặng Gia Hân', '1993-09-27', 'female', '19', '19', '49', 'BA3', 'Pass'),
	('Ngô Thanh Phong', '1997-10-03', 'male', '17', '17', '47', 'Master', 'Pass');

-- Question 2: Viết lệnh để lấy ra tất cả các thực tập sinh đã vượt qua bài test đầu vào, nhóm chúng thành các tháng sinh khác nhau
SELECT 
    trainee_id, full_name, birth_date, MONTH(birth_date) AS note
FROM
    Trainee
WHERE
    Evaluation_Notes = 'Pass'
ORDER BY birth_date;

-- Question 3: Viết lệnh để lấy ra thực tập sinh có tên dài nhất, lấy ra các thông tin sau: tên, tuổi, các thông tin cơ bản (như đã được định nghĩa trong table)
SELECT 
    *
FROM
    trainee
ORDER BY full_name DESC
LIMIT 1;

-- Question 4: Viết lệnh để lấy ra tất cả các thực tập sinh là ET, 1 ET thực tập sinh là những người đã vượt qua bài test đầu vào và thỏa mãn số điểm như sau: 
-- ET_IQ + ET_Gmath>=20 ET_IQ>=8, 
-- ET_Gmath>=8 ET_English>=18
SELECT 
    *
FROM
    trainee
WHERE
		ET_IQ + ET_Gmath >= 20 AND ET_IQ >= 8
        AND ET_Gmath >= 8
        AND ET_English >= 18;

-- Question 5: xóa thực tập sinh có TraineeID = 3
DELETE FROM trainee 
WHERE
    trainee_id = 3;

-- Question 6: Thực tập sinh có TraineeID = 5 được chuyển sang lớp "2". Hãy cập nhật thông tin vào database
UPDATE trainee 
SET 
    training_class = '2'
WHERE
    trainee_id = 5;
