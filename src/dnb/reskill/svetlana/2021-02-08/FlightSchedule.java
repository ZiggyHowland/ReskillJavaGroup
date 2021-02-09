package student.inheritance;

import java.time.LocalTime;
import java.util.Collection;
import java.util.HashMap;


public class FlightSchedule {
    private final HashMap<String,Flight> flightMap;
    private final ConsoleLogger logger;

    public FlightSchedule (ConsoleLogger logger) {
        flightMap = new HashMap<>();
        this.logger = logger;


    }

    public void addFlight(){
        Flight flightToAdd = createFlight();
        flightMap.put(flightToAdd.getFlightCode(), flightToAdd);
        logger.logMessage("This flight has been added: " + flightToAdd);
        logger.logMessage("------------------------------------------");

    }

    public Flight createFlight(){
        Flight flight;
        String flightCode = logger.getCode("Enter flight code for SK: ", "\\d{3}");
        String from = logger.getString("Enter from: ");
        String to = logger.getString("Enter to : ");
        LocalTime departureTime = logger.getTime("Enter time for departure: ");
        Double duration = logger.getDouble("Enter duration for this flight: ");
        String type = logger.getString("What type of flight is this: LH ot SH? ");
        while (!type.equalsIgnoreCase("sh")  &&  !type.equalsIgnoreCase("lh") ){
            type = logger.getString("Enter type: sh or lh");
        }
        if (type.equalsIgnoreCase("lh")) {
            flight = new LongHaulFlight(flightCode, from, to, departureTime, duration);

        } else  {
            flight = new ShortHaulFlight(flightCode, from, to, departureTime, duration);

        }
        return flight;
    }

    public boolean isValidFlight(String flightCode){
        return flightMap.containsKey(flightCode);
    }

    public void findFlight(){

        if (!checkCollection()){
            logger.logMessage("Nothing to show. Add flights to the system.");
            return;
        }
        String flightCode = logger.getString("Enter a flight code: ").toUpperCase();
        if (isValidFlight(flightCode)){
            Flight flightToFind = flightMap.get(flightCode);
            if (flightToFind != null){
                logger.logMessage(flightToFind.toString());
            }

        } else {
            logger.logMessage("Not found.");
        }

    }

    public void displayAllFlights(){
        if(!checkCollection()){
            logger.logMessage("Nothing to show. Add flights to the system.");
        } else {
            Collection<Flight> flights = flightMap.values();
            for (Flight f : flights) {
                logger.logMessage(f.toString());
            }
        }
        

    }

    public void countShortHaul(){
        int count = 0;

        if(checkCollection()){
            Collection<Flight> flights = flightMap.values();
            for(Flight f: flights) {
                if (f.getType().equals("Short Haul")) {
                    count++;
                }
            }
            logger.logMessage("There are " + count + " short haul flights");
        } else {
            logger.logMessage("Nothing to show. Add a flight to the system.");
        }


    }

    public void countLongHaul(){
        int count = 0;

        if(checkCollection()){
            Collection<Flight> flights = flightMap.values();
            for(Flight f: flights) {
                if (f.getType().equals("Long Haul")) {
                    count++;
                }
            }
            logger.logMessage("There are " + count + " long haul flights");
        } else {
            logger.logMessage("Nothing to show. Add a flight to the system.");
        }


    }

    private boolean checkCollection(){
        return flightMap.size() > 0;
    }


}
