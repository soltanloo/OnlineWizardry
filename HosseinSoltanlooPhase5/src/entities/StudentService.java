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

public class StudentService {
	private Student _student;
	private Vector<Student> _allStudents;
	
	/*			CONSTRUCTORS			*/
	public StudentService(Student student, Vector<Student> allStudents) {
		_student = student;
		_allStudents = allStudents;
	}
	public StudentService(Student student) {
		this(student, new Vector<Student>());
	}
	public StudentService() {
		this(null);
	}
	/*			HELPER FUNCTIONS			*/
//	public void sortToHouse(House house) {
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
	    		House house = new House();
	    		house.setName(br.readLine());
	    		BloodStatus bloodStatus = BloodStatus.valueOf(br.readLine());
	    		School school = new School(br.readLine(), false, "");
	    		String birthday = br.readLine();
	    		Vector<Course> courses = new Vector<Course>();
	    		int coursesCount = Integer.parseInt(br.readLine());
	    		for(int i = 0; i < coursesCount; i++) {
	    			Course course = new Course();
	    			course.setName(br.readLine());
	    			courses.add(course);
	    		}
	    		Student student = new Student(name, house, bloodStatus, school, birthday, courses, new Vector<FinishedCourse>());
	    		_allStudents.add(student);
	    }
	    br.close();
	}
	public void setData() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(
				"/Users/Soli/Git/OnlineWizardry/HosseinSoltanlooPhase5/src/Database/StudentDB.txt"));
		for (int i = 0; i < _allStudents.size(); i++) {
			Student student = _allStudents.get(i);
			String name = student.getName();
			House house = student.getHouse();
			BloodStatus bloodStatus = student.getBloodStatus();
			School school = student.getSchool();
			String birthday = student.getBirthday();
			Vector<Course> courses = student.getCourses();
			bw.write(name);
			bw.newLine();
			bw.write(house.getName());
			bw.newLine();
			bw.write(bloodStatus.name());
			bw.newLine();
			bw.write(school.getName());
			bw.newLine();
			bw.write(birthday);
			bw.newLine();
			bw.write(String.valueOf(courses.size()));
			bw.newLine();
			for (int j = 0; j < courses.size(); j++) {
				bw.write(courses.get(j).getName());
				bw.newLine();
			}
			bw.write("*");
			bw.newLine();
		}
		bw.write("$");
		bw.close();
	}
	/*				SETTERS				*/
	public void setAllStudents(Vector<Student> allStudents) {
		_allStudents = allStudents;
	}
	public void setStudent(Student student) {
		_student = student;
	}
	/*				GETTERS				*/
	public Vector<Student> getAllStudents() {
		return _allStudents;
	}
	public Student getStudent() {
		return _student;
	}
}
