package Flightprogram;

import java.util.Collection;
import java.util.HashMap;

public class FlightSchedule {

    HashMap<String, Flight> flights = new HashMap<>();
    ConsoleLogger logger = new ConsoleLogger();

    public FlightSchedule() {
        Flight flight1 = new ShortHaulFlight("K81234", "Oslo-Bergen", "11:50", 55);
        Flight flight2 = new LongHaulFlight("BB1234", "Oslo-NYC", "13:00", (7 * 60));
        Flight flight3 = new ShortHaulFlight("K81236", "Oslo-Trondheim", "10:50", 55);
        addFlight(flight1.getFlightCode(), flight1);
        addFlight(flight2.getFlightCode(), flight2);
        addFlight(flight3.getFlightCode(), flight3);
    }

    public void addFlight(String flightCode, Flight flight) {
        flights.put(flightCode, flight);
    }

    public Flight getFlight(String flightCode) {
        return flights.get(flightCode);
    }

    public void displayFlights() {
        logger.logScheduleMessage();
        Collection<Flight> flightNames = flights.values();
        for (Flight flight : flightNames) {
            System.out.println(flight);
        }
    }

    public int countShortHaulFlight() {
        logger.nrOfShortHaulFlight();
        int counter = 0;
        for (Flight flight : flights.values()) {
            if (flight instanceof ShortHaulFlight) {
                counter++;
            }
        }
        return counter;
    }
}

