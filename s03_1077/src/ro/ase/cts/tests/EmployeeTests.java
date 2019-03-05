package ro.ase.cts.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import ro.ase.cts.exceptions.InvalidSalaryException;
import ro.ase.cts.exceptions.InvalidTitleException;
import ro.ase.cts.model.Employee;
import ro.ase.cts.model.EmployeeType;;
public class EmployeeTests {

	@Test
	public void testBonusForCEO() {
		Employee employee = new Employee("John Doe", 10000, EmployeeType.CEO);
		try {
			assertEquals(2000, employee.computeEmployeeBonus(), 0.0001);
		} catch (InvalidTitleException e) {
			e.printStackTrace();
		} catch (InvalidSalaryException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testBonusForCTO() {
		Employee employee = new Employee("John Doe", 10000, EmployeeType.CTO);
		try {
			assertEquals(1500, employee.computeEmployeeBonus(), 0.0001);
		} catch (InvalidTitleException e) {
			e.printStackTrace();
		} catch (InvalidSalaryException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testBonusForCFO() {
		Employee employee = new Employee("John Doe", 10000, EmployeeType.CFO);
		try {
			assertEquals(1000, employee.computeEmployeeBonus(), 0.0001);
		} catch (InvalidTitleException e) {
			e.printStackTrace();
		} catch (InvalidSalaryException e) {
			e.printStackTrace();
		}	
	}
	
	@Test
	public void testBonusForManager() {
		Employee employee = new Employee("John Doe", 10000, EmployeeType.MANAGER);
		try {
			assertEquals(700, employee.computeEmployeeBonus(), 0.0001);
		} catch (InvalidTitleException e) {
			e.printStackTrace();
		} catch (InvalidSalaryException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testBonusForTeamlead() {
		Employee employee = new Employee("John Doe", 10000, EmployeeType.TEAM_LEAD);
		try {
			assertEquals(500, employee.computeEmployeeBonus(), 0.0001);
		} catch (InvalidTitleException e) {
			e.printStackTrace();
		} catch (InvalidSalaryException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testBonusForJunior() {
		Employee employee = new Employee("John Doe", 10000, EmployeeType.JUNIOR);
		try {
			assertEquals(1000, employee.computeEmployeeBonus(), 0.0001);
		} catch (InvalidTitleException e) {
			e.printStackTrace();
		} catch (InvalidSalaryException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testBonusForSclav() {
		Employee employee = new Employee("John Doe", 10000, EmployeeType.SCLAV);
		try {
			employee.computeEmployeeBonus();
			fail("The method should not work with the specified title");
		} catch (InvalidTitleException e) {
			e.getMessage();
		} catch (InvalidSalaryException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testBonusForNegativeSalary() {
		Employee employee = new Employee("John Doe", -10000, EmployeeType.SCLAV);
		try {
			employee.computeEmployeeBonus();
			fail("The method should not work with the specified salary");
		} catch (InvalidTitleException | InvalidSalaryException e) {
			e.printStackTrace();
		}
	}
	
}
