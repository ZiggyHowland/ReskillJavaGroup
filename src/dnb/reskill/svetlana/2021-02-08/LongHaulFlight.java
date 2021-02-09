package student.inheritance;

import lombok.Getter;

import java.time.LocalTime;

@Getter

public class LongHaulFlight extends Flight{

    private int checkIn = 75;
    private String type = "Long Haul";
    public LongHaulFlight(String code, String from, String to, LocalTime depatureTime, Double flightDuration) {
        super(code, from, to, depatureTime, flightDuration);
    }

}
