package Flightprogram;

public class ConsoleLogger implements Logger {

    @Override
    public void logScheduleMessage() {
        System.out.println("\nThis is the flight schedule:");
        System.out.println("----------------------------");
    }

    @Override
    public void nrOfShortHaulFlight() {
        System.out.println("\nNumber of short haul flight(s):");
        System.out.println("----------------------------------");
    }
}
