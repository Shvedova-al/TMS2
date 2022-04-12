--------------------------------------------------------
--  DDL for schema products_db
--------------------------------------------------------
DROP SCHEMA IF EXISTS products_db;
CREATE SCHEMA IF NOT EXISTS products_db;

--------------------------------------------------------
--  DDL for Table products_db
--------------------------------------------------------
DROP TABLE IF EXISTS products_db.products;
CREATE TABLE IF NOT EXISTS products_db.products (
    id INT NOT NULL AUTO_INCREMENT,
    title VARCHAR(20) NOT NULL,
    description VARCHAR(200) NOT NULL,
    price INT NOT NULL,
    amount INT NOT NULL,
    inStock VARCHAR (20) NOT NULL,
    PRIMARY KEY (id));

--------------------------------------------------------
--  DML for Table products_db
--------------------------------------------------------
INSERT INTO products_db.products(title, description, price, amount, inStock) VALUES('ручка', 'синяя, для левши', 6, 24, 'в наличии');
INSERT INTO products_db.products(title, description, price, amount, inStock) VALUES('ручка', 'синяя, для правши', 6, 0, 'нет на складе');
INSERT INTO products_db.products(title, description, price, amount, inStock) VALUES('карандаши', 'цветные, 24шт', 12, 53, 'в наличии');
INSERT INTO products_db.products(title, description, price, amount, inStock) VALUES('пластилин', 'восковый, 18цветов', 14, 9, 'в наличии');
INSERT INTO products_db.products(title, description, price, amount, inStock) VALUES('краски', 'акварельные, перламутровые, 12 цветов', 11, 19, 'в наличии');
INSERT INTO products_db.products(title, description, price, amount, inStock) VALUES('цветная бумага', 'флюорисцентная, 14 листов', 11, 2, 'в наличии');