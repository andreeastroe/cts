package ro.ase.cts.model;

import ro.ase.cts.exceptions.InvalidSalaryException;
import ro.ase.cts.exceptions.InvalidTitleException;

public class Employee {

	private String completeName;
	private double salary;
	private EmployeeType employeeType;
	
	
	public Employee() {}
	
	public Employee(String completeName, double salary, EmployeeType employeeType) {
		this.completeName = completeName;
		this.salary = salary;
		this.employeeType = employeeType;
	}

	public String getCompleteName() {
		return completeName;
	}

	public void setCompleteName(String completeName) {
		this.completeName = completeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public EmployeeType getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}
	
	
	public double computeEmployeeBonus() throws InvalidTitleException, InvalidSalaryException {
		double bonus = 0;
		if(this.salary<0) {
			throw new InvalidSalaryException("Salary should be a positive number");
		}
		switch(this.employeeType) {
			case CEO:
				bonus =  0.20 * this.salary;				
				break;
			case CTO:
				bonus =  0.15 * this.salary;
				break;
			case CFO:
				bonus =  0.1 * this.salary;
				break;
			case MANAGER:
				bonus =  0.07 * this.salary;
				break;
			case TEAM_LEAD:
				bonus =  0.05 * this.salary;
				break;
			case JUNIOR:
				bonus =  0.1 * this.salary;
				break;
			default:
				throw new InvalidTitleException("Please implement the logic for " + this.employeeType.toString());
		}
		return bonus;
	}
}
