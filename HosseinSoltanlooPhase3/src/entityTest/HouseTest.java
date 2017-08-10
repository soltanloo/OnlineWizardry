package entityTest;

import org.junit.Assert;
import org.junit.Test;

import entities.House;

public class HouseTest {
	private House house;
	
	@Test
	public void getNameTest() {
		house = new House("Ravenclaw");
		String expected = "Ravenclaw";
		String actual = house.getName();
		Assert.assertEquals(expected, actual);
	}
	
}
