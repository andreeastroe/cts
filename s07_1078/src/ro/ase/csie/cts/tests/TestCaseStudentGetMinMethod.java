package ro.ase.csie.cts.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.csie.cts.exceptions.MathException;
import ro.ase.csie.cts.exceptions.StudentException;
import ro.ase.csie.cts.models.Student;

public class TestCaseStudentGetMinMethod {

	Student student;
	
	@Before
	public void setUp() throws Exception {
		this.student = new Student();
	}

	@Test
	public void testGetMinGradeCrossCheck() throws StudentException, MathException {
		Random random = new Random();
		int noGrades = 20;
		ArrayList<Integer> grades = new ArrayList<>();
		for(int i=0; i<=noGrades; i++) {
			grades.add(random.nextInt(11));
		}
		student.setGrades(grades);
		int expectedValue = Collections.min(student.getGrades());
		int actualValue = student.getMinGrade();
		assertEquals(expectedValue, actualValue);
	}
	
	//@Test
	public void testGetMinGradeInverse() {
		// set the sign of the values to - and compute the max, check if the absolute values are equal
	}
	
	@Category(ImportantTest.class)
	@Test
	public void testConstructorInverse() {
		String testName = "John";
		int testAge = 23;
		ArrayList<Integer> testGrades = new ArrayList<>();
		student = new Student(testGrades, testName, testAge);

		assertNotNull(student.getName());
		assertNotNull(student.getGrades());
		assertNotEquals(0, student.getAge());
	}

}
