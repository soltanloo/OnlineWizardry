package entityTest;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import entities.Course;
import entities.Professor;

public class ProfessorTest {
	Professor professor;
	
	@Test
	public void coursesTest() {
		Map<Integer, Course> courses = new HashMap<Integer, Course>();
		professor = new Professor("Professor");
		courses.put(1895, new Course("Course 1"));
		courses.put(1895, new Course("Course 2"));
		courses.put(1895, new Course("Course 3"));
		professor.setCourses(courses);
		Map<Integer, Course> actual = professor.getCourses();
		Map<Integer, Course> expected = courses;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void notesTest() {
		String notes = "Note 1 - Note 2 - Note 3";
		professor = new Professor("Professor");
		professor.setNotes(notes);
		
		String actual = professor.getNotes();
		String expected = notes;
		Assert.assertEquals(expected, actual);
	}
}
