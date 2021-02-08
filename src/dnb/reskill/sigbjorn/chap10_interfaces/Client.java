package dnb.reskill.sigbjorn.chap10_interfaces;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        FlightSchedule fs = new FlightSchedule();

        System.out.printf("All flights: %s %n", fs.toString());

        System.out.println("Number of long haul flights: " + fs.numberOfLongHaulFlights());

        System.out.println("Search for WF666:");
        System.out.println(fs.findFlightByFlightCode("WF666"));

    }
}
