import entity.WeekDays;
import entityTest.WeekDaysTest;

public class Main {
	public static void main(String args[]) {
		WeekDaysTest wdt = new WeekDaysTest();
		System.out.println("Temp test: " + wdt.getTempTest(new WeekDays(4.45, 13.10, 20.18, 32, "Shanbeh"), 32));
		System.out.println("Azane Sobh test: " + wdt.getAzaneSobhTest(new WeekDays(4.45, 13.10, 20.18, 32, "Shanbeh"), 4.45));
	}
}
