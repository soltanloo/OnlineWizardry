package entityTest;

import org.junit.Assert;
import org.junit.Test;

import entities.FinishedCourse;
import entities.Grades;

public class FinishedCourseTest {
	FinishedCourse finishedCourse;
	
	@Test
	public void gradeTest() {
		Grades grade = Grades.A;
		finishedCourse = new FinishedCourse("Finished Course");
		finishedCourse.setGrade(grade);
		
		Grades actual = finishedCourse.getGrade();
		Grades expected = Grades.A;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void isPassedTest() {
		finishedCourse = new FinishedCourse("Finished Course");
		finishedCourse.setGrade(Grades.O);
		
		boolean actual = finishedCourse.isPassed();
		boolean expected = true;
		Assert.assertEquals(expected, actual);
	}
}
