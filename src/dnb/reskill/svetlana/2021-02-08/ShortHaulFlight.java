package student.inheritance;

import lombok.Getter;

import java.time.LocalTime;

@Getter
public class ShortHaulFlight extends Flight {
    private int checkIn = 30;
    private String type = "Short Haul";
    public ShortHaulFlight(String code, String from, String to, LocalTime depatureTime, Double flightDuration) {
        super(code, from, to, depatureTime, flightDuration);
    }
}
