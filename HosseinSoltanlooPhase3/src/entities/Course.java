package entities;

import java.util.Vector;

public class Course {
	private String _name;
	private Grades _minGrade;
	private Professor _professor;
	private int _year;
	private int _numOfStudents;
	private Vector<Student> _students;
	
	public Course(String name) {
		_name = name;
		_students = new Vector<Student>();
		_numOfStudents = 0;
	}
	public Course(String name, Professor professor, Grades minGrade, int year) {
		_name = name;
		_professor = professor;
		_minGrade = minGrade;
		_year = year;
		_numOfStudents = 0;
		_students = new Vector<Student>();
	}
	public Vector<Student> getStudents() {
		return _students;
	}
	public void setStudents(Vector<Student> students) {
		_students = students;
		_numOfStudents = students.size();
	}
	public Professor getProfessor() {
		return _professor;
	}
	public void setProfessor(Professor professor) {
		_professor = professor;
	}
	public String getName() {
		return _name;
	}
	public void setName(String name) {
		_name = name;
	}
	public Grades getMinGrade() {
		return _minGrade;
	}
	public void setMinGrade(Grades minGrade) {
		_minGrade = minGrade;
	}
	public int getYear() {
		return _year;
	}
	public void setYear(int year) {
		_year = year;
	}
	public void addStudent(Student student) {
		if (!_students.contains(student)) {
			_students.add(student);
			_numOfStudents++;
		}
	}
	public int getNumOfStudents() {
		return _numOfStudents;
	}
}
