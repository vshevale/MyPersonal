drop database if EXISTS vishal;
create database vishal;
use vishal;


DROP TABLE IF EXISTS userdetails;

CREATE TABLE userdetails (
  UserID int(11) NOT NULL AUTO_INCREMENT,
  Username varchar(20) NOT NULL,
  Password varchar(20) NOT NULL,
  FirstName varchar(20) DEFAULT NULL,
  LastName varchar(20) DEFAULT NULL,
  EmailID varchar(50) DEFAULT NULL,
  ContactNo varchar(15) DEFAULT NULL,
  PRIMARY KEY (UserID)  
) AUTO_INCREMENT = 1000;


DROP TABLE IF EXISTS customer;

CREATE TABLE customer (
  CustomerID int(11) NOT NULL AUTO_INCREMENT,
  FirstName varchar(20) DEFAULT NULL,
  LastName varchar(20) DEFAULT NULL,
  EmailID varchar(50) DEFAULT NULL,
  ContactNo varchar(15) DEFAULT NULL,
  DueAmount int(10)  DEFAULT NULL,
  PRIMARY KEY (CustomerID)  
);


DROP TABLE IF EXISTS worker;

CREATE TABLE worker (
  WorkerID int(11) NOT NULL AUTO_INCREMENT,
  FirstName varchar(150) DEFAULT NULL,
  LastName varchar(150) DEFAULT NULL,
  ContactNo varchar(15) DEFAULT NULL,
  TotalSalary int(10) DEFAULT NULL,
  PaidSalary int(10) DEFAULT NULL,
  PRIMARY KEY (WorkerID)  
);




DROP TABLE IF EXISTS salaryDetails;

CREATE TABLE salaryDetails (
  SalaryID int(11) NOT NULL AUTO_INCREMENT,
  WorkerID int(11) DEFAULT NULL,
  Note varchar(200) DEFAULT NULL,
  PayDate datetime DEFAULT NULL,
  PayMonth int(10) DEFAULT NULL,
  PRIMARY KEY (SalaryID)  
);



DROP TABLE IF EXISTS bill;

CREATE TABLE bill (
  BillID int(11) NOT NULL AUTO_INCREMENT,
  CustomerID int(11) DEFAULT NULL,
  BillDate datetime DEFAULT NULL,
  TotalDimention int(10) DEFAULT NULL,
  Rate int(10) DEFAULT NULL,
  BillAmount int(10) DEFAULT NULL,
  PaidMount int(10) DEFAULT NULL,
  DueAmount int(10) DEFAULT NULL,
  PRIMARY KEY (BillID)  
);



DROP TABLE IF EXISTS dimension;

CREATE TABLE dimension (
  DimensionID int(11) NOT NULL AUTO_INCREMENT,
  BillID int(11) DEFAULT NULL,
  Value1 int(10) DEFAULT NULL,
  Value2 int(10) DEFAULT NULL,
  CalculatedValue int(10) DEFAULT NULL,
  PRIMARY KEY (DimensionID)  
);

ALTER TABLE bill ADD CONSTRAINT fk_customer_id FOREIGN KEY (CustomerID) REFERENCES customer(CustomerID);
ALTER TABLE dimension ADD CONSTRAINT fk_bill_id FOREIGN KEY (BillID) REFERENCES bill(BillID);
ALTER TABLE salaryDetails ADD CONSTRAINT fk_salary_id FOREIGN KEY (WorkerID) REFERENCES worker(WorkerID);