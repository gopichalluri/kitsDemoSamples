package com.ems.service;

import java.sql.SQLException;
import java.util.List;

import com.ems.dao.EmployeeDao;
import com.ems.dao.EmployeeDaoImpl;
import com.ems.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	EmployeeDao empDao= new EmployeeDaoImpl(); // MYSQL --> 
	//EmployeeDaoOracle  empDao= new EmployeeDaoImplOracle(); // ORACLE  -->
	
	@Override
	public void addEmployee(Employee e) throws SQLException {
		
		empDao.addEmployee(e);
	}

	@Override
	public void deleteEmployee(int empId) throws SQLException{
		empDao.deleteEmployee(empId);
		
	}

	@Override
	public void updateEmployee(Employee e) throws SQLException{
		empDao.updateEmployee(e);
		
	}

	@Override
	public Employee findEmployee(Employee e)throws SQLException {
		
		return empDao.findEmployee(e);
	}

	@Override
	public List<Employee> allEmpDetails() throws SQLException {
		
		return empDao.allEmpDetails();
	}

}
