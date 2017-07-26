package entities;

import java.util.ArrayList;
import java.util.Vector;

public class School {
	private String _name;
	private int _numOfStudents;
	private int _numOfHouses;
	private int _numOfCourses;
	private int _numOfProfessors;
	private int _numOfYears;
	private boolean _housed;
	private ArrayList<Integer> _years;
	private ArrayList<String> _houseNames;
	private Vector<String> _studentNames;
	private Vector<String> _professorNames;
	private ArrayList<String> _courseNames;
	
	public School(String name) {
		_name = name;
		_years = new ArrayList<Integer>();
		_houseNames = new ArrayList<String>();
		_studentNames = new Vector<String>();
		_professorNames = new Vector<String>();
		_courseNames = new ArrayList<String>();
		_numOfStudents = 0;
		_numOfHouses = 0;
		_numOfCourses = 0;
		_numOfProfessors = 0;
		_numOfYears = 0;
		_housed = false;
	}
	public School(String name, ArrayList<String> houseNames, ArrayList<String> courseNames, ArrayList<Integer> years, Vector<String> studentNames, Vector<String> professorNames) {
		_name = name;
		_houseNames = houseNames;
		_courseNames = courseNames;
		_years = years;
		_studentNames = studentNames;
		_professorNames = professorNames;
		if (studentNames != null) {
			_numOfStudents = studentNames.size();
		} else {
			_numOfStudents = 0;
		}
		if (houseNames != null) {
			_numOfHouses = houseNames.size();
		} else {
			_numOfHouses = 0;
		}
		if (courseNames != null) {
			_numOfCourses = courseNames.size();
		} else {
			_numOfCourses = 0;
		}
		if (professorNames != null) {
			_numOfProfessors = professorNames.size();
		} else {
			_numOfProfessors = 0;
		}
		if (years != null) {
			_numOfYears = years.size();
		} else {
			_numOfYears = 0;
		}
		if (houseNames == null || houseNames.isEmpty()) {
			_housed = false;
		}
		else {
			_housed = true;
		}
	}
	public ArrayList<String> getCourseNames() {
		return _courseNames;
	}
	public void setCourseNames(ArrayList<String> courseNames) {
		_courseNames = courseNames;
	}
	public ArrayList<String> getHouseNames() {
		return _houseNames;
	}
	public void setHouseNames(ArrayList<String> houseNames) {
		_houseNames = houseNames;
	}
	public Vector<String> getStudentNames() {
		return _studentNames;
	}
	public void setStudentNames(Vector<String> studentNames) {
		_studentNames = studentNames;
	}
	public Vector<String> getProfessorNames() {
		return _professorNames;
	}
	public void setProfessorNames(Vector<String> _professorNames) {
		this._professorNames = _professorNames;
	}
	public String getName() {
		return _name;
	}
	public void setName(String name) {
		_name = name;
	}
	public int getNumOfStudents() {
		return _numOfStudents;
	}
	public boolean isHoused() {
		return _housed;
	}
	public ArrayList<Integer> getYears() {
		return _years;
	}
	public void setYears(ArrayList<Integer> years) {
		_years = years;
	}
	public void addHouse(String houseName) {
		if (!_houseNames.contains(houseName)) {
			_houseNames.add(houseName);
			_numOfHouses++;
		}
	}
	public void addStudent(String studentName) {
		if (!_studentNames.contains(studentName)) {
			_studentNames.add(studentName);
			_numOfStudents++;
		}
	}
	public void addCourse(String courseName) {
		if (!_courseNames.contains(courseName)) {
			_courseNames.add(courseName);
			_numOfCourses++;
		}
	}
	public void addProfessor(String professorName) {
		if (!_professorNames.contains(professorName)) {
			_professorNames.add(professorName);
			_numOfProfessors++;
		}
	}
	public void addYear(Integer year) {
		if (!_years.contains(year)) {
			_years.add(year);
			_numOfYears++;
		}
	}
	public int getNumOfHouses() {
		return _numOfHouses;
	}
	public int getNumOfCourses() {
		return _numOfCourses;
	}
	public int getNumOfProfessors() {
		return _numOfProfessors;
	}
	public int getNumOfYears() {
		return _numOfYears;
	}
}
