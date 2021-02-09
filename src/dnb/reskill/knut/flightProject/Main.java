package dnb.reskill.knut.flightProject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    FlightSchedule flightSchedule = new FlightSchedule();


        System.out.println("Listing current flights:" + flightSchedule.listallFlightCodes());

        System.out.println("Enter flight code to view details: ");
        String searchForFlight = input.next();

         if (flightSchedule.flightSchedule.containsKey(searchForFlight)){
             System.out.println(flightSchedule.findFlight(searchForFlight));
         }
         else{
             System.out.println("That flight does not exist.");
         }

        System.out.println("Enter details to enter a new long flight: ");
        System.out.print("\nFlight code: "); String flightCode = input.next();
        System.out.print("\nFrom-To: "); String from_to = input.next().trim();
        System.out.print("\nDeparturetime (int, in whole hours(ie. \"10\", or \"15\")): "); int departureTime = input.nextInt();
        System.out.print("\nFlight duration (in whole hours): "); int flightDuration = input.nextInt();
        System.out.print("\nAirline: "); String airline = input.next();

        flightSchedule.addShortFlight(flightCode,from_to, departureTime, flightDuration, airline);

        System.out.println("Listing all flights: ");
        System.out.println(flightSchedule.displayAllFlights());






    }


}
