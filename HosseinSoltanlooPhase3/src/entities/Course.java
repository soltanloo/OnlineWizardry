package entities;

import java.util.Vector;

public class Course {
	private String _name;
	private char _minGrade;
	private String _professorName;
	private int _year;
	private int _numOfStudents;
	private Vector<String> _studentNames;
	
	public Course(String name) {
		_name = name;
		_professorName = "";
		_studentNames = new Vector<String>();
		_numOfStudents = 0;
	}
	public Course(String name, String professorName, char minGrade, int year) {
		_name = name;
		_professorName = professorName;
		_minGrade = minGrade;
		_year = year;
		_numOfStudents = 0;
		_studentNames = new Vector<String>();
	}
	public Vector<String> getStudentNames() {
		return _studentNames;
	}
	public void setStudentNames(Vector<String> studentNames) {
		_studentNames = studentNames;
		_numOfStudents = studentNames.size();
	}
	public String getProfessorName() {
		return _professorName;
	}
	public void setProfessorName(String professorName) {
		_professorName = professorName;
	}
	public String getName() {
		return _name;
	}
	public void setName(String name) {
		_name = name;
	}
	public char getMinGrade() {
		return _minGrade;
	}
	public void setMinGrade(char minGrade) {
		_minGrade = minGrade;
	}
	public int getYear() {
		return _year;
	}
	public void setYear(int year) {
		_year = year;
	}
	public void addStudent(String studentName) {
		if (!_studentNames.contains(studentName)) {
			_studentNames.add(studentName);
			_numOfStudents++;
		}
	}
	public int getNumOfStudents() {
		return _numOfStudents;
	}
}
