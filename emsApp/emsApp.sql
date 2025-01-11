create database fastTraining;
use fastTraining;
create table employee(empId int primary key,
						empName varchar(20) not null,
						designation varchar(20) not null,
						daysattened int not null);