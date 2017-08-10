package entities;

import java.util.Vector;

public class Student extends Person {
	private Vector<Course> _courses;
	private Vector<FinishedCourse> _reportCard;
	
	public Student(String name) {
		super(name);
		_courses = new Vector<Course>();
		_reportCard = new Vector<FinishedCourse>();
	}
	public Student(String name, House house, BloodStatus bloodStatus, School school, String birthday,
			Vector<Course> courses, Vector<FinishedCourse> reportCard) {
		super(name, house, bloodStatus, school, birthday);
		_courses = courses;
		_reportCard = reportCard;
	}
	public Vector<Course> getCourses() {
		return _courses;
	}
	public void setCourses(Vector<Course> courses) {
		_courses = courses;
	}
	public Vector<FinishedCourse> getReportCard() {
		return _reportCard;
	}
	public void setReportCard(Vector<FinishedCourse> reportCard) {
		_reportCard = reportCard;
	}
	public void addCourse(Course course) {
		if (!_courses.contains(course)) {
			_courses.add(course);
		}
	}
	public void addFinishedCourse(FinishedCourse finishedCourse) {
		if (!_reportCard.contains(finishedCourse)) {
			_reportCard.add(finishedCourse);
		}
	}
}
