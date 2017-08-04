package entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class House {
	private String _name;
	private School _school;
	private Vector<Student> _students;
	private Professor _headTeacher;
	private ArrayList<String> _qualities;
	private Map<Integer, Student> _prefects;
	
	public House(String name) {
		_name = name;
		_school = new School("");
		_students = new Vector<Student>();
		_headTeacher = new Professor("");
		_qualities = new ArrayList<String>();
		_prefects = new HashMap<Integer, Student>();
	}
	public House(String name, School school, Vector<Student> students, Professor headTeacher,
			ArrayList<String> qualities, Map<Integer, Student> prefects) {
		_name = name;
		_school = school;
		_students = students;
		_headTeacher = headTeacher;
		_qualities = qualities;
		_prefects = prefects;
	}
	public String getName() {
		return _name;
	}
	public void setName(String name) {
		_name = name;
	}
	public School getSchool() {
		return _school;
	}
	public void setSchool(School school) {
		_school = school;
	}
	public Vector<Student> getStudents() {
		return _students;
	}
	public void setStudents(Vector<Student> students) {
		_students = students;
	}
	public Professor getHeadTeacher() {
		return _headTeacher;
	}
	public void setHeadTeacher(Professor headTeacher) {
		_headTeacher = headTeacher;
	}
	public ArrayList<String> getQualities() {
		return _qualities;
	}
	public void setQualities(ArrayList<String> qualities) {
		_qualities = qualities;
	}
	public Map<Integer, Student> getPrefects() {
		return _prefects;
	}
	public void setPrefects(Map<Integer, Student> prefects) {
		_prefects = prefects;
	}
}
