package Flightprogram;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("test run");

        HashMap<String, Flight> flights = new HashMap<>();
        FlightSchedule flightSchedule = new FlightSchedule(flights);
        flightSchedule.displayFlights();
    }
}
