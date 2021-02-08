package dnb.reskill.tom.InheritanceAndInterfaces;

import java.util.HashMap;
import java.util.Set;

public class FlightSchedule implements Logger{
    private static HashMap flightSchedule = new HashMap();

    public static void addFlight (Flight f){
        flightSchedule.put(f.getFlightCode(),f);

    }

    public static void outputFlightSchedule(){
        System.out.println(flightSchedule.keySet() + flightSchedule.toString());
    }
    public static void findFlight(String flightKey){
        if(flightSchedule.containsKey(flightKey)){
            System.out.println(flightSchedule.get(flightKey).toString());
        }
        else{
            //Andy: This feels weird - probably a lot better ways of doing this?
            FlightSchedule logMsg = new FlightSchedule();
            logMsg.logStringMessage("The flight does not exist");

        }
    }
    public void logStringMessage(String msg){
        System.err.println(msg);
    }

}
