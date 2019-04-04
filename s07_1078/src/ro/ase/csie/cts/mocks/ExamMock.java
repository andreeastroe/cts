package ro.ase.csie.cts.mocks;

import ro.ase.csie.cts.interfaces.ExamInterface;
import ro.ase.csie.cts.models.Student;

public class ExamMock implements ExamInterface{

	public static final int NORMAL_GRADE = 10;
	private int returnedGrade;
	
	public int getReturnGrade() {
		return returnedGrade;
	}
	
	public void setReturnGrade(int returnGrade) {
		this.returnedGrade = returnGrade;
	}

	@Override
	public int takeExam(String courseName, Student student) {
		return returnedGrade;
	}

	
}
