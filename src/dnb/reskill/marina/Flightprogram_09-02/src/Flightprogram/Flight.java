package Flightprogram;

public abstract class Flight {

    String flightCode;
    String fromTo;
    String departureTime;
    int flightDuration;

    public Flight(String flightCode, String fromTo, String departureTime, int flightDuration) {
        this.flightCode = flightCode;
        this.fromTo = fromTo;
        this.departureTime = departureTime;
        this.flightDuration = flightDuration;
    }

    public String getFlightCode (){
        return this.flightCode;
    }

    public String checkInBefore () {
        return "-1";
    }

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
