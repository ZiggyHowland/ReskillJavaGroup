package dnb.reskill.sigbjorn.chap10_interfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class FlightSchedule {
    HashMap<String, Flight> flights = new HashMap<>();
    ConsoleLogger logger;

    public enum FlightType { LONG_HAUL, SHORT_HAUL };
    // SH: Could this enum be placed in the Flight class? I tried but it created an error
    // SH It also seems awkward to create an enum when the sub-classes themselves could be used. But, is it ok and possible to use class Type as parameters?

    public FlightSchedule(ConsoleLogger logger) {
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
     * @param flightType Enum parameter matching the sub-classes of Flight
     * @return ArrayList of Flights of the matching type
     */
    public ArrayList<Flight> getFlightsByFlightType(FlightType flightType) {
        ArrayList<Flight> filteredList = new ArrayList<>();

        for (Flight f : flights.values()) {
            switch (flightType) {
                case LONG_HAUL:
                    if (f instanceof LongHaulFlight)
                        filteredList.add(f);
                    break;
                case SHORT_HAUL:
                    if (f instanceof ShortHaulFlight)
                        filteredList.add(f);
                    break;
                default:
                    // No action
            }
        }
        return filteredList;
    }

    /**
     *
     * @return int with the total number of flights in schedule
     */
    public int getNumberOfFlights() {
        return flights.size();
    }

    /**
     *
     * @param flightType Enum parameter matching the sub-classes of Flight
     * @return int with the number of flights matching the flight type
     */
    public int getNumberOfFlightsByFlightType(FlightType flightType) {
        Collection<Flight> filteredList = this.getFlightsByFlightType(flightType);
        return filteredList.size();
    }


    public void printFlights() {
        this.logger.logStringMessage("List of all flights");
        for (Flight f : flights.values()) {
            this.logger.logStringMessage(f.toString());
        }
    }

    public void printFlightStatistics() {
        this.logger.logStringMessage(String.format("Total number of flights: %s", this.getNumberOfFlights()));
        this.logger.logStringMessage(String.format("Number of short haul flights: %s", this.getNumberOfFlightsByFlightType(FlightType.SHORT_HAUL)));
        this.logger.logStringMessage(String.format("Number of long haul flights: %s", this.getNumberOfFlightsByFlightType(FlightType.LONG_HAUL)));
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Flight f : flights.values()) {
            sb.append(f.toString() + "\n" );
        }
        return sb.toString();
    }

}
