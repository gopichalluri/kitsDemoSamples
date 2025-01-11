package com.ems.service;

import java.sql.SQLException;
import java.util.List;

import com.ems.model.Employee;

public interface EmployeeService
{
public void addEmployee(Employee e) throws SQLException;
public void deleteEmployee(int empId) throws SQLException;
public void updateEmployee(Employee e)throws SQLException;
public Employee findEmployee(Employee e)throws SQLException;
public List<Employee> allEmpDetails()throws SQLException;

}
