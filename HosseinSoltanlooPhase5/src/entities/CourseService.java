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
	public CourseService(Course course) {
		_course = course;
		_allCourses = new Vector<Course>();
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
	    		String minGradeChar = br.readLine();
	    		Grades minGrade = null;
	    		switch (minGradeChar) {
				case "O":
					minGrade = Grades.O;
					break;
				case "E":
					minGrade = Grades.E;
					break;
				case "A":
					minGrade = Grades.A;
					break;
				case "P":
					minGrade = Grades.P;
					break;
				case "T":
					minGrade = Grades.T;
					break;
				default:
					break;
			}
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
			switch (minGrade) {
				case O:
					bw.write("O");
					bw.newLine();
					break;
				case E:
					bw.write("E");
					bw.newLine();
					break;
				case A:
					bw.write("A");
					bw.newLine();
					break;
				case P:
					bw.write("P");
					bw.newLine();
					break;
				case T:
					bw.write("T");
					bw.newLine();
					break;
				default:
					break;
			}
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
