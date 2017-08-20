package entities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

public class ProfessorService {
	private Professor _professor;
	private Vector<Professor> _allProfessors;
	
	/*			CONSTRUCTORS			*/
	public ProfessorService(Professor professor, Vector<Professor> allProfessors) {
		_professor = professor;
		_allProfessors = allProfessors;
	}
	public ProfessorService(Professor professor) {
		this(professor, new Vector<Professor>());
	}
	public ProfessorService() {
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
	    		House house = new House();
	    		house.setName(br.readLine());
	    		BloodStatus bloodStatus = BloodStatus.valueOf(br.readLine());
	    		School school = new School(br.readLine(), false, "");
	    		String birthday = br.readLine();
	    		Map<Integer, Course> courses = new TreeMap<Integer, Course>();
	    		Course course = new Course();
	    		course.setName(br.readLine());
	    		Integer year = Integer.valueOf(br.readLine());
	    		courses.put(year, course);
	    		String notes = br.readLine();
	    		Professor professor = new Professor(name, house, bloodStatus, school, birthday, courses, notes);
	    		_allProfessors.add(professor);
	    }
	    br.close();
	}
	public void setData() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(
				"/Users/Soli/Git/OnlineWizardry/HosseinSoltanlooPhase5/src/Database/ProfessorDB.txt"));
		for (int i = 0; i < _allProfessors.size(); i++) {
			Professor professor = _allProfessors.get(i);
			String name = professor.getName();
			House house = professor.getHouse();
			BloodStatus bloodStatus = professor.getBloodStatus();
			School school = professor.getSchool();
			Map<Integer, Course> courses = professor.getCourses();
			Set<Integer> years = courses.keySet();
			String birthday = professor.getBirthday();
			String notes = professor.getNotes();
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
			bw.write(courses.get(years.iterator().next()).getName());
			bw.newLine();
			bw.write(String.valueOf(years.iterator().next()));
			bw.newLine();
			bw.write(notes);
			bw.newLine();
			bw.write("*");
			bw.newLine();
		}
		bw.write("$");
		bw.close();
	}
	/*				SETTERS				*/
	public void setAllrofessors(Vector<Professor> allProfessors) {
		_allProfessors = allProfessors;
	}
	public void setProfessor(Professor professor) {
		_professor = professor;
	}
	/*				GETTERS				*/
	public Vector<Professor> getAllProfessors() {
		return _allProfessors;
	}
	public Professor getProfessor() {
		return _professor;
	}
}