package dnb.reskill.tom.InheritanceAndInterfaces;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;

public class FlightSchedule{
    private HashMap flights = new HashMap();

    private ConsoleLogger myLogger = new ConsoleLogger();
    public void addFlight (Flight f){
        flights.put(f.getFlightCode(),f);
    }

    public  void outputFlightSchedule(){
        System.out.println(flights.keySet() + flights.toString());
    }
    public  void findFlight(String flightKey){
        if(flights.containsKey(flightKey)){
            System.out.println(flights.get(flightKey).toString());
        }
        else{
            myLogger.logStringMessage("Error, flight key does not exist");
        }
    }
    public void populateFlightSchedule() {
        //LocalDateTime.now is used just to get the concept to work
        Duration flightDurationLong = Duration.ofSeconds(45000);
        Duration flightDurationShort = Duration.ofSeconds(9000);
        // LocalDateTime flightDateAndTIme = LocalDateTime.now();
        LongHaulFlight newLongHaulFlight = new LongHaulFlight("SK800","Bergen","Los Angeles",flightDurationLong, LocalDateTime.now());
        addFlight(newLongHaulFlight);
        ShortHaulFlight newShortHaulFlight = new ShortHaulFlight("SK900","Bergen","Stavanger",flightDurationShort,LocalDateTime.now());
        addFlight(newShortHaulFlight);
        LongHaulFlight newLongHaulFlight1 = new LongHaulFlight("SK890","Oslo","Houston",flightDurationLong,LocalDateTime.now());
        addFlight(newLongHaulFlight1);
        ShortHaulFlight newShortHaulFlight1 = new ShortHaulFlight("SK991","Oslo","Kristiansand",flightDurationShort,LocalDateTime.now());
        addFlight(newShortHaulFlight1);


    }

}
