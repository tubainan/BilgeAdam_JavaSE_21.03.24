--Tabloya yeni kolon ekleme, mevcut kolonu değiştirme veya silme;
--EKLEME
ALTER TABLE cars 
ADD color VARCHAR(255);

SELECT * FROM cars;

--SİLME
ALTER TABLE cars
DROP color;

--DEĞİŞTİRME
ALTER TABLE cars
RENAME COLUMN color TO colorrrr;

--VERI TURUNU DEGİSTİRME
ALTER TABLE cars
ALTER COLUMN color TYPE VARCHAR(150);
