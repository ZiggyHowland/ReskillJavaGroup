package Flightprogram;

import java.util.HashMap;

public class FlightSchedule {

    HashMap<String, Flight> flights = new HashMap<>();
    ConsoleLogger logger = new ConsoleLogger();

    public FlightSchedule() {
        Flight flight1 = new ShortHaulFlight("K81234", "Oslo-Bergen", Helper.createTime(11,50), 55);
        Flight flight2 = new LongHaulFlight("BB1234", "Oslo-NYC", Helper.createTime(13,00), (7 * 60));
        Flight flight3 = new ShortHaulFlight("K81236", "Oslo-Trondheim", Helper.createTime(10,00), 55);
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
        logger.logMessage("\nThis is the flight schedule:\n----------------------------");
        for (Flight flight : flights.values()) {
            System.out.println(flight);
        }
    }

    public int countShortHaulFlight() {
        logger.logMessage("\nNumber of short haul flight(s):\n----------------------------------");
        int counter = 0;
        for (Flight flight : flights.values()) {
            if (flight instanceof ShortHaulFlight) {
                counter++;
            }
        }
        return counter;
    }
}

