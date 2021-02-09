package student.inheritance;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalTime;

@Getter
@ToString
public abstract class Flight {
    private String flightCode;
    private String from;
    private String to;
    private LocalTime depatureTime;
    private double flightDuration;
    protected String type;
    protected int checkIn;


    public Flight(String code, String from, String to, LocalTime depatureTime, Double flightDuration) {
        flightCode = "SK" + code;// asume that we are creating only for SAS
        this.from = from;
        this.to = to;
        this.depatureTime = depatureTime;
        this.flightDuration = flightDuration;
    }
}
