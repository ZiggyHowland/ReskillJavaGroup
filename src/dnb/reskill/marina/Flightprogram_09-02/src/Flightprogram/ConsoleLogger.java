package Flightprogram;

public class ConsoleLogger implements Logger {

    @Override
    public void logMessage(String msg) {
        System.out.println(msg);
    }

}
