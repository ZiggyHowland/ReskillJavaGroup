package dnb.reskill.sigbjorn.day12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        regexExamples();


    }

    private static void regexExamples() {
        // * = zero or more
        String charseq = "aacaab";
        Pattern p = Pattern.compile("a*b");
        Matcher m = p.matcher(charseq);
        boolean result = m.matches();
        System.out.printf("Result: %b %n", result);

        boolean result2 = Pattern.matches("a*ca*b", charseq);
        System.out.printf("Result: %b %n", result2);
    }


}




