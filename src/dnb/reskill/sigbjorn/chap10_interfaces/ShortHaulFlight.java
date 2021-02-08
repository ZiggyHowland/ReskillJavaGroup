package dnb.reskill.sigbjorn.chap10_interfaces;

import java.time.ZonedDateTime;
import java.util.Date;

public class ShortHaulFlight extends Flight {
    private final int CHECKIN_INTERVAL_MINUTES = 35;

    public ShortHaulFlight(String flightCode, String from, String to, ZonedDateTime timeOfDeparture, int flightDurationMinutes) {
        super(flightCode, from, to, timeOfDeparture, flightDurationMinutes);
    }

    @Override
    public String getCheckInTime() {
        return Helper.getHourMinutesFormatted(calculateCheckInTime(this.timeOfDeparture, CHECKIN_INTERVAL_MINUTES)); // Considered using Polymorphism and send this instance itself into the static method

    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(super.toString())
                .append(" | Latest check in: " + this.getCheckInTime())
                .toString();
    }



}
