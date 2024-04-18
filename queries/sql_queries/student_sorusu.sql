--students tablosu oluşturalım 
--name, surname, grade
--5 tane öğrenci oluşturalım 
--öğremcilerden birisinin soyismini güncelleyelim 
--tabloya doğum yılı kolonu ekleyelim
--öğrencilerin herbirine bir doğum yili girelim (hepsinin doğduğu yıl aynı olacak)
--öğrencilerden birinin adını, soyadını ve doğum tarihini güncelleyelim
--5 öğrenciden birinin kaydını silelim
CREATE TABLE students(
name VARCHAR(20),
surname VARCHAR(10),
grade INT
);
SELECT * FROM students;

INSERT INTO students (name,surname,grade)
VALUES 
('Tuba','İnan',100),
('Gamze','Aytep',99),
('Ruveyda','Yılmaz',98),
('Ahmet Mucahit','İnan',97),
('Musti','Ruvi',96);
SELECT * FROM students;

UPDATE students
SET surname ='hasta'
WHERE name = 'Gamze' ;
SELECT * FROM students;

ALTER TABLE students
ADD dateBirth INT;
SELECT * FROM students;

UPDATE students
SET dateBirth =2000 ;
SELECT * FROM students;

UPDATE students
SET dateBirth = 2001,
	name ='Ahmet',
	surname ='Marka'
WHERE name = 'Ahmet Mucahit';
SELECT * FROM students;


DELETE FROM students
WHERE name= 'Tuba';
SELECT * FROM students;




