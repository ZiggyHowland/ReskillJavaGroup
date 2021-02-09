package dnb.reskill.knut.flightProject;

public abstract class Flight {

    protected String flightCode;
    private String from_to;
    private int departureTime;
    private int flightDuration;


    public Flight(String flightCode) {
        this.flightCode = flightCode;
    }

    public Flight(String flight, int departureTime, String from_to, int flightDuration) {
        this.flightCode = flight;
        this.departureTime = departureTime;
        this.from_to = from_to;
        this.flightDuration = flightDuration;
    }

    public int getDepartureTime() {
        return departureTime;
    }


    public String toString() {
        return String.format("\nFlight %s, %s, departing %d:00 have a flight duration of %d hours.", flightCode, from_to, departureTime, flightDuration);
    }
}
