package dnb.reskill.sigbjorn.chap10_interfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class FlightSchedule {
    HashMap<String, Flight> flights = new HashMap<>();
    Logger logger; // Dependency injection (changed through lesson). Use the interface, NOT the class implementing it (!)

    //public enum FlightType { LONG_HAUL, SHORT_HAUL };
    // SH: Could this enum be placed in the Flight class? I tried but it created an error
    // SH It also seems awkward to create an enum when the sub-classes themselves could be used. But, is it ok and possible to use class Type as parameters?

    public FlightSchedule(Logger logger) {
        this.logger = logger;

        // Initialize some flights
        addFlight(new ShortHaulFlight("SK238", "Bergen", "Oslo", Helper.createTime(07, 00), 45));
        addFlight(new ShortHaulFlight("WF538", "Bergen", "Kristiansand", Helper.createTime(07, 40), 50));
        addFlight(new LongHaulFlight("WF392", "Bergen", "Aberdeen", Helper.createTime(10, 40), 80));
        addFlight(new LongHaulFlight("RC431", "Bergen", "Færøyene", Helper.createTime(14, 10), 85));
        addFlight(new LongHaulFlight("NWG193", "Bergen", "Stornoway", Helper.createTime(10, 00), 60));
        addFlight(new ShortHaulFlight("WF666", "Bergen", "Trondheim", Helper.createTime(10, 25 ), 65));

    }


    public void addFlight(Flight flight) {
        flights.put(flight.getFlightCode(), flight);
    }

    /**
     *
     * @return Collection of Flights
     */
    public Collection<Flight> getFlights() {
        return flights.values();
    }

    /**
     *
     * @param flightCode The code for this specific flight
     * @return Flight object or null if not found by flightCode
     */
    public Flight getFlightByFlightCode(String flightCode) {
        return flights.get(flightCode);
    }

    /**
     *
     * @param c The .class of any sub-class of Flight
     * @return ArrayList of Flights matching the type given as param
     */
    public ArrayList<Flight> getFlightsByFlightType(Class<?> c) { // Also investigated using Class<Flight> instead but did not work

        ArrayList<Flight> filteredList = new ArrayList<>();
        for (Flight f : flights.values()) {
            if (c.isInstance(f)) {
                filteredList.add(f);
            }
        }
        return filteredList;
    }

    /**
     *
     * @param c The .class of any sub-class of Flight
     * @return int giving the number of flights matching the type given as param
     */
    public int getNumberOfFlightsByFlightType(Class<?> c) {
        Collection<Flight> filteredList = this.getFlightsByFlightType(c);
        return filteredList.size();
    }


    /**
     *
     * @return int with the total number of flights in schedule
     */
    public int getNumberOfFlights() {
        return flights.size();
    }






    public void printFlights() {
        this.logger.logStringMessage("List of all flights");
        for (Flight f : flights.values()) {
            this.logger.logStringMessage(f.flightInfo());
        }
    }

    public void printFlightStatistics() {
        this.logger.logStringMessage(String.format("Total number of flights: %s", this.getNumberOfFlights()));
        this.logger.logStringMessage(String.format("Number of short haul flights: %s", this.getNumberOfFlightsByFlightType(ShortHaulFlight.class)));
        this.logger.logStringMessage(String.format("Number of long haul flights: %s", this.getNumberOfFlightsByFlightType(LongHaulFlight.class)));
    }


}
