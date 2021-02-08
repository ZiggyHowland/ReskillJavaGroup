package dnb.reskill.petter.inheritance_08_02_2021;

import java.time.LocalDate;
import java.time.LocalTime;

public class ShortHaulFlight extends Flight {
    private static String checkInBefore = "00-45-00";
    private static int numbersOfSHF; //ShortHaulFlight = SHF

    public ShortHaulFlight(String flightCode, String from, String to, double flightDuration) {
        super(flightCode, from, to, flightDuration);
    }

    public static String getCheckInBefore() {
        return checkInBefore;
    }

    public static int getNumbersOfSHF() {
        return numbersOfSHF;
    }

    public static void setNumbersOfSHF() {
        numbersOfSHF = numbersOfSHF + 1;
    }

    @Override
    public String toString() {
        return "ShortHaulFlight{" +
                "checkInBefore=" + checkInBefore +
                "} " + super.toString();
    }
}
