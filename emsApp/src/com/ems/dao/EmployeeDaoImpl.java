package com.ems.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ems.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	private Connection con=null;
	private PreparedStatement pst=null;
	private ResultSet rs=null;
	
	String insertRecord="insert into Employee values(?,?,?,?)";
	String updateRecord="update employee set empName=?,designation=?,daysAttended=? where empId=?";
	String deleteRecord="delete from employee where empId=?";
	String findByEmpId="select *from employee where empId=?";
	String showAllEmpRecords="select *from employee";
	public EmployeeDaoImpl()   {
		
		super();
		try {
			//Class.forName(EmployeeDao.DB_DRIVERCLASS);
			con=DriverManager.getConnection(EmployeeDao.DB_URL,
											EmployeeDao.DB_USERNAME,
											EmployeeDao.DB_PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		//catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
	}

	@Override
	public void addEmployee(Employee e) throws SQLException {
		int noOfRecordsInserted=0;
		
		pst=con.prepareStatement(insertRecord);
		pst.setInt(1, e.getEmpId());
		pst.setString(2, e.getEmpName());
		pst.setString(3, e.getDesignation());
		pst.setInt(4, e.getDaysAttended());
		
		noOfRecordsInserted=pst.executeUpdate(); // int 
		if(noOfRecordsInserted>0)
		{
			System.out.println(noOfRecordsInserted+ "Records inserted ");
		}
		
		
	}

	@Override
	public void updateEmployee(Employee e) throws SQLException {
		int noOfRecordsUpdated=0;
		pst=con.prepareStatement(updateRecord);
		pst.setInt(4, e.getEmpId());
		pst.setString(1, e.getEmpName());
		pst.setString(2,e.getDesignation());
		pst.setInt(3, e.getDaysAttended());
		noOfRecordsUpdated=pst.executeUpdate();
		if(noOfRecordsUpdated>0)
		{
			System.out.println(noOfRecordsUpdated+ "Records inserted ");
		}
		
	}

	@Override
	public void deleteEmployee(int empId) throws SQLException {
		
		int noOfRecordsDeleted=0;
		pst=con.prepareStatement(deleteRecord);
		pst.setInt(1, empId);
		noOfRecordsDeleted=pst.executeUpdate();
		if(noOfRecordsDeleted>0)
		{
			System.out.println(noOfRecordsDeleted+ "Records inserted ");
		}
	}

	@Override
	public Employee findEmployee(Employee e) throws SQLException {
		
		Employee emp=null;
		pst=con.prepareStatement(findByEmpId);
		pst.setInt(1, e.getEmpId());
		rs=pst.executeQuery();
		
		emp=new Employee();
		emp.setEmpName(rs.getString("empName"));
		emp.setDesignation(rs.getString("designation"));
		emp.setDaysAttended(rs.getInt("daysattended"));
		return emp;
	}

	@Override
	public List<Employee> allEmpDetails() throws SQLException {
		
		Employee allEmp=null;
		List<Employee>empList=new ArrayList<>();
		pst=con.prepareStatement(showAllEmpRecords);
		rs=pst.executeQuery();
		while(rs.next())
		{
			allEmp=new Employee();
			allEmp.setEmpId(rs.getInt("empId"));
			allEmp.setEmpName(rs.getString("empName"));
			allEmp.setDesignation(rs.getString("designation"));
			allEmp.setDaysAttended(rs.getInt("daysattened"));
			empList.add(allEmp);
		}
		
		return empList;
	}

}
