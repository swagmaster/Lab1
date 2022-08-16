public class Time {
	
	//instance variables
	private int second,minute,hour;
	
	public Time(int newSec, int newMin) {
		second = newSec;
		minute = newMin;
	}
	
	public int getSecond() {
		return second;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getHour() {
		return hour;
	}
	
	public void setSecond(int second) {
		this.second = second;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}
	
	public void setHour(int hour) {
		this.hour = hour;
	}
}
