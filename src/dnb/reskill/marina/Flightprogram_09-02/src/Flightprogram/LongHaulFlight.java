package Flightprogram;

public class LongHaulFlight extends Flight {

    private final int CHECKIN_INTERVAL_MINUTES = 60;

    public LongHaulFlight(String flightCode, String fromTo, String departureTime, int flightDuration) {
        super(flightCode, fromTo, departureTime, flightDuration);
    }

    //Placeholder. To-do polymorphism "check-in-before". Need to fix departureTime...
    public String checkInBefore () {
        return "60 min før";
    }

    @Override
    public String toString() {
        return super.toString() + " *Latest check in: " + CHECKIN_INTERVAL_MINUTES;
    }
}

