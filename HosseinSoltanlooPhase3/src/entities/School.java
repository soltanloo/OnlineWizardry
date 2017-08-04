package entities;

import java.util.ArrayList;
import java.util.Vector;

public class School {
	private String _name;
	private int _numOfStudents;
	private int _numOfHouses;
	private int _numOfCourses;
	private int _numOfProfessors;
	private boolean _housed;
	private ArrayList<House> _houses;
	private Vector<Student> _students;
	private Vector<Professor> _professors;
	private ArrayList<Course> _courses;
	private String _location;
	
	public School(String name) {
		_name = name;
		_houses = new ArrayList<House>();
		_students = new Vector<Student>();
		_professors = new Vector<Professor>();
		_courses = new ArrayList<Course>();
		_numOfStudents = 0;
		_numOfHouses = 0;
		_numOfCourses = 0;
		_numOfProfessors = 0;
		_housed = false;
		_location = "";
	}
	public School(String name, ArrayList<House> houses, ArrayList<Course> courses, Vector<Student> students, Vector<Professor> professors, String location) {
		_name = name;
		_houses = houses;
		_courses = courses;
		_students = students;
		_professors = professors;
		_location = location;
		if (students != null) {
			_numOfStudents = students.size();
		} else {
			_numOfStudents = 0;
		}
		if (houses != null) {
			_numOfHouses = houses.size();
		} else {
			_numOfHouses = 0;
		}
		if (courses != null) {
			_numOfCourses = courses.size();
		} else {
			_numOfCourses = 0;
		}
		if (professors != null) {
			_numOfProfessors = professors.size();
		} else {
			_numOfProfessors = 0;
		}
		if (houses == null || houses.isEmpty()) {
			_housed = false;
		}
		else {
			_housed = true;
		}
	}
	public ArrayList<Course> getCourses() {
		return _courses;
	}
	public void setCourses(ArrayList<Course> courses) {
		_courses = courses;
	}
	public ArrayList<House> getHouses() {
		return _houses;
	}
	public void setHouses(ArrayList<House> houses) {
		_houses = houses;
	}
	public Vector<Student> getStudents() {
		return _students;
	}
	public void setStudents(Vector<Student> studentNames) {
		_students = studentNames;
	}
	public Vector<Professor> getProfessors() {
		return _professors;
	}
	public void setProfessors(Vector<Professor> professors) {
		_professors = professors;
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
	public void addHouse(House house) {
		if (!_houses.contains(house)) {
			_houses.add(house);
			_numOfHouses++;
		}
	}
	public void addStudent(Student student) {
		if (!_students.contains(student)) {
			_students.add(student);
			_numOfStudents++;
		}
	}
	public void addCourse(Course course) {
		if (!_courses.contains(course)) {
			_courses.add(course);
			_numOfCourses++;
		}
	}
	public void addProfessor(Professor professor) {
		if (!_professors.contains(professor)) {
			_professors.add(professor);
			_numOfProfessors++;
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
}
