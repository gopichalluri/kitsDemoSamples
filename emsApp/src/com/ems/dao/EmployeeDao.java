package com.ems.dao;

import java.sql.SQLException;
import java.util.List;

import com.ems.model.Employee;

public interface EmployeeDao {
	//CRUD OPS-> 
	public void addEmployee(Employee e) throws SQLException;
	public void updateEmployee(Employee e) throws SQLException;
	public void deleteEmployee(int empId) throws SQLException;
	public Employee findEmployee(Employee e) throws SQLException;
	public List<Employee> allEmpDetails() throws SQLException;
	
	public static final String DB_URL="jdbc:mysql://localhost:3306/fastTraining";
	public static final String DB_USERNAME="root";
	public static final String DB_PASSWORD="root";
	public static final String DB_DRIVERCLASS="com.mysql.cj.jdbc.Driver";
	
	

}
