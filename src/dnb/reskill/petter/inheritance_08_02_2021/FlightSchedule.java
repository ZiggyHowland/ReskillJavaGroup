package dnb.reskill.petter.inheritance_08_02_2021;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class FlightSchedule {
    HashMap<String, Flight> allFlights = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    ConseLogger logger = new ConseLogger();

    //How can I add ShortHaulFlight and LongHaulFlight instances when this method is defined to only accept Flight-types?
    //Casting? <T> flight?
    //public void addFlight(String flightCode, Flight flight) {
    public void addFlight() throws ParseException {

        try {
            System.out.println("Flight code:");
            String flightCode = scanner.nextLine();
            System.out.println("From: (format: yyyy-MM-dd HH:mm:ss)");
            String from = scanner.nextLine();
            System.out.println("To: (format: yyyy-MM-dd HH:mm:ss)");
            String to = scanner.nextLine();
            System.out.println("Flight duration");
            double flightDuration = scanner.nextDouble();
            scanner.nextLine();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date1 = sdf.parse(from);
            Date date2 = sdf.parse(to);
            Date date3 = sdf.parse(ShortHaulFlight.getCheckInBefore());
            Date date4 = sdf.parse(LongHaulFlight.getCheckInBefore());
            long date3Long = Long.parseLong(ShortHaulFlight.getCheckInBefore());
            long date4Long = Long.parseLong(LongHaulFlight.getCheckInBefore());

            //date1.compareTo(date2);
            long dateDifferenceInLongFormat = date1.getTime() - date2.getTime();
            //String dateDifference = String.valueOf(dateDifferenceInLongFormat);

            //if (dateDifference.equals(ShortHaulFlight.getCheckInBefore())) {
            if (dateDifferenceInLongFormat >= date3Long) {
                Flight flight = new ShortHaulFlight(flightCode, from, to, flightDuration);
                allFlights.put(flightCode, flight);
                logger.conseLogger("Flight with " + flightCode + " is created");
            //} else if (dateDifference.equals(LongHaulFlight.getCheckInBefore())) {
            } else if (dateDifferenceInLongFormat >= date4Long) {
                Flight flight = new LongHaulFlight(flightCode, from, to, flightDuration);
                allFlights.put(flightCode, flight); //Needs try/catch to check for errors
                logger.conseLogger("Flight with " + flightCode + " is created");
            } else {
                //invalid -
                logger.conseLogger("Something went wrong");
                //Flight flight = new FLight(flightCode, from, to, flightDuration);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }



    }

    public void findFlight(String flightCode) {
        Flight findFlight = allFlights.get(flightCode);
        if (findFlight != null) {
            System.out.println(flightCode + " was found and have following flight information: " + findFlight.toString()); //testing
            System.out.println(flightCode + " was found and have following flight information: " + findFlight); //testing
            System.out.println(flightCode + " was found and have following flight information: " + allFlights.get(flightCode)); //testing
        } else {
            System.out.println("Not found");
        }
    }

    public void displayAllFlight() {
        for (String f : allFlights.keySet()) {
            System.out.println(f); //testing
            System.out.println(f.toString()); //testing
        }
    }

}
