package dnb.reskill.sigbjorn.chap10_interfaces;

import lombok.ToString;
import java.time.ZonedDateTime;


@ToString(callSuper = true)
public class LongHaulFlight extends Flight {
    private final int CHECKIN_INTERVAL_MINUTES = 120;

    public LongHaulFlight(String flightCode, String from, String to, ZonedDateTime timeOfDeparture, int flightDurationMinutes) {
        super(flightCode, from, to, timeOfDeparture, flightDurationMinutes);
    }

    public int getPreMinutes() {
        return CHECKIN_INTERVAL_MINUTES;
    }


}
