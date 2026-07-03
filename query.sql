CREATE DATABASE employee_db;
USE employee_db;

CREATE TABLE Department
(
    department_id INT PRIMARY KEY,
    department_name VARCHAR(50)
);
CREATE TABLE Employee
(
    employee_id INT PRIMARY KEY,
    employee_name VARCHAR(100),
    email VARCHAR(100),
    salary DOUBLE,
    joining_date DATE,
    department_id INT,
    manager_id INT,

    FOREIGN KEY(department_id)
    REFERENCES Department(department_id)
);

INSERT INTO Department VALUES
(1,'HR'),
(2,'IT'),
(3,'Finance');

SELECT * FROM Department;


INSERT INTO Employee VALUES
(101,'Rahul','rahul@gmail.com',40000,'2024-01-10',1,NULL),

(102,'Priya','priya@gmail.com',60000,'2023-05-20',2,101),

(103,'Aman','aman@gmail.com',80000,'2022-08-18',2,101),

(104,'Neha','neha@gmail.com',50000,'2021-06-22',3,NULL),

(105,'Riya','riya@gmail.com',90000,'2020-04-11',3,104);

SELECT * FROM Employee;
