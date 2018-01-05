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

#Reports Template Table

CREATE TABLE REPORT_TEMPLATE
(
  template_ID INT (11) AUTO_INCREMENT PRIMARY KEY,
  department_ID_FK INT (11) NOT NULL,
  template_Date DATE NOT NULL ,
  Section VARCHAR(255) NOT NULL,
FOREIGN KEY (department_ID_FK) REFERENCES DEPARTMENT(department_ID) ON DELETE CASCADE
);

#Input Section

CREATE TABLE SECTION
(
  Section_ID INT (11) AUTO_INCREMENT PRIMARY KEY,
  template_ID_FK INT (11) NOT NULL,
Criteria1 VARCHAR(255) NOT NULL,
Maximum1 int (5),
Critera2 VARCHAR(255),
  Maximum2 int (5),
Critera3 VARCHAR(255),
  Maximum3 int (5),
Critera4 VARCHAR(255),
  Maximum4 int (5),
Critera5 VARCHAR(255),
  Maximum5 int (5),
  FOREIGN KEY (template_ID_FK) REFERENCES DEPARTMENT(template_ID) ON DELETE CASCADE
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