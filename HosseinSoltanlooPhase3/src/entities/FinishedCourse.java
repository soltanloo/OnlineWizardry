package entities;

public class FinishedCourse extends Course {
	private Grades _grade;
	private boolean _passed;
	
	public FinishedCourse(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public FinishedCourse(String name, String professorName, char minGrade, int year) {
		super(name, professorName, minGrade, year);
		// TODO Auto-generated constructor stub
	}
}
