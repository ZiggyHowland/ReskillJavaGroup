package dnb.reskill.petter.inheritance_08_02_2021;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        FlightSchedule f1 = new FlightSchedule();
        f1.addFlight(); //Doesn't allow me to call this method

        f1.findFlight("H201");

        f1.displayAllFlight();
    }

}
