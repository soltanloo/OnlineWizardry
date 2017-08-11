package entityTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import org.junit.Assert;
import org.junit.Test;

import entities.House;
import entities.Professor;
import entities.School;
import entities.Student;

public class HouseTest {
	private House house;
	
	@Test
	public void getNameTest() {
		house = new House("Ravenclaw");
		String expected = "Ravenclaw";
		String actual = house.getName();
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void getSchoolTest() {
		School testSchool = new School("Hogwarts");
		house = new House("Ravenclaw", testSchool, null, null, null, null);
		
		School actual = house.getSchool();
		School expected = testSchool;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void getStudentsTest() {
		Vector<Student> students = new Vector<Student>();
		students.add(new Student("Student A"));
		students.add(new Student("Student B"));
		students.add(new Student("Student C"));
		house = new House("Ravenclaw", null, students, null, null, null);
		
		Vector<Student> actual = house.getStudents();
		Vector<Student> expected = students;
		Assert.assertArrayEquals(expected.toArray(), actual.toArray());
	}
	
	@Test
	public void getHeadTeacherTest() {
		Professor headTeacher = new Professor("Head Teacher");
		house = new House("Ravenclaw", null, null, headTeacher, null, null);
		
		Professor actual = house.getHeadTeacher();
		Professor expected = headTeacher;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void getQualitiesTest() {
		ArrayList<String> qualities = new ArrayList<String>();
		qualities.add(new String("Quality 1"));
		qualities.add(new String("Quality 2"));
		qualities.add(new String("Quality 3"));
		house = new House("Ravenclaw", null, null, null, qualities, null);
		
		ArrayList<String> actual = house.getQualities();
		ArrayList<String> expected = qualities;
		Assert.assertArrayEquals(expected.toArray(), actual.toArray());
	}
	
	@Test
	public void getPefectsTest() {
		Map<Integer, Student> prefects = new HashMap<Integer, Student>();
		prefects.put(1995, new Student("Student 1"));
		prefects.put(1995, new Student("Student 2"));
		prefects.put(1995, new Student("Student 3"));
		house = new House("Ravenclaw", null, null, null, null, prefects);
		
		Map<Integer, Student> actual = house.getPrefects();
		Map<Integer, Student> expected = prefects;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void setNameTest() {
		house = new House("Ravenclaw");
		house.setName("Not Ravenclaw");
		
		String actual = house.getName();
		String expected = "Not Ravenclaw";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void setSchoolTest() {
		School school = new School("Test School");
		house = new House("Ravenclaw");
		house.setSchool(school);
		
		School actual = house.getSchool();
		School expected = school;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void setStudentsTest() {
		Vector<Student> students = new Vector<Student>();
		house = new House("Ravenclaw");
		students.add(new Student("Student 1"));
		students.add(new Student("Student 2"));
		students.add(new Student("Student 3"));
		house.setStudents(students);
		
		Vector<Student> actual = house.getStudents();
		Vector<Student> expected = students;
		Assert.assertArrayEquals(expected.toArray(), actual.toArray());
	}
	
	@Test
	public void setHeadTeacher() {
		Professor professor = new Professor("Head Teacher");
		house = new House("Ravenclaw");
		house.setHeadTeacher(professor);
		
		Professor actual = house.getHeadTeacher();
		Professor expected = professor;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void setQualitiesTest() {
		ArrayList<String> qualities = new ArrayList<String>();
		house = new House("Ravenclaw");
		qualities.add("Quality 1");
		qualities.add("Quality 2");
		qualities.add("Quality 3");
		house.setQualities(qualities);
		
		ArrayList<String> actual = house.getQualities();
		ArrayList<String> expected = qualities;
		Assert.assertArrayEquals(expected.toArray(), actual.toArray());
	}
	
	@Test
	public void setPrefectsTest() {
		Map<Integer, Student> prefects = new HashMap<Integer, Student>();
		house = new House("Ravenclaw");
		prefects.put(1998, new Student("Student 1"));
		prefects.put(1998, new Student("Student 2"));
		prefects.put(1998, new Student("Student 3"));
		house.setPrefects(prefects);
		
		Map<Integer, Student> actual = house.getPrefects();
		Map<Integer, Student> expected = prefects;
		Assert.assertEquals(expected, actual);
	}
}
