package Flightprogram;

public class Main {

    public static void main(String[] args) {

        System.out.println("test run");


        FlightSchedule flightSchedule = new FlightSchedule();
        flightSchedule.displayFlights();
        System.out.println(flightSchedule.countShortHaulFlight());
    }
}
