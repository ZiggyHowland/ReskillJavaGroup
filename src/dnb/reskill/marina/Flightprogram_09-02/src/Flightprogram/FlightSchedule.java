package Flightprogram;

import java.util.Collection;
import java.util.HashMap;

public class FlightSchedule {

        HashMap<String, Flight> flights;

        public FlightSchedule(HashMap<String, Flight> flights) {
            this.flights = flights;

            Flight flight1 = new ShortHaulFlight("K81234", "Oslo-Bergen", "11:50", 55);
            Flight flight2 = new LongHaulFlight("BB1234", "Oslo-NYC", "13:00", (7*60));
            addFlight(flight1.getFlightCode(), flight1);
            addFlight(flight2.getFlightCode(), flight2);

        }

        public void addFlight(String flightCode, Flight flight) {
            flights.put(flightCode, flight);
        }

        public Flight getFlight (String flightCode) {
            return flights.get(flightCode);
        }

        public void displayFlights() {
            Collection<Flight> flightNames = flights.values();
            for (Flight flight : flightNames) {
                System.out.println(flight);
            }
        }

        //  public countShortHaulFlight () {
        //    int counter = 0; }
    }

