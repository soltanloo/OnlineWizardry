package entityTest;

import java.util.Vector;

import org.junit.Assert;
import org.junit.Test;

import entities.Course;
import entities.Grades;
import entities.Professor;
import entities.Student;

public class CourseTest {
	Course flying;

	@Test
	public void studentsTest() 
	{
		flying = new Course("flying");
		Vector<Student> students = new Vector<Student>();
		students.add(new Student("Harry Potter"));
		students.add(new Student("Ron Weasley"));
		students.add(new Student("Hermoine Granger"));
		students.add(new Student("Draco Malfoy"));
		flying.setStudents(students);
		
		Vector<Student> actual = flying.getStudents();
		Vector<Student> expected = students;
		
		Assert.assertArrayEquals(expected.toArray(), actual.toArray());
	}
	@Test
	public void getProfessorTest() {
		Professor professor = new Professor("Madame Hooch");
		flying = new Course("flying", professor, Grades.O, 1996);
		Professor expected = professor;
		Professor actual = flying.getProfessor();
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void getNameTest() {
		flying = new Course("flying", null, Grades.O, 1996);
		String expected = "flying";
		String actual = flying.getName();
		
		Assert.assertEquals(expected, actual);
		
	}
	@Test
	public void getMinGradeTest() {
		flying = new Course("flying", null, Grades.O, 1996);
		Grades expected = Grades.O;
		Grades actual = flying.getMinGrade();
		
		Assert.assertEquals(expected, actual);

	}
	@Test
	public void setProfessorTest() {
		flying = new Course("Flying");
		Professor professor = new Professor("Madame Hooch");
		flying.setProfessor(professor);
		Professor expected = professor;
		Professor actual = flying.getProfessor();
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void setNameTest() {
		flying = new Course("");
		flying.setName("Flying");
		String expected = "Flying";
		String actual = flying.getName();
		
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void yearTest() {
		flying = new Course("Flying");
		flying.setYear(1995);
		
		int actual = flying.getYear();
		int expected = 1995;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void setMinGradeTest() {
		flying = new Course("Flying");
		flying.setMinGrade(Grades.O);
		
		Grades actual = flying.getMinGrade();
		Grades expected = Grades.O;
		Assert.assertEquals(expected, actual);
	}
}
