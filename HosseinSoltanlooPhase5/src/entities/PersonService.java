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

public class PersonService {
	private Person _person;
	private Vector<Person> _allPersons;
	
	/*			CONSTRUCTORS			*/
	public PersonService(Person person, Vector<Person> allPersons) {
		_person = person;
		_allPersons = allPersons;
	}
	public PersonService(Person person) {
		this(person, new Vector<Person>());
	}
	public PersonService() {
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
	    		Person person = new Person(name, house, bloodStatus, school, birthday);
	    		_allPersons.add(person);
	    }
	    br.close();
	}
	public void setData() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(
				"/Users/Soli/Git/OnlineWizardry/HosseinSoltanlooPhase5/src/Database/PersonDB.txt"));
		for (int i = 0; i < _allPersons.size(); i++) {
			Person person = _allPersons.get(i);
			String name = person.getName();
			House house = person.getHouse();
			BloodStatus bloodStatus = person.getBloodStatus();
			School school = person.getSchool();
			String birthday = person.getBirthday();
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
			bw.write("*");
			bw.newLine();
		}
		bw.write("$");
		bw.close();
	}
	/*				SETTERS				*/
	public void setAllPersons(Vector<Person> allPersons) {
		_allPersons = allPersons;
	}
	public void setPerson(Person person) {
		_person = person;
	}
	/*				GETTERS				*/
	public Vector<Person> getAllPersons() {
		return _allPersons;
	}
	public Person getPerson() {
		return _person;
	}
}
