package dnb.reskill.tom.InheritanceAndInterfaces;

import java.time.Duration;
import java.time.LocalDateTime;

public class runFlightClasses {
    public static void main(String[] args) {
        populateFlightSchedule();
        FlightSchedule.outputFlightSchedule();
        FlightSchedule.findFlight("SK900");
        FlightSchedule.findFlight("SK000");//to show the interface


    }
    private static void populateFlightSchedule() {
        //LocalDateTime.now is used just to get the concept to work
        Duration flightDurationLong = Duration.ofSeconds(45000);
        Duration flightDurationShort = Duration.ofSeconds(9000);
       // LocalDateTime flightDateAndTIme = LocalDateTime.now();
        LongHaulFlight newLongHaulFlight = new LongHaulFlight("SK800","Bergen","Los Angeles",flightDurationLong,LocalDateTime.now());
        FlightSchedule.addFlight(newLongHaulFlight);
        ShortHaulFlight newShortHaulFlight = new ShortHaulFlight("SK900","Bergen","Stavanger",flightDurationShort,LocalDateTime.now());
        FlightSchedule.addFlight(newShortHaulFlight);
        LongHaulFlight newLongHaulFlight1 = new LongHaulFlight("SK890","Oslo","Houston",flightDurationLong,LocalDateTime.now());
        FlightSchedule.addFlight(newLongHaulFlight1);
        ShortHaulFlight newShortHaulFlight1 = new ShortHaulFlight("SK991","Oslo","Kristiansand",flightDurationShort,LocalDateTime.now());
        FlightSchedule.addFlight(newShortHaulFlight1);


    }

}
