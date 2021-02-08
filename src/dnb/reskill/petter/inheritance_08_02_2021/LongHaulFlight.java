package dnb.reskill.petter.inheritance_08_02_2021;

import java.time.LocalDate;

public class LongHaulFlight extends Flight {
    private static String checkInBefore = "01-30-00";
    private int numbersOfLHF; //LongHaulFlight = LHF

    public LongHaulFlight(String flightCode, String from, String to, double flightDuration) {
        super(flightCode, from, to, flightDuration);
    }

    public static String getCheckInBefore() {
        return checkInBefore;
    }

    public int getNumbersOfLHF() {
        return numbersOfLHF;
    }

    public void setNumbersOfLHF() {
        this.numbersOfLHF = numbersOfLHF + 1;
    }

    @Override
    public String toString() {
        return "LongHaulFlight{" +
                "numbersOfLHF=" + numbersOfLHF +
                "} " + super.toString();
    }
}
