package test;

import java.util.Scanner;

public class UserInput {
    private final String startMenuList = "1 - Add animal, 2 - Search for animal, 3 - Show all animals - 4 - Edit animal, 5 - Exit program";
    Scanner scanner = new Scanner(System.in);
    //FarmActions farmActions = new FarmActions();

    public int action() {
        System.out.println("Type in number for the action you want to perform");
        System.out.println(startMenuList);
        int valg = scanner.nextInt();
        return valg;
    }

    public void startmenu() {
        boolean fortsett = true;
        while (fortsett) {
            int valg = action();
            switch(valg) {
                case 1 : //Add animal
                    FarmActions.addAnimal();
                    //fortsett = false;
                    break;
                case 2 : //Search for animal
                    //fortsett = false;
                    break;
                case 3 : //Show all animals
                    FarmActions.showAllAnimals();
                    break;
                case 4: //Edit animal
                    //fortsett = false;
                    break;
                case 5 :
                    System.out.println("Exiting program...");
                    fortsett = false;
                    System.exit(0);
                default : fortsett = true;
            }

        }
    }


}
