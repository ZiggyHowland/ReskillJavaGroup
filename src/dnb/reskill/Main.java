package src.dnb.reskill;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----");
        System.out.println("You've now run the main() function in dnb.reskill.");
        System.out.println("There is one package per 'student'. You can write students firstname here " +
                "to run their code, or you can open the specific package and run it manually.");
        System.out.println("----");
        System.out.println("Enter student name to continue.");
        System.out.printf("%s, %s, %s, %s, %s, %s, %s or %s\n", "Arild", "Knut", "Marina", "Petter", "Salim", "Sigbjørn", "Svetlana", "Tom");
        System.out.println("Write a name, or type anything else (or press Ctrl+C) to terminate program:");
        String student = scanner.nextLine().toLowerCase();

        switch (student) {
            case "arild":
                dnb.reskill.arild.Main.main(args);
                break;
            case "knut":
                dnb.reskill.knut.Main.main(args);
                break;
            case "marina":
                dnb.reskill.marina.Main.main(args);
                break;
            case "petter":
                dnb.reskill.petter.Main.main(args);
                break;
            case "salim":
                dnb.reskill.salim.Main.main(args);
                break;
            case "sigbjørn":
                dnb.reskill.sigbjorn.Main.main(args);
                break;
            case "svetlana":
                dnb.reskill.svetlana.Main.main(args);
                break;
            case "tom":
                dnb.reskill.tom.exceptionsassertions.Main.main(args);
                break;
            default:
                System.out.println("No matches. Bye bye!");
        }

    }



}
