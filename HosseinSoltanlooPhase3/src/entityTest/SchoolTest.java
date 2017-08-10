package entityTest;


import java.util.ArrayList;
import java.util.Vector;
import org.junit.Assert;
import org.junit.Test;

import entities.Course;
import entities.House;
import entities.Professor;
import entities.School;
import entities.Student;

public class SchoolTest {

	private School hogwarts;

	@Test
	public void getNameTest()
	{
		hogwarts = new School("Hogwarts");
		String expected = "Hogwarts";
		String actual = hogwarts.getName();
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void getCoursesTest()
	{
		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(new Course("Potions"));
		courses.add(new Course("Divination"));
		courses.add(new Course("Magical Creatures"));
		courses.add(new Course("Defense Against The Dark Arts"));
		courses.add(new Course("Transfiguration"));
		courses.add(new Course("Charms"));
		courses.add(new Course("Astronomy"));
		courses.add(new Course("Flying"));
		courses.add(new Course("Herbology"));
		courses.add(new Course("History of Magic"));

		hogwarts = new School("Hogwarts", null, courses, null, null, "");
		ArrayList<Course> actual = hogwarts.getCourses();
		ArrayList<Course> expected = courses;
		Assert.assertArrayEquals(expected.toArray(), actual.toArray());
	}
	@Test
	public void getHousesTest()
	{
		ArrayList<House> houses = new ArrayList<House>();
		houses.add(new House("Gryffindor"));
		houses.add(new House("Hufflepuff"));
		houses.add(new House("Ravenclaw"));
		houses.add(new House("Slytherin"));
		hogwarts = new School("Hogwarts", houses, null, null, null, "");
		ArrayList<House> actual = hogwarts.getHouses();
		ArrayList<House> expected = houses;
		Assert.assertEquals(expected, actual);
				
	}
	@Test
	public void getStudentsTest()
	{
		Vector<Student> students = new Vector<Student>();
		students.add(new Student("Harry Potter"));
		students.add(new Student("Luna Lovegood"));
		students.add(new Student("Lucius Malfoy"));
		hogwarts = new School("Hogwarts", null, null, students, null, "");
		
		Vector<Student> actual = hogwarts.getStudents();
		Vector<Student> expected = students;
		Assert.assertArrayEquals(expected.toArray(), actual.toArray());		
	}
	@Test
	public void getProfessorsTest()
	{
		Vector<Professor> professors = new Vector<Professor>();
		professors.add(new Professor("Severus Snape"));
		professors.add(new Professor("Albus Dumbledore"));
		professors.add(new Professor("Minerva McGonnagol"));
		hogwarts = new School("Hogwarts", null, null, null, professors, null);
		
		Vector<Professor> actual = hogwarts.getProfessors();
		Vector<Professor> expected = professors;
		Assert.assertArrayEquals(expected.toArray(), actual.toArray());

	}
	
	@Test
	public void getLocationTest() {
		hogwarts = new School("Hogwarts", null, null, null, null, "Test Location");
		
		String actual = hogwarts.getLocation();
		String expected = "Test Location";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void setNameTest() {
		hogwarts = new School("Hogwarts");
		hogwarts.setName("Not Hogwarts");
		
		String actual = hogwarts.getName();
		String expected = "Not Hogwarts";
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void setCoursesTest()
	{
		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(new Course("Potions"));
		courses.add(new Course("Divination"));
		courses.add(new Course("Magical Creatures"));
		courses.add(new Course("Defense Against The Dark Arts"));
		courses.add(new Course("Transfiguration"));
		courses.add(new Course("Charms"));
		courses.add(new Course("Astronomy"));
		courses.add(new Course("Flying"));
		courses.add(new Course("Herbology"));
		courses.add(new Course("History of Magic"));

		hogwarts = new School("Hogwarts");
		hogwarts.setCourses(courses);
		ArrayList<Course> actual = hogwarts.getCourses();
		ArrayList<Course> expected = courses;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void setHousesTest()
	{
		ArrayList<House> houses = new ArrayList<House>();
		houses.add(new House("Gryffindor"));
		houses.add(new House("Hufflepuff"));
		houses.add(new House("Ravenclaw"));
		houses.add(new House("Slytherin"));
		hogwarts = new School("Hogwarts");
		hogwarts.setHouses(houses);
		ArrayList<House> actual = hogwarts.getHouses();
		ArrayList<House> expected = houses;
		Assert.assertArrayEquals(expected.toArray(), actual.toArray());
				
	}
	@Test
	public void setStudentsTest()
	{
		Vector<Student> students = new Vector<Student>();
		students.add(new Student("Harry Potter"));
		students.add(new Student("Luna Lovegood"));
		students.add(new Student("Lucius Malfoy"));
		hogwarts = new School("Hogwarts");
		hogwarts.setStudents(students);
		Vector<Student> actual = hogwarts.getStudents();
		Vector<Student> expected = students;
		Assert.assertArrayEquals(expected.toArray(), actual.toArray());
		
	}
	@Test
	public void setProfessorsTest()
	{
		Vector<Professor> professors = new Vector<Professor>();
		professors.add(new Professor("Severus Snape"));
		professors.add(new Professor("Albus Dumbledore"));
		professors.add(new Professor("Minerva McGonnagol"));
		hogwarts = new School("Hogwarts");
		hogwarts.setProfessors(professors);
		
		Vector<Professor> actual = hogwarts.getProfessors();
		Vector<Professor> expected = professors;
		Assert.assertArrayEquals(expected.toArray(), actual.toArray());

	}
	
	@Test
	public void setLocationTest() {
		hogwarts = new School("Hogwarts");
		hogwarts.setLocation("Test Location");
		
		String actual = hogwarts.getLocation();
		String expected = "Test Location";
		Assert.assertEquals(expected, actual);
	}

}
