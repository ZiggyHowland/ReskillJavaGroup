package dnb.reskill.sigbjorn.day16_course;

import java.util.UUID;

public class Main {
    private static UUID uuid;  // The class allows you to generate unique identifiers
    private static StringBuilder sb;

    public static void main(String[] args) {
        uuid = UUID.randomUUID() ;


        // Fluent or Cascaded style programming
        System.out.println(
            new StringBuilder()
                    .append("stringA")
                    .append("stringB")
                    .append("stringC")
                    .toString()
        );



        System.out.println("Unique identification: " + uuid);

    }
}
