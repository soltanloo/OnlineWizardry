package entities;

import java.util.Date;

public class Person {
	private String _name;
	private String _houseName;
	private String _bloodStatus;
	private String _school;
	private Date _birthday;
	
	public Person(String name) {
		_name = name;
	}
	public Person(String name, String houseName, String bloodStatus, String school, Date birthday) {
		_name = name;
		_houseName = houseName;
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
	public String getHouseName() {
		return _houseName;
	}
	public void setHouseName(String houseName) {
		_houseName = houseName;
	}
	public String getBloodStatus() {
		return _bloodStatus;
	}
	public void setBloodStatus(String bloodStatus) {
		_bloodStatus = bloodStatus;
	}
	public String getSchool() {
		return _school;
	}
	public void setSchool(String school) {
		_school = school;
	}
	public Date getBirthday() {
		return _birthday;
	}
}
