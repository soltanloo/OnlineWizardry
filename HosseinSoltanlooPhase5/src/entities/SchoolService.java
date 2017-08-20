package entities;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Vector;

public class SchoolService {
	private School _school;
	private Vector<School> _allSchools;
	
	// Constructors
	public SchoolService(School school) {
		_school = school;
		_allSchools = new Vector<School>();
	}
	public SchoolService() {
		this(null);
	}
//	public House sortingHat(Student student) {
//		
//	}
	public void getData(String filename) throws IOException {
		String line;
		InputStream fis = new FileInputStream(filename);
	    InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
	    BufferedReader br = new BufferedReader(isr);
	    while(!(line = br.readLine()).equals("$")) {
	    		if (line.equals("*")) {
	    			continue;
	    		}
	    		String name = line;
	    		ArrayList<House> houses = new ArrayList<House>();
	    		int housesCount = Integer.parseInt(br.readLine());
	    		for(int i = 0; i < housesCount; i++) {
	    			House house = new House();
	    			house.setName(br.readLine());
	    			houses.add(house);
	    		}
	    		Vector<Student> students = new Vector<Student>();
	    		int studentsCount = Integer.parseInt(br.readLine());
	    		for(int i = 0; i < studentsCount; i++) {
	    			Student student = new Student(br.readLine());
	    			students.add(student);
	    		}
	    		Vector<Professor> professors = new Vector<Professor>();
	    		int professorsCount = Integer.parseInt(br.readLine());
	    		for(int i = 0; i < professorsCount; i++) {
	    			Professor professor = new Professor(br.readLine());
	    			professors.add(professor);
	    		}
	    		ArrayList<Course> courses = new ArrayList<Course>();
	    		int coursesCount = Integer.parseInt(br.readLine());
	    		for(int i = 0; i < coursesCount; i++) {
	    			Course course = new Course();
	    			course.setName(br.readLine());
	    			courses.add(course);
	    		}
	    		String location = br.readLine();
	    		School school = new School(name, students.size(), houses.size() != 0, houses, students, professors, courses, location);
	    		_allSchools.add(school);
	    }
	    br.close();
	}
	public void setData() {
		
	}
	public Vector<School> getAllSchools() {
		return _allSchools;
	}
	public void setAllSchools(Vector<School> allSchools) {
		_allSchools = allSchools;
	}
	public School getSchool() {
		return _school;
	}
	public void setSchool(School school) {
		_school = school;
	}
}
