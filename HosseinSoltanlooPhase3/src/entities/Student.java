package entities;

import java.util.Vector;

public class Student extends Person {
	private Vector<Course> _courses;
	private Vector<FinishedCourse> _reportCard;
	public Student(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

}
