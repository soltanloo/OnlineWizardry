package entities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
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
	public void setData() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(
				"/Users/Soli/Git/OnlineWizardry/HosseinSoltanlooPhase5/src/Database/SchoolDB.txt"));
		for (int i = 0; i < _allSchools.size(); i++) {
			School school = _allSchools.get(i);
			String name = school.getName();
			ArrayList<House> houses = school.getHouses();
			Vector<Student> students = school.getStudents();
			Vector<Professor> professors = school.getProfessors();
			ArrayList<Course> courses = school.getCourses();
			String location = school.getLocation();
			bw.write(name);
			bw.newLine();
			bw.write(String.valueOf(houses.size()));
			bw.newLine();
			for (int j = 0; j < houses.size(); j++) {
				bw.write(houses.get(j).getName());
				bw.newLine();
			}
			bw.write(String.valueOf(students.size()));
			bw.newLine();
			for (int j = 0; j < students.size(); j++) {
				bw.write(students.get(j).getName());
				bw.newLine();
			}
			bw.write(String.valueOf(professors.size()));
			bw.newLine();
			for (int j = 0; j < professors.size(); j++) {
				bw.write(professors.get(j).getName());
				bw.newLine();
			}
			bw.write(String.valueOf(courses.size()));
			bw.newLine();
			for (int j = 0; j < courses.size(); j++) {
				bw.write(courses.get(j).getName());
				bw.newLine();
			}
			bw.write(location);
			bw.newLine();
			bw.write("*");
			bw.newLine();
		}
		bw.write("$");
		bw.close();
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
