package dnb.reskill.sigbjorn.chap10_interfaces;

import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;


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

    public abstract String getCheckInTime();


    protected static ZonedDateTime calculateCheckInTime(ZonedDateTime timeOfDeparture, int minutesPreDeparture) {
        return timeOfDeparture.minusMinutes(minutesPreDeparture);
    }

    public String getFlightCode() {
        return flightCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder()
                .append(" { Flight code: " + this.flightCode)
                .append(" | From: " + this.from)
                .append(" | To: " + this.to)
                .append(" | Time of departure: " + Helper.getHourMinutesFormatted(this.timeOfDeparture))
                .append(" | Flight duration: " + this.flightDurationMinutes)
                .append(" }");
        return sb.toString();
    }

}
