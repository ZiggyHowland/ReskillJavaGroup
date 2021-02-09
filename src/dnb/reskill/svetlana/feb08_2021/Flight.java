package dnb.reskill.svetlana.feb08_2021;

import java.time.LocalTime;

public abstract class Flight {
    protected String flightCode;
    protected String from;
    protected String to;
    protected LocalTime depatureTime;
    protected double flightDuration;
    protected String type;
    protected int checkIn;


    public Flight(String code, String from, String to, LocalTime depatureTime, Double flightDuration) {
        flightCode = "SK" + code;// asume that we are creating only for SAS
        this.from = from;
        this.to = to;
        this.depatureTime = depatureTime;
        this.flightDuration = flightDuration;
    }

    public String getFlightCode(){
        return flightCode;
    }

    public String getType(){
        return type;
    }

}
