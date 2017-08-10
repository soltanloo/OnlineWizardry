package entities;

public class Person {
	private String _name;
	private House _house;
	private BloodStatus _bloodStatus;
	private School _school;
	private String _birthday;
	
	public Person(String name) {
		_name = name;
		_house = new House("");
		_school = new School("");
		_birthday = "";
	}
	public Person(String name, House house, BloodStatus bloodStatus, School school, String birthday) {
		_name = name;
		_house = house;
		_bloodStatus = bloodStatus;
		_school = school;
		_birthday = birthday;
	}
	public String getName() {
		return _name;
	}
	public void setName(String name) {
		_name = name;
	}
	public House getHouse() {
		return _house;
	}
	public void setHouse(House house) {
		_house = house;
	}
	public BloodStatus getBloodStatus() {
		return _bloodStatus;
	}
	public void setBloodStatus(BloodStatus bloodStatus) {
		_bloodStatus = bloodStatus;
	}
	public School getSchool() {
		return _school;
	}
	public void setSchool(School school) {
		_school = school;
	}
	public String getBirthday() {
		return _birthday;
	}
}
