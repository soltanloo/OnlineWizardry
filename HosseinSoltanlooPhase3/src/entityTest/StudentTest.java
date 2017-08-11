package entityTest;

import java.util.Vector;

import org.junit.Assert;
import org.junit.Test;

import entities.Course;
import entities.FinishedCourse;
import entities.Student;

public class StudentTest {
	Student student;
	
	@Test
	public void coursesTest() {
		student = new Student("Student");
		Vector<Course> courses = new Vector<Course>();
		courses.add(new Course("Course 1"));
		courses.add(new Course("Course 2"));
		courses.add(new Course("Course 3"));
		student.setCourses(courses);
		
		Vector<Course> actual = student.getCourses();
		Vector<Course> expected = courses;
		Assert.assertArrayEquals(expected.toArray(), actual.toArray());
	}
	
	@Test
	public void reportCardTest() {
		student = new Student("Student");
		Vector<FinishedCourse> reportCard = new Vector<FinishedCourse>();
		reportCard.add(new FinishedCourse("Course 1"));
		reportCard.add(new FinishedCourse("Course 2"));
		reportCard.add(new FinishedCourse("Course 3"));
		student.setReportCard(reportCard);
		
		Vector<FinishedCourse> actual = student.getReportCard();
		Vector<FinishedCourse> expected = reportCard;
		Assert.assertArrayEquals(expected.toArray(), actual.toArray());
	}
	
}
