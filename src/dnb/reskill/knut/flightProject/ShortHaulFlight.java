package dnb.reskill.knut.flightProject;

public class ShortHaulFlight extends Flight{

    private String airline;


    public ShortHaulFlight (String flight, String from_to, int departureTime,
                           int flightDuration, String airline)
    {
        super(flight, departureTime, from_to, flightDuration);
        this.airline = airline;
    }

    private int boardingTime(){
        return (getDepartureTime() - 1);
    }


    @Override
    public String toString() {
        return String.format("%s\nBoarding begins at %d:00.\nAirline is %s.", super.toString(), boardingTime(), airline);

    }
}
