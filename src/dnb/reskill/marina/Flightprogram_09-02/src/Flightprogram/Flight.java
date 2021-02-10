package Flightprogram;

import java.time.ZonedDateTime;

public abstract class Flight {

    String flightCode;
    String fromTo;
    ZonedDateTime departureTime;
    int flightDuration;

    public Flight(String flightCode, String fromTo, ZonedDateTime departureTime, int flightDuration) {
        this.flightCode = flightCode;
        this.fromTo = fromTo;
        this.departureTime = departureTime;
        this.flightDuration = flightDuration;
    }

    public String getFlightCode() {
        return this.flightCode;
    }

    public String getCheckInTime() {
        return Helper.getHourMinutesFormatted(calculateCheckInTmie());
    }

    public ZonedDateTime calculateCheckInTmie() {
        return this.departureTime.minusMinutes(getCHECKIN_INTERVAL_MINUTES());
    }

    public abstract int getCHECKIN_INTERVAL_MINUTES(); //implemented i sub classes

    @Override
    public String toString() {
        return "Flight{" +
                "flightCode='" + flightCode + '\'' +
                ", fromTo='" + fromTo + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", flightDuration=" + flightDuration +
                '}';
    }
}
