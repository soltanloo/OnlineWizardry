package entity;

public class WeekDays {
	protected double _azaneSobh;
	protected double _azaneZohr;
	protected double _azaneMaghreb;
	protected int _temp;
	protected String _name;
	
	public WeekDays(double sobh, double zohr, double maghreb, int temp, String name) {
		_azaneSobh = sobh;
		_azaneZohr = zohr;
		_azaneMaghreb = maghreb;
		_temp = temp;
		_name = name;
	}
	public WeekDays() {
		this(0, 0, 0, 0, "");
	}
	public double getAzaneSobh() {
		return _azaneSobh;
	}
	public void setAzaneSobh(double azaneSobh) {
		_azaneSobh = azaneSobh;
	}
	public double getAzaneZohr() {
		return _azaneZohr;
	}
	public void setAzaneZohr(double azaneZohr) {
		_azaneZohr = azaneZohr;
	}
	public double getAzaneMaghreb() {
		return _azaneMaghreb;
	}
	public void setAzaneMaghreb(double azaneMaghreb) {
		_azaneMaghreb = azaneMaghreb;
	}
	public int getTemp() {
		return _temp;
	}
	public void setTemp(int temp) {
		_temp = temp;
	}
	public String getName() {
		return _name;
	}
	public void setName(String name) {
		_name = name;
	}
	
	public String toString() {
		String temp = "";
		temp += "Day = " + _name + '\n'
				+ "Temp = " + _temp;
		return temp;
	}
}
