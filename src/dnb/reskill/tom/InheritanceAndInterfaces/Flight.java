package dnb.reskill.tom.InheritanceAndInterfaces;

import java.time.Duration;
import java.time.LocalDateTime;

//Lab
//Define an abstract superclass named Flight. A flight has info such as a flight code (e.g. SK812), from/to, time of departure, flight duration.
//
//Define two concrete subclasses - LongHaulFlight and ShortHaulFlight.
//
//Implement some polymorphic behaviour in your flight hierarchy. E.g. all flights have a "check-in-before" time, but its different for long/short-haul flights. Etc....
//
//Define a class named FlightSchedule. It keeps all the flights (use a HashMap<String,Flight> - each key is a flight code, each value is a flight).
//
//In FlightSchedule, define methods to add a flight, find a flight by its flight code, display all flights, count how many short haul flights there are. Etc...
//
//Optional extra: Define an interface called Logger, which has a single method to log a string message. Then define a class named ConsoleLogger that implements the interface and displays log messages on the console. Finally enhance your FlightSchedule class so that it receives a Logger in its ctor and uses it to write log messages someehere. This is a realistic example of the use of interfaces.
public abstract class Flight {
   private String flightCode;
   private String  departureLocation;
   private String  arrivalLocation;
   private Duration flightDuration;
   private LocalDateTime departureDateAndTime;

    public Flight(String flightCode, String departureLocation, String arrivalLocation, Duration flightDuration, LocalDateTime departureDateAndTime) {
        this.flightCode = flightCode;
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;
        this.flightDuration = flightDuration;
        this.departureDateAndTime = departureDateAndTime;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightCode=" + flightCode +
                ", departureLocation='" + departureLocation + '\'' +
                ", arrivalLocation='" + arrivalLocation + '\'' +
                ", flightDuration=" + flightDuration +
                '}';
    }
    abstract LocalDateTime getCheckinDateTime(LocalDateTime departureDateAndTime);

    public String getFlightCode() {
        return flightCode;
    }
}
