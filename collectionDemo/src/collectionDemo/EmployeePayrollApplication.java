package collectionDemo;
import java.util.ArrayList;
import java.util.List;

// Base class for Employee
abstract class Employee {
private int id;
private String name;

public Employee(int id, String name) {
this.id = id;
this.name = name;
}

public int getId() {
return id;
}

public String getName() {
return name;
}

// Abstract method to calculate salary
public abstract double calculateSalary();
}

// Full-Time Employee Class
class FullTimeEmployee extends Employee {
private double monthlySalary;

public FullTimeEmployee(int id, String name, double monthlySalary) {
super(id, name);
this.monthlySalary = monthlySalary;
}

@Override
public double calculateSalary() {
return monthlySalary;
}
}

// Part-Time Employee Class
class PartTimeEmployee extends Employee {
private double hourlyRate;
private int hoursWorked;

public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
super(id, name);
this.hourlyRate = hourlyRate;
this.hoursWorked = hoursWorked;
}

@Override
public double calculateSalary() {
return hourlyRate * hoursWorked;
}
}

// Payroll Manager using Generics
class PayrollManager<T extends Employee> {
private List<T> employees;

public PayrollManager() {
this.employees = new ArrayList<>();
}

// Add an employee to the list
public void addEmployee(T employee) {
employees.add(employee);
}

// Display all employees and their salaries
public void displayPayroll() {
System.out.println("Employee Payroll:");
for (T employee : employees) {
System.out.println("ID: " + employee.getId() +
", Name: " + employee.getName() +
", Salary: $" + employee.calculateSalary());
}
}
}

// Main Application
public class EmployeePayrollApplication {
public static void main(String[] args) {
// Create a Payroll Manager
PayrollManager<Employee> payrollManager = new PayrollManager<>();

// Add Full-Time Employees
payrollManager.addEmployee(new FullTimeEmployee(1, "Alice", 5000));
payrollManager.addEmployee(new FullTimeEmployee(2, "Bob", 6000));

// Add Part-Time Employees
payrollManager.addEmployee(new PartTimeEmployee(3, "Charlie", 20, 120));
payrollManager.addEmployee(new PartTimeEmployee(4, "Dave", 25, 100));

// Display the Payroll
payrollManager.displayPayroll();
}
}

