package student.inheritance;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConsoleLogger implements Logger{

    Scanner scanner;
    public ConsoleLogger(Scanner sc){
        scanner = sc;
    }

    @Override
    public int getInt(String message) {
        do {
            logMessage(message);
            String userInput = scanner.next();
            try {
                return Integer.parseInt(userInput);
            } catch (NumberFormatException ex) {
                System.err.println("Not a number!");
            }
        }
        while (true);
    }

    // practicing RE
    @Override
    public String getCode(String message, String regex ) {
        logMessage(message);
        boolean valid = false;
        String code ="";

        while (!valid) {
            code = scanner.next();
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(code);
            if (m.matches()) {
                valid = true;
            } else {
                logMessage(message + " in form" + regex);
            }
        }

        return code;
    }

    @Override
    public LocalTime getTime(String message) {
        logMessage(message);
        do {
            String userInput = scanner.next();
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm").withResolverStyle(ResolverStyle.STRICT);

            try {
                return LocalTime.parse(userInput, timeFormatter);
            } catch (DateTimeParseException | NullPointerException e) {
                logMessage("Invalid time string. Give me HH:mm ");
            }
        }
        while (true);
    }


    @Override
    public double getDouble(String message) {
        do {
            logMessage(message);
            String userInput = scanner.next();
            try {
                return Double.parseDouble(userInput);
            } catch (NumberFormatException ex) {
                System.err.println("Wrong format! Try again");
            }
        }
        while (true);
    }

    @Override
    public String getString(String message) {
        logMessage(message);

        return scanner.next();
    }


    @Override
    public void logMessage(String message){
        System.out.println(message);
    }
}
