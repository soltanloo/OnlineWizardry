package entities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Vector;

public class HouseService {
	private House _house;
	private Vector<House> _allHouses;
	
	/*			CONSTRUCTORS			*/
	public HouseService(House house, Vector<House> allHouses) {
		_house = house;
		_allHouses = allHouses;
	}
	public HouseService(House house) {
		this(house, new Vector<House>());
	}
	public HouseService() {
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
	    		School school = new School(br.readLine(), false, "");
	    		Vector<Student> students = new Vector<Student>();
	    		int studentsCount = Integer.parseInt(br.readLine());
	    		for(int i = 0; i < studentsCount; i++) {
	    			Student student = new Student(br.readLine());
	    			students.add(student);
	    		}
	    		House house = new House(name, school, students, new Professor(""), new ArrayList<String>(), new TreeMap<Integer, Student>());
	    		_allHouses.add(house);
	    }
	    br.close();
	}
	public void setData() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(
				"/Users/Soli/Git/OnlineWizardry/HosseinSoltanlooPhase5/src/Database/HouseDB.txt"));
		for (int i = 0; i < _allHouses.size(); i++) {
			House house = _allHouses.get(i);
			String name = house.getName();
			School school = house.getSchool();
			Vector<Student> students = house.getStudents();
			bw.write(name);
			bw.newLine();
			bw.write(school.getName());
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
	public void setAllHouses(Vector<House> allHouses) {
		_allHouses = allHouses;
	}
	public void setHouse(House house) {
		_house = house;
	}
	/*				GETTERS				*/
	public Vector<House> getAllHouses() {
		return _allHouses;
	}
	public House getHouse() {
		return _house;
	}
}
