package com.ems.presentation;

import java.sql.SQLException;
import java.util.List;

import com.ems.model.Employee;
import com.ems.service.EmployeeService;
import com.ems.service.EmployeeServiceImpl;

public class EmployeeMain {

	public static void main(String[] args) throws SQLException {
		
		EmployeeService empService=new EmployeeServiceImpl();
		empService.addEmployee(new Employee(2920,"GopiChalluri","Trainer",22));
		empService.addEmployee(new Employee(2921,"Mahesh","Trainer",28));
		empService.addEmployee(new Employee(2922,"Raghu","Trainer",21));
		empService.addEmployee(new Employee(2923,"Pritam","Trainer",30));
		
		System.out.println("EmployeeDetails are ");
		List<Employee> empList=empService.allEmpDetails();
		for(Employee e: empList)
		{
			System.out.println(e.getEmpId()+"-"+e.getEmpName()+"-"+e.getDesignation()+"-"+e.getDaysAttended());
		}
		

	}

}
