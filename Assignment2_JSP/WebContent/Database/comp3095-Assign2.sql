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

CREATE TABLE ATTENDANCE
(
	attendance_ID INT (11) AUTO_INCREMENT PRIMARY KEY,
    employee_ID_FK INT (11) NOT NULL,
    present1 BIT, #0 represents not present, 1 represents present
    present2 BIT,
    present3 BIT,
    FOREIGN KEY (employee_ID_FK) REFERENCES EMPLOYEE(employeE_ID) ON DELETE CASCADE
);

#Reports Template Table

CREATE TABLE REPORT_TEMPLATE
(
  template_ID INT (11) AUTO_INCREMENT PRIMARY KEY,
  department_name VARCHAR (255) NOT NULL,
  template_name VARCHAR (255) NOT NULL,
  template_date VARCHAR (255) NOT NULL,

  Section1 VARCHAR (255) NOT NULL,
  Section2 VARCHAR(255),
  Section3 VARCHAR(255),

  Criteria11 VARCHAR(255) NOT NULL,
Maximum11 int (5),
Criteria12 VARCHAR(255),
  Maximum12 int (5),
Criteria13 VARCHAR(255),
  Maximum13 int (5),
Criteria14 VARCHAR(255),
  Maximum14 int (5),
Criteria15 VARCHAR(255),
  Maximum15 int (5),


  Criteria21 VARCHAR(255),
Maximum21 int (5),
Criteria22 VARCHAR(255),
  Maximum22 int (5),
Criteria23 VARCHAR(255),
  Maximum23 int (5),


  Criteria31 VARCHAR(255),
Maximum31 int (5),
Criteria32 VARCHAR(255),
  Maximum32 int (5),
Criteria33 VARCHAR(255),
  Maximum33 int (5)
);

#Report Table

CREATE TABLE REPORT
(

rep_ID INT (11) AUTO_INCREMENT PRIMARY KEY



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

#Add text ReportTemplates

INSERT INTO REPORT_TEMPLATE (department_name, template_name, template_date, Section1, Section2, Section3,Criteria11,Maximum11,Criteria12,Maximum12,Criteria13,Maximum13,Criteria14,Maximum14,Criteria15,Maximum15,Criteria21,Maximum21,Criteria22,Maximum22,Criteria23,Maximum23,Criteria31,Maximum31,Criteria32,Maximum32,Criteria33,Maximum33) VALUES
('Database Development', 'Flare Team Review', '11/07/2016','Contribution','Responsibility','Value','Research and Gathering',5,'Sharing Information',5,'Using Time Wisely',5,'Ready to Work',5,NULL,NULL,'FulFill Teams Role',5,'Sharing Work Equally',5,'Helping Team Members',5,'Listen to Others',5,'Include Teammates',5,'Make Fair Decisions',5);

