package dnb.reskill.sigbjorn.chap10_interfaces;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class FlightSchedule {
    HashMap<String, Flight> flights = new HashMap<>();


    public FlightSchedule() {
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
     * @param flightCode
     * @return Flight object or null if not found by flightCode
     */
    public Flight findFlightByFlightCode(String flightCode) {
        return flights.get(flightCode);
    }

    /*
    public ArrayList<Flight> getAllFlights() {
        return flights.values();
    }
    */

    public int numberOfLongHaulFlights() {
        int counter = 0;
        for (Flight f : flights.values()) {
             if (f instanceof LongHaulFlight) {
                 counter++;
             }
        }
        return counter;
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
