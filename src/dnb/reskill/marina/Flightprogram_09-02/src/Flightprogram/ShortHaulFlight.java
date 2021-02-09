package Flightprogram;

public class ShortHaulFlight extends Flight {

    private final int CHECKIN_INTERVAL_MINUTES = 30;

    public ShortHaulFlight(String flightCode, String fromTo, String departureTime, int flightDuration) {
        super(flightCode, fromTo, departureTime, flightDuration);
    }

    //To-do polymorphism "check-in-before". Need to fix departureTime...
    public String checkInBefore () {
        return "30 min før";
    }

    @Override
    public String toString() {
        return super.toString() + " *Latest check in: " + CHECKIN_INTERVAL_MINUTES;
    }

}