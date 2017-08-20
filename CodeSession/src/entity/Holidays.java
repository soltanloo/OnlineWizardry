package entity;

public class Holidays extends WeekDays {
	String _occasion;
	
	public Holidays(String occasion, int temp, String name) {
		super(0, 0, 0, temp, name);
		_occasion = occasion;
	}
	public Holidays() {
		this("", 0, "");
	}
	public String getOccasion() {
		return _occasion;
	}
	public void setOccasion(String occasion) {
		_occasion = occasion;
	}
}
