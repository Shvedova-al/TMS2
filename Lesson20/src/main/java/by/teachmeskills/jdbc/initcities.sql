--  DDL for Table cities
--------------------------------------------------------
DROP TABLE IF EXISTS students_db.cities;
CREATE TABLE IF NOT EXISTS students_db.cities (
    id INT NOT NULL AUTO_INCREMENT,
    city VARCHAR(45) NOT NULL,
    PRIMARY KEY (id));

--------------------------------------------------------
--  DML for Table cities
--------------------------------------------------------
INSERT INTO students_db.cities(city) VALUES('Minsk');
INSERT INTO students_db.cities(city) VALUES('Grodno');
INSERT INTO students_db.cities(city) VALUES('Polotsk');
INSERT INTO students_db.cities(city) VALUES('Bobruisk');
INSERT INTO students_db.cities(city) VALUES('Slutsk');