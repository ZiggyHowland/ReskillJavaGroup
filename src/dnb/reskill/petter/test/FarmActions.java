package dnb.reskill.petter.test;

import java.util.ArrayList;
import java.util.Scanner;

public class FarmActions {
    //Not learned how to accept all types of object
    //Making scanner and animalList static let's me set addAnimal and showAllAnimals without creating empty object
    static ArrayList<Animal> animalList = new ArrayList<>(); //Is it ok to make all this static, so I can access them from UserInput class?
    static Scanner scanner = new Scanner(System.in); //Is it ok to make all this static, so I can access them from UserInput class?


    public static void addAnimal() {
        //I also tried this with getter and setter, but toString got same result for id
        //The problem is that every object created receives the same id (last id created)

        int size = animalList.size();
        int id = size+1;

        System.out.println("Name: "); //This line get's skipped after addAnimal() is ran for the second time. See any reason?
        String name = scanner.nextLine();

        System.out.println("Color: ");
        String color = scanner.nextLine();

        System.out.println("Animal type: ");
        String animalType = scanner.nextLine();

        System.out.println("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        //Why does this add
        animalList.add(new Animal(id, name, color, animalType, age)); //I can't see anything wrong here
    }

    //I don't think this method have any errors
    public static void showAllAnimals() {
        for (Animal a : animalList) {
            System.out.println(a.toString());
        }
    }
}
