REM   Script: Session 01-sql
REM   Activity1,2,3,4,5

create table salesman(salesman_id int,salesman_name varchar2(20), salesman_city varchar(20),commission int);

create table salesman(salesman_id int,salesman_name varchar2(20), salesman_city varchar(20),commission int);

DESCRIBE salesman


INSERT INTO salesman(5001,'James Hoog','New York',15);

INSERT INTO salesman VALUES(5001,'James Hoog','New York',15);

DESCRIBE salesman


create table salesman(salesman_id int PRIMARY KEY,salesman_name varchar2(20), salesman_city varchar(20),commission int);

DROP TABLE salesman;

create table salesman(salesman_id int PRIMARY KEY,salesman_name varchar2(20) NOT NULL, salesman_city varchar(20),commission int);

DESCRIBE salesman


SELECT * FROM salesman;

INSERT INTO salesman VALUES(5001,'James Hoog','New York',15);

SELECT * FROM salesman;

INSERT ALL 
    NTO salesman VALUES(5002, 'Nail Knite', 'Paris', 15) 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

INSERT ALL 
    INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 15) 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

SELECT salesman_city, salesman_id FROM salesman;

SELECT * FROM salesman WHERE salesman_city ='Paris';

SELECT salesman_id, salesman_commission WHERE salesman_name='Paul Adam';

SELECT salesman_id, salesman_commission FROM salesman WHERE salesman_name='Paul Adam';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

ALTER TABLE salesman ADD grade int;

SELECT * FROM salesman;

SELECT * FROM salesman;

UPDATE salesman SET grade =100;

SELECT * FROM salesman;

UPDATE salesman SET grade = 200 WHERE salesman_city = 'Rome';

UPDATE salesman SET grade = 300 WHERE salesman_name = 'James Hoog';

SELECT * FROM salesman;

UPDATE salesman SET salesman_name = 'Pierre' WHERE salesman_name ='McLyon';

SELECT * FROM salesman;

