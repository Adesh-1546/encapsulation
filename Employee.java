package com.encapsulation.assgn;

/*Write a Java program to create a class called Employee with private instance variables employee_id,
 *  employee_name, and employee_salary. Provide public getter and setter methods to access and modify
 *   the id and name variables,
 *  but provide a getter method for the salary variable that returns a formatted string
 */

public class Employee {
	  private int employee_id;
	  private String employee_name;
	  private double employee_salary;

	  // Getter method for employee_id
	  public int getEmployeeId() {
	    return employee_id;
	  }

	  // Setter method for employee_id
	  public void setEmployeeId(int employeeId) {
	    this.employee_id = employeeId;
	  }

	  // Getter method for employee_name
	  public String getEmployeeName() {
	    return employee_name;
	  }
	// Setter method for employee_name
	  public void setEmployeeName(String employeeName) {
	    this.employee_name = employeeName;
	  }

	  // Getter method for employee_salary
	  public double getEmployeeSalary() {
	    return employee_salary;
	  }

	  // Setter method for employee_salary
	  public void setEmployeeSalary(double employeeSalary) {
	    this.employee_salary = employeeSalary;
	  }

	  // Method to get formatted salary as a String
	  public String getFormattedSalary() {
	    return String.format("$%.2f", employee_salary);
	  }


}
