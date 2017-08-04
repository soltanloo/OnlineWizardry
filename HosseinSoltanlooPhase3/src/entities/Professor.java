package entities;

import java.util.Date;
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
	public Professor(String name, String houseName, String bloodStatus, String school, Date birthday, String notes, Map<Integer, Course> courses) {
		super(name, houseName, bloodStatus, school, birthday);
		_notes = notes;
		_courses = courses;
	}
}
