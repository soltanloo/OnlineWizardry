package entities;

import java.util.HashMap;
import java.util.Map;

public class Professor extends Person {
	private Map<Integer, Course> _courses;
	private String _notes;
	
	public Professor(String name) {
		super(name);
		_notes = "";
		_courses = new HashMap<Integer, Course>();
	}
	public Professor(String name, House house, BloodStatus bloodStatus, School school, String birthday, String notes, Map<Integer, Course> courses) {
		super(name, house, bloodStatus, school, birthday);
		_notes = notes;
		_courses = courses;
	}
	public Map<Integer, Course> getCourses() {
		return _courses;
	}
	public void setCourses(Map<Integer, Course> courses) {
		_courses = courses;
	}
	public void addCourse(Integer year, Course course) {
		_courses.put(year, course);
	}
	public String getNotes() {
		return _notes;
	}
	public void setNotes(String notes) {
		_notes = notes;
	}
}