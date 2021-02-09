package dnb.reskill.svetlana.feb08_2021;


import java.time.LocalTime;

public class LongHaulFlight extends Flight{

    private int checkIn = 75;
    private String type = "Long Haul";
    public LongHaulFlight(String code, String from, String to, LocalTime depatureTime, Double flightDuration) {
        super(code, from, to, depatureTime, flightDuration);
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
