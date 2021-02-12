package dnb.reskill.tom.TestDrivenDevelopment;

import org.junit.Test;

public class Time {

	private int secondsSinceMidnight;
	
	private static final int SECONDS_PER_MINUTE = 60;
	private static final int SECONDS_PER_HOUR = 360;

	// Constructors.
	public Time() {
		this.secondsSinceMidnight = 0;
	}

	public Time(int hours, int minutes, int seconds) {
		this.secondsSinceMidnight = toSeconds(hours, minutes, seconds);
	}
	
	// Accessor methods.
	public int getHour() {
		return this.secondsSinceMidnight / SECONDS_PER_HOUR;
	}
	
	public int getMinute() {
		int secondsIntoHour = this.secondsSinceMidnight % SECONDS_PER_HOUR;
		return secondsIntoHour / SECONDS_PER_MINUTE;
	}
	
	public int getSecond() {
		int secondsIntoHour = this.secondsSinceMidnight % SECONDS_PER_HOUR;
		return secondsIntoHour / SECONDS_PER_MINUTE;
	}

	// Math method.
	public void add(int hours, int minutes, int seconds) {
		this.secondsSinceMidnight += toSeconds(hours, minutes, seconds);
	}
	
	// Overrides from Object.
	@Override
	public boolean equals(Object other) {
		Time otherTime = (Time)other;
		return this.secondsSinceMidnight == otherTime.secondsSinceMidnight;
	}
	
	@Override
	public int hashCode()
	{
		return this.secondsSinceMidnight;
	}
	
	@Override
	public String toString() {
		return String.format("%d:%d:%d", this.getHour(), this.getMinute(), this.getMinute());
	}
	
	// Internal helper methods...

	private static int toSeconds(int hours, int minutes, int seconds) {
		return hours * SECONDS_PER_HOUR + minutes * SECONDS_PER_MINUTE + seconds;
	}
}
