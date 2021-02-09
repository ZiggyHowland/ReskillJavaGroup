package dnb.reskill.knut.flightProject;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;


public class FlightSchedule {

    HashMap<String,Flight> flightSchedule = new HashMap<>();

    public FlightSchedule() {
        flightSchedule.put("SD5133", new ShortHaulFlight("SD5133","Oslo - Bergen", 15,1, "Wizz Air"));
        flightSchedule.put("TY2356", new ShortHaulFlight("TY2356","Bergen - Sandane", 19,2, "Widerøe"));
        flightSchedule.put("NO8812", new ShortHaulFlight("NO8812","Bergen - Oslo", 17,1, "Norwegian"));
        flightSchedule.put("NB0942", new LongHaulFlight("NB0942","Bergen - London", 14,3, false));
        flightSchedule.put("NO4552", new LongHaulFlight("NO4552","Oslo - New York", 14,8, true));
        flightSchedule.put("CV9040", new LongHaulFlight("CV9040","Moscow - Oslo", 14,7, true));

    }

    public void addLongFlight(String flight, String from_to, int departureTime, int flightDuration,boolean serveFood){
        flightSchedule.put(flight, new LongHaulFlight(flight, from_to, departureTime, flightDuration, serveFood));
    }
    public void addShortFlight(String flight, String from_to, int departureTime, int flightDuration,String airLine) {
        flightSchedule.put(flight, new ShortHaulFlight(flight, from_to, departureTime, flightDuration, airLine));
    }

    public Set<String> listallFlightCodes (){
        return flightSchedule.keySet();
    }

    public Flight findFlight(String flight){
        return flightSchedule.get(flight);
    }

    public Collection<Flight> displayAllFlights(){
        return flightSchedule.values();
    }


}

