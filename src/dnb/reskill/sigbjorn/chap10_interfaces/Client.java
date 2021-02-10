package dnb.reskill.sigbjorn.chap10_interfaces;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        FlightSchedule fs = new FlightSchedule(new ConsoleLogger());

        fs.printFlightStatistics();
        fs.printFlights();

        System.out.println("Search for WF666:");
        System.out.println(fs.getFlightByFlightCode("WF666").toString()); // Lombok-created.

    }
}
