package src.dnb.reskill.sigbjorn.chap10_interfaces;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.HashMap;

public class FlightSchedule {
    HashMap<String, Flight> flights;

    public FlightSchedule() {
        Flight flight = new LongHaulFlight("RC431", "Bergen", "Færøyene", Helper.createTime(14, 10), 85);

        System.out.println( flight.toString() );


        flights = new HashMap<>();
        flights.put(flight.getFlightCode(), flight);





    }


}
