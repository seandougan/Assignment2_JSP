#This line ensures database is remade everytime script is run
DROP DATABASE IF EXISTS COMP3095;
CREATE DATABASE IF NOT EXISTS COMP3095;
#Once created, declare the the schema context with using directive
USE COMP3095;
#Must add amin user here, otherwise not guarenteed that user will exist
CREATE USER IF NOT EXISTS 'admin' IDENTIFIED BY 'admin';
GRANT ALL ON COMP3095.* TO 'admin'@'localhost' IDENTIFIED BY 'admin'; 
#THIS SECTION WILL CREATE THE TABLES, RELATIONS AND CONSTAINTS IN THE DB
#Users who are authorized to use service
CREATE TABLE USERS 
( 
	id int(11) AUTO_INCREMENT PRIMARY KEY, 
	firstname varchar(255),
	lastname varchar(255),
	email varchar(255), 
	role varchar(20),
	username varchar(20),
	password varchar(20)	
);

#DEPARTMENT
CREATE TABLE DEPARTMENT
(
	department_ID int(11) AUTO_INCREMENT PRIMARY KEY,
    department_Name VARCHAR(255) UNIQUE,
    department_Floor INT(5)
);

#EMPLOYEE
CREATE TABLE EMPLOYEE
(
	employee_ID INT (11) AUTO_INCREMENT PRIMARY KEY,
	department_ID_FK INT (11),
    employee_FirstName VARCHAR(255),
    employee_LastName VARCHAR(255),
    employee_Role VARCHAR(20),
    employee_Email VARCHAR(255),
    employee_PhoneNumber VARCHAR(20),
    employee_YearHired VARCHAR (4),
	FOREIGN KEY (department_ID_FK) REFERENCES DEPARTMENT(department_ID) ON DELETE CASCADE
);

#GROUPS
CREATE TABLE GROUPS
(
	group_ID INT(11) AUTO_INCREMENT PRIMARY KEY,
	department_ID_FK INT (11) ,
	group_Name VARCHAR(255) UNIQUE,
	group_Manager VARCHAR(255),
	group_Role VARCHAR(55),
	group_Description VARCHAR(255),
	group_Employee1 VARCHAR(40),
	group_Employee2 VARCHAR(40),
	group_Employee3 VARCHAR(40),
	group_Employee4 VARCHAR(40),
	group_Employee5 VARCHAR(40),
	group_Employee6 VARCHAR(40),
	group_Department VARCHAR(255) ,
	FOREIGN KEY (department_ID_FK) REFERENCES DEPARTMENT(department_ID) ON DELETE CASCADE
);

#EMPLOYEE_GROUPS JUNCTION TABLE
CREATE TABLE EMPLOYEE_GROUPS
(
	employee_group_ID INT(11) AUTO_INCREMENT PRIMARY KEY,
	department_ID_FK INT (11),
	employee_ID_FK INT (11),
	FOREIGN KEY (department_ID_FK) REFERENCES DEPARTMENT(department_ID) ON DELETE CASCADE,
	FOREIGN KEY (employee_ID_FK) REFERENCES EMPLOYEE(employee_ID) ON DELETE CASCADE
);

CREATE TABLE ATTENDANCE
(
    employee_ID_FK INT (11) NOT NULL PRIMARY KEY,
    present1 BIT, #0 represents not present, 1 represents present
    present2 BIT,
    present3 BIT,
    FOREIGN KEY (employee_ID_FK) REFERENCES EMPLOYEE(employeE_ID) ON DELETE CASCADE
);


#This Section will add necessary records for testing to the DB
#ADDS USERS
#Adding admin to users
INSERT INTO USERS(firstname, lastname, email, role, username, password) VALUES
(NULL, NULL, 'admin@domain.ca', 'administrator', 'admin', 'admin');
#add sergio to users
INSERT INTO USERS(firstname, lastname, email, role, username, password) VALUES
('Sergio', 'Santilli', 'sergio.santilli@georgebrown.ca', 'instructor', 'sergio', 'santilli');
#add sean dougan to users
INSERT INTO USERS(firstname, lastname, email, role, username, password) VALUES
('Sean', 'Dougan', 'sean.dougan@georgebrown.ca', 'student', 'sean', 'dougan');
#add greg uchitel to users
INSERT INTO USERS(firstname, lastname, email, role, username, password) VALUES
('Gregory', 'Uchitel', 'gregory.uchitel@georgebrown.ca', 'student', 'gregory', 'uchitel');
#add james massel to users
INSERT INTO USERS(firstname, lastname, email, role, username, password) VALUES
('James', 'massel', 'james.massel@georgebrown.ca', 'student', 'james', 'massel');
#add matthew mccarthy to users
INSERT INTO USERS(firstname, lastname, email, role, username, password) VALUES
('Matthew', 'McCarthy', 'matthew.mccarthy@georgebrown.ca', 'student', 'matthew', 'mccarthy');
#add michael van dyke to users
INSERT INTO USERS(firstname, lastname, email, role, username, password) VALUES
('Michael', 'Van Dyke', 'michael.vandyke@georgebrown.ca', 'student', 'michael', 'vandyke');

#Add dummy floors
INSERT INTO  DEPARTMENT(department_Name, department_Floor) VALUES
('Lobby', 1);
INSERT INTO  DEPARTMENT(department_Name, department_Floor) VALUES
('Web Development', 2);
INSERT INTO  DEPARTMENT(department_Name, department_Floor) VALUES
('Database Development', 4);
INSERT INTO  DEPARTMENT(department_Name, department_Floor) VALUES
('Human Resources', 6);

#dummy employees
INSERT INTO EMPLOYEE(employee_ID, department_ID_FK, employee_FirstName, employee_LastName, employee_Role, employee_Email, employee_PhoneNumber, employee_YearHired) VALUES
(20139568, 1, 'John', 'Doe', 'Team Lead', 'john.doe@gmaill.com', 4165524125, 2017);
INSERT INTO EMPLOYEE(employee_ID, department_ID_FK, employee_FirstName, employee_LastName, employee_Role, employee_Email, employee_PhoneNumber, employee_YearHired) VALUES
(20139587, 1, 'David', 'Tatum', 'Web Dev', 'dtatum@hotmail.com', 6478596352, 2015);
INSERT INTO EMPLOYEE(employee_ID, department_ID_FK, employee_FirstName, employee_LastName, employee_Role, employee_Email, employee_PhoneNumber, employee_YearHired) VALUES
(20139741, 2, 'Avery', 'Mollis', 'Database Technician', 'ave-mollis87@gmail.com', 6473529658, 2014);


INSERT INTO Groups(group_Name, group_Department, group_Employee1, group_Employee2, group_Employee3, group_Employee4, group_Employee5, group_Employee6) VALUES('The Seinfields', 'Accounting', 'jeff hobson', 'chester tester', 'e t', 'rob robertson', 'jane janeson', 'who whosom');
INSERT INTO Groups(group_Name, group_Department, group_Employee1, group_Employee2, group_Employee3, group_Employee4, group_Employee5, group_Employee6) VALUES('The Cats', 'Finance', 'jeff bridges', 'the rock', 'E T', 'jason smith', 'jane doe', 'first last');


INSERT INTO ATTENDANCE(employee_ID_FK, present1, present2, present3) VALUES
(20139568, 1, 1, 1);
INSERT INTO ATTENDANCE(employee_ID_FK, present1, present2, present3) VALUES
(20139587, 1, 1, 0);
INSERT INTO ATTENDANCE(employee_ID_FK, present1, present2, present3) VALUES
(20139741, 0, 1, 1);