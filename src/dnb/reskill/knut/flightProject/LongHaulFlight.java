package dnb.reskill.knut.flightProject;

public class LongHaulFlight extends Flight{

    private boolean serveFood;


    public LongHaulFlight (String flight, String from_to, int departureTime,
                           int flightDuration, boolean serveFood)
    {
        super(flight, departureTime, from_to, flightDuration);
        this.serveFood = serveFood;
    }

    private int boardingTime(){
        return (getDepartureTime() - 2);
    }

    public String isServingFood() {
        if (serveFood == true)
            return "Flight will be serving food.\n";
        else
            return "Flight will not be serving food.\n";
    }

    @Override
    public String toString() {
        return String.format("%s\nBoarding begins at %d:00.\n%s", super.toString(), boardingTime(), isServingFood());

    }
}
