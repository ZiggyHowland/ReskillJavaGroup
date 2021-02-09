package dnb.reskill.sigbjorn.chap10_interfaces;

import lombok.ToString;
import java.time.ZonedDateTime; // java.util.Date | Calendar | ++

@ToString
public abstract class Flight {
    private String flightCode;
    private String from;
    private String to;
    protected ZonedDateTime timeOfDeparture;
    private int flightDurationMinutes;


    public Flight(String flightCode, String from, String to, ZonedDateTime timeOfDeparture, int flightDurationMinutes) {
        this.flightCode = flightCode;
        this.from = from;
        this.to = to;
        this.timeOfDeparture = timeOfDeparture;
        this.flightDurationMinutes = flightDurationMinutes;
    }

    public String getCheckInTime() {
        return Helper.getHourMinutesFormatted(calculateCheckInTime());
    }

    protected ZonedDateTime calculateCheckInTime() {
        return this.timeOfDeparture.minusMinutes(getPreMinutes());
    }

    public abstract int getPreMinutes(); // Must be implemented in the sub-classes



    public String getFlightCode() {
        return flightCode;
    }


    public String flightInfo() {
        return new StringBuilder()
                .append(String.format("Flight %s ", this.flightCode))
                .append(String.format("[%s -> %s] ", this.from, this.to))
                .append(String.format("Departure: %s ", Helper.getHourMinutesFormatted(this.timeOfDeparture)))
                .append(String.format("Check-in time: %s", this.getCheckInTime()))
                .toString();
    }

}
