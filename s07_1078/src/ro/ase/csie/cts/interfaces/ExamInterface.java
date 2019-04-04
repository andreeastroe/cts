package ro.ase.csie.cts.interfaces;

import ro.ase.csie.cts.models.Student;

public interface ExamInterface {

	/*
	 * returns -1 for an absent student
	 * returns grades from 1 to 10
	 * returns 0 for other situations
	*/
	
	public int takeExam(String courseName, Student student);
}
