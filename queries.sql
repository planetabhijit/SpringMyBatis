CREATE DATABASE springmybatis;

USE springmybatis;

CREATE TABLE employee
(
id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,

fullname VARCHAR(50) NOT NULL,

email VARCHAR(50) NOT NULL,

gender VARCHAR(50) NOT NULL,

hobbiees VARCHAR(50) NOT NULL,

country VARCHAR(50) NOT NULL,

address VARCHAR(50) NOT NULL,
);

select * from employee;