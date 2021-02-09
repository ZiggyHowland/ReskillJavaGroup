package dnb.reskill.sigbjorn.chap10_interfaces;

import lombok.ToString;

import java.time.ZonedDateTime;
import java.util.Date;

@ToString(callSuper = true)
public class ShortHaulFlight extends Flight {
    private final int CHECKIN_INTERVAL_MINUTES = 35;

    public ShortHaulFlight(String flightCode, String from, String to, ZonedDateTime timeOfDeparture, int flightDurationMinutes) {
        super(flightCode, from, to, timeOfDeparture, flightDurationMinutes);
    }

    public int getPreMinutes() {
        return CHECKIN_INTERVAL_MINUTES;
    }


    public String flightInfo() {
        return new StringBuilder()
                .append(super.flightInfo())
                .append(String.format("Check-in time: %s", this.getCheckInTime()))
                .toString();
    }



}
