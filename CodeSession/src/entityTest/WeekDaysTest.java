package entityTest;

import entity.WeekDays;

public class WeekDaysTest {
	private WeekDays _wd;
	
	public void constructorTest() {
		_wd = new WeekDays(4.45, 13.10, 20.18, 32, "Shanbeh");
		System.out.println(_wd.toString());
	}
	public boolean getTempTest(WeekDays wd, int expected) {
		int actual = wd.getTemp();
		return actual == expected;
	}
	public boolean getAzaneSobhTest(WeekDays wd, double expected) {
		double actual = wd.getAzaneSobh();
		return actual == expected;
	}
	public boolean getAzaneZohrTest(WeekDays wd, double expected) {
		double actual = wd.getAzaneZohr();
		return actual == expected;
	}
	public boolean getAzaneMaghrebTest(WeekDays wd, double expected) {
		double actual = wd.getAzaneMaghreb();
		return actual == expected;
	}
}
