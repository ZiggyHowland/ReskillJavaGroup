package src.dnb.reskill.sigbjorn.day16_course;

import java.util.UUID;

public class Main {
    private static UUID uuid;  // The class allows you to generate unique identifiers

    public static void main(String[] args) {
        uuid = UUID.randomUUID() ;

        System.out.println("Unique identification: " + uuid);

    }
}
