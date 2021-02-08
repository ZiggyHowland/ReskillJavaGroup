package dnb.reskill.tom.InheritanceAndInterfaces;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LongHaulFlight extends Flight{

    private LocalDateTime checkinDateTime;
    public LongHaulFlight(String flightCode, String departureLocation, String arrivalLocation, Duration flightDuration, LocalDateTime departureDateAndTime) {
        super(flightCode, departureLocation, arrivalLocation, flightDuration, departureDateAndTime);
        this.checkinDateTime = getCheckinDateTime(departureDateAndTime);
    }

    @Override
    public String toString() {

        return super.toString() + "LongHaulFlight{" +
                "checkinDateTime=" + checkinDateTime +
                '}';
    }

    public LocalDateTime getCheckinDateTime(LocalDateTime departureDateTime){
        return departureDateTime.minus(4,ChronoUnit.HOURS);

    }
}
