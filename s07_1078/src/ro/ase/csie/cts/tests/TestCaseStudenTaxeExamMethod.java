package ro.ase.csie.cts.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.csie.cts.exceptions.ExamException;
import ro.ase.csie.cts.mocks.ExamMock;
import ro.ase.csie.cts.models.Student;

public class TestCaseStudenTaxeExamMethod {
	
	Student student;

	@Before
	public void setUp() throws Exception {
		ArrayList<Integer> grades = new ArrayList<>();
		grades.add(9);
		grades.add(10);
		student = new Student(grades, "John", 23);
	}

	@Category(ImportantTest.class)
	@Test
	public void testAddNewGradeRight() throws ExamException {
		int existingNumberOfGrades = student.getGrades().size();
		ExamMock examMock = new ExamMock();
		examMock.setReturnGrade(9);
		student.addNewGradeForACourse("OOP", examMock);
		
		assertEquals(existingNumberOfGrades + 1, student.getGrades().size());
	}
	
	@Test(expected = ExamException.class)
	public void testAddNewGradeException() throws ExamException {
		ExamMock examMock = new ExamMock();
		examMock.setReturnGrade(-1);
		student.addNewGradeForACourse("OOP", examMock);
	}

}
