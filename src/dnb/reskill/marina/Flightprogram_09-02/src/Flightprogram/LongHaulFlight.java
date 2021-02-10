package Flightprogram;

import java.time.ZonedDateTime;

public class LongHaulFlight extends Flight {

    private final int CHECKIN_INTERVAL_MINUTES = 60;

    public LongHaulFlight(String flightCode, String fromTo, ZonedDateTime departureTime, int flightDuration) {
        super(flightCode, fromTo, departureTime, flightDuration);
    }

    public int getCHECKIN_INTERVAL_MINUTES() {
        return CHECKIN_INTERVAL_MINUTES;
    }

    @Override
    public String toString() {
        return super.toString() + " *Latest check in: " + CHECKIN_INTERVAL_MINUTES;
    }
}

