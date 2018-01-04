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
    department_Description VARCHAR(255),
    department_Room INT(5),
    department_Floor INT(5),
    department_Head VARCHAR(255),
    department_Extension INT(5) UNIQUE
);

#EMPLOYEE
CREATE TABLE EMPLOYEE
(
	employee_ID INT (11) AUTO_INCREMENT PRIMARY KEY,
  department_ID_FK INT (11),
    employee_FirstName VARCHAR(255),
    employee_LastName VARCHAR(255),
    employee_Role VARCHAR(20),
    employee_Email VARCHAR(20),
    employee_PhoneNumber VARCHAR(20),
    employee_YearHired VARCHAR (4),
	FOREIGN KEY (department_ID_FK) REFERENCES DEPARTMENT(department_ID) ON DELETE CASCADE
);

#GROUPS
CREATE TABLE GROUPS
(
	group_ID INT(11) AUTO_INCREMENT PRIMARY KEY,
  department_ID_FK INT (11) NOT NULL ,
    group_Name VARCHAR(255) UNIQUE,
    group_Manager VARCHAR(255),
    group_Role VARCHAR(55),
    group_Description VARCHAR(255),
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
