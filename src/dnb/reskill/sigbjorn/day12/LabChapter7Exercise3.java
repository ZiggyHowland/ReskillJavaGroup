package src.dnb.reskill.sigbjorn.day12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LabChapter7Exercise3 {

    public static void run() {
        //simpleRegEx();
        matchingByRegEx("Sigbjørn tlf +47 91 12 07 94", "\\+\\d{2}\\s*[\\d\\s]{8,11}");
        //repeatedFinds("c:/user/AB3837/project/java", "\\w+");
        //stringFunctions();
    }


    private static void regex() {
        // Avoid double backslashes???
        //private static final String TABLE_REGEX = Pattern.quote("${table}");

        String s = "";



    }




    private static void stringFunctions() {
        String story = "Hi. How do you like it here? Fine, thank you! I'm doing great.";
        String[] parts = story.split("[.?!]");
        for (String p: parts) {
            System.out.println(p);
        }
    }


    private static void repeatedFinds(String source, String regex) {
        System.out.printf("Performs repeated find() on '%1$s' using regeg '%2$s'\n", source, regex);

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(source);

        while (m.find()) {
            System.out.printf("find() found: %s \n", m.group());
        }

    }

    private static void matchingByRegEx(String source, String regex) {
        System.out.printf("Checking '%s' for regex '%s':\n", source, regex);

        Pattern p = Pattern.compile(regex); // A factory method: creates an instance of Pattern
        Matcher m = p.matcher(source);

        // matches() - does the string give a full match?
        if (m.matches()) {
            System.out.printf("matches() returns a match: %s %n", m.group());
        }
        else {
            System.out.println("matches() returns no match");
        }

        // lookingAt() - does the string match from the start?
        m.reset();
        if (m.lookingAt()) {
            System.out.printf("lookingAt() returns a match: %s %n", m.group());
        }
        else {
            System.out.println("lookingAt() returns no match");
        }

        // find()
        m.reset();
        if (m.find()) {
            System.out.printf("find() returns a match: %s %n", m.group());
        }
        else {
            System.out.println("find() returns no match");
        }

    }

    private static void simpleRegEx() {
        // * = zero or more
        String charseq = "aacaab";
        Pattern p = Pattern.compile("a*b", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE); // Why "|"???
        Matcher m = p.matcher(charseq);
        boolean result = m.matches();
        System.out.printf("Result: %b %n", result);

        boolean result2 = Pattern.matches("a*ca*b", charseq);
        System.out.printf("Result: %b %n", result2);
    }




}
