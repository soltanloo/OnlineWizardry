package entities;

public class FinishedCourse extends Course {
	private Grades _grade;
	private boolean _passed;
	
	public FinishedCourse(String name) {
		super(name);
		_passed = false;
	}
	public FinishedCourse(String name, Professor professor, Grades minGrade, int year, Grades grade) {
		super(name, professor, minGrade, year);
		_grade = grade;
		if (grade == Grades.A || grade == Grades.E || grade ==Grades.O) {
			_passed = true;
		}
		else {
			_passed = false;
		}
	}
	public boolean isPassed() {
		return _passed;
	}
	public void setPassed(boolean passed) {
		_passed = passed;
	}
	public Grades getGrade() {
		return _grade;
	}
	public void setGrade(Grades grade) {
		_grade = grade;
		if (grade == Grades.A || grade == Grades.E || grade ==Grades.O) {
			_passed = true;
		}
		else {
			_passed = false;
		}
	}
}