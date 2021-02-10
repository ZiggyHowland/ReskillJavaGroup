package dnb.reskill.tom.InheritanceAndInterfaces;

public class runFlightClasses {
    public static void main(String[] args) {
        FlightSchedule myFlightschedule = new FlightSchedule();
        myFlightschedule.populateFlightSchedule();
        myFlightschedule.outputFlightSchedule();
        myFlightschedule.findFlight("SK900");
        myFlightschedule.findFlight("SK000");//to show the interface
    }
}
