package entities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Vector;

public class CourseService {
	private Course _course;
	private Vector<Course> _allCourses;
	
	/*			CONSTRUCTORS			*/
	public CourseService(Course course, Vector<Course> allCourses) {
		_course = course;
		_allCourses = allCourses;
	}
	public CourseService(Course course) {
		this(course, new Vector<Course>());
	}
	public CourseService() {
		this(null);
	}
	/*			HELPER FUNCTIONS			*/
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
	    		Grades minGrade = Grades.valueOf(br.readLine());
	    		Professor professor = new Professor(br.readLine());
	    		int year = Integer.valueOf(br.readLine());
	    		Vector<Student> students = new Vector<Student>();
	    		int studentsCount = Integer.parseInt(br.readLine());
	    		for(int i = 0; i < studentsCount; i++) {
	    			Student student = new Student(br.readLine());
	    			students.add(student);
	    		}
	    		Course course = new Course(name, minGrade, professor, year, students);
	    		_allCourses.add(course);
	    }
	    br.close();
	}
	public void setData() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(
				"/Users/Soli/Git/OnlineWizardry/HosseinSoltanlooPhase5/src/Database/CourseDB.txt"));
		for (int i = 0; i < _allCourses.size(); i++) {
			Course course = _allCourses.get(i);
			String name = course.getName();
			Grades minGrade = course.getMinGrade();
			Professor professor = course.getProfessor();
			int year = course.getYear();
			Vector<Student> students = course.getStudents();
			bw.write(name);
			bw.newLine();
			bw.write(minGrade.name());
			bw.newLine();
			bw.write(professor.getName());
			bw.newLine();
			bw.write(String.valueOf(year));
			bw.newLine();
			bw.write(String.valueOf(students.size()));
			bw.newLine();
			for (int j = 0; j < students.size(); j++) {
				bw.write(students.get(j).getName());
				bw.newLine();
			}
			bw.write("*");
			bw.newLine();
		}
		bw.write("$");
		bw.close();
	}
	/*				SETTERS				*/
	public void setAllCourses(Vector<Course> allCourses) {
		_allCourses = allCourses;
	}
	public void setCourse(Course course) {
		_course = course;
	}
	/*				GETTERS				*/
	public Vector<Course> getAllCourses() {
		return _allCourses;
	}
	public Course getCourse() {
		return _course;
	}
}
