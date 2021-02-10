package Flightprogram;

import java.time.ZonedDateTime;
// import lombok.Data; --> Get error: No libraries found for lombok.Data

public class ShortHaulFlight extends Flight {

//    @Getter
    private final int CHECKIN_INTERVAL_MINUTES = 30;

    public ShortHaulFlight(String flightCode, String fromTo, ZonedDateTime departureTime, int flightDuration) {
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