package dnb.reskill.tom;

import java.util.ArrayList;
import java.util.Scanner;

// This class comprises static helper methods.
public class Helper {

    // Create a Scanner object, to get keyboard input.
    private static Scanner scanner = new Scanner(System.in);

    // Get a String from the user.
    public static String getString(String promptMsg) {
        System.out.printf("%s", promptMsg);
        return scanner.next();
    }

    // Get a double from the user.
    public static double getDouble(String promptMsg) {
        System.out.printf("%s", promptMsg);
        return scanner.nextDouble();
    }

    // Get an int from the user.
    public static int getInt(String promptMsg) {
        System.out.printf("%s", promptMsg);
        return scanner.nextInt();
    }

    // Work with a list of Strings.
    public static void manageFootballTeams() {

        // Done: Declare a list to hold football teams (i.e. Strings).
        //       You can create either an ArrayList or a LinkedList.

        ArrayList<String> listOfFootballTeams  = new ArrayList<String>();

        // Miscellaneous helper variables.
        String team;
        int index;

        // Display menu options in a loop.
        int option = -1;
        do {

            try {
                System.out.println();
                System.out.println("---------------------------------------------------------");
                System.out.println("Options for managing a list of football teams (Strings)"  );
                System.out.println("---------------------------------------------------------");
                System.out.println("1. Append team");
                System.out.println("2. Add team at index");
                System.out.println("3. Set team at index");
                System.out.println("4. Remove team at index");
                System.out.println("5. Remove specified team");
                System.out.println("6. List all teams");
                System.out.println("7. Quit");

                option = getInt("\nEnter option => ");

                switch (option) {

                    case 1:
                        team = getString("Enter team: ");
                        // Done: Append team to list, and display success/failure message.
                        //       Display a success/failure message.
                        boolean addSuccess = listOfFootballTeams.add(team);
                        listAddSuccess(addSuccess);
                        break;

                    case 2:
                        team  = getString("Enter team: ");
                        index = getInt("Enter index: ");
                        boolean listAddSuccess = true;
                        // Done: If index is within range, add team at specified index in list.
                        //       Note, you ARE allowed to add an item at one-beyond-the-end of the list (similar effect to appending).
                        //       Display a success/failure message.
                        if (index < listOfFootballTeams.size()){
                            listOfFootballTeams.add(index,team);
                            listAddSuccess(listAddSuccess);
                        }
                        else {
                            listAddSuccess = listOfFootballTeams.add(team);
                            listAddSuccess(listAddSuccess);
                        }
                        break;

                    case 3:
                        team  = getString("Enter team: ");
                        index = getInt("Enter index: ");
                        // Done: If index is within range, set team at specified index in list.
                        //       Display a success/failure message.

                        for (int i=0 ; i<listOfFootballTeams.size();i++){
                            System.out.println(listOfFootballTeams.toString());

                        }

                        break;

                    case 4:
                        index = getInt("Enter index: ");
                        // Done: If index is within range, remove team at specified index in list.
                        //       Display a success/failure message.
                        if (index<=listOfFootballTeams.size()) {
                            listOfFootballTeams.remove(index);
                            listAddSuccess(true);

                        }
                        else
                            listAddSuccess(false);
                        break;

                    case 5:
                        team = getString("Enter team: ");
                        // TODO: Remove team from list.
                        //       Display a success/failure message.
                        break;

                    case 6:
                        // Done: Display all items in list.
                        displayListContent(listOfFootballTeams);
                        break;

                    case 7:
                        // This is a valid option, but there's nothing to do here.
                        break;

                    default:
                        System.out.println("Invalid option selected.");
                }

            } catch (Exception ex) {
                System.out.printf("Exception occurred: %s.\n", ex.getMessage());
            }

        } while (option != 7);


    }
    public static void listAddSuccess (boolean isAdded){
        if (isAdded)

            System.out.println("Team added succesfully");
        else
            System.out.println("fail: Team not added to list ");

    }

    // Done: Define a generic method here, to display all the items in a Collection<T>.
    public static void displayListContent(ArrayList list){
        if(!list.isEmpty()) {
            System.out.println(list.toString());
        }
        else{
            System.out.println("List is empty");
        }

    }



}
