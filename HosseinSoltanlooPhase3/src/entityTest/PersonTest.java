package entityTest;


import org.junit.Assert;
import org.junit.Test;

import entities.BloodStatus;
import entities.House;
import entities.Person;
import entities.School;

public class PersonTest {

	Person snape;
	@Test
	public void nameTest()
	{
		snape = new Person("");
		snape.setName("Severus Snape");
		
		String actual = snape.getName();
		String expected = "Severus Snape";
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void houseTest()
	{
		House house = new House("Slyherin");
		snape = new Person("Severus Snape");
		snape.setHouse(house);
		
		House actual = snape.getHouse();
		House expected = house;
		
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void schoolTest()
	{
		School school = new School("Hogwarts");
		snape = new Person("Severus Snape");
		snape.setSchool(school);
		School actual = snape.getSchool();
		School expected = school;
		
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void bloodStatusTest()
	{
		snape = new Person("Severus Snape");
		snape.setBloodStatus(BloodStatus.Half_blood);
		BloodStatus actual = snape.getBloodStatus();
		BloodStatus expected = BloodStatus.Half_blood;
		
		Assert.assertEquals(expected, actual);
	}

}
