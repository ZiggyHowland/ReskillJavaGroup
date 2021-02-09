package dnb.reskill.svetlana.feb08_2021;

import java.time.LocalTime;


public class ShortHaulFlight extends Flight {
    private int checkIn = 30;
    private String type = "Short Haul";
    public ShortHaulFlight(String code, String from, String to, LocalTime departureTime, Double flightDuration) {
        super(code, from, to, departureTime, flightDuration);
    }

    @Override
    public String getType(){
        return type;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightCode='" + flightCode + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", depatureTime=" + depatureTime +
                ", flightDuration=" + flightDuration +
                ", type='" + type + '\'' +
                ", checkIn=" + checkIn +
                '}';
    }


}