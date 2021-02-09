package student.inheritance;

import java.util.Scanner;

public class Menu {

    public void menuStart() {
        Scanner scanner = new Scanner(System.in);
        ConsoleLogger logger = new ConsoleLogger(scanner);

       FlightSchedule flightSchedule= new FlightSchedule(logger);
        int userChoice;
        System.out.println("\n WELCOME\n -------------------------");

        do {
            userChoice = logger.getInt("\n What do you want to do? \n 1: Add a flight\n 2: Find a flight\n 3: Display all the flights \n " +
                    "4: Count number of short haul flights\n 5: Number of long haul flights \n 6: Exit \n");
            switch (userChoice) {

                case 1:
                    flightSchedule.addFlight();
                    break;

                case 2:
                    flightSchedule.findFlight();
                    break;

                case 3:
                    flightSchedule.displayAllFlights();
                    break;

                case 4:
                    flightSchedule.countShortHaul();
                    break;

                case 5:
                    flightSchedule.countLongHaul();
                    break;
            }
        }
        while (userChoice != 6);
    }
}
