//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package dnb.reskill.tom;

import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public RegexDemo() {
    }

    public static void main(String[] args) {
        System.out.println(Pattern.matches("[\\D]+[\\d]{3}$", "hallaisiken132"));
        replaceText("hello mum", "[a-z]+");
    }

    public static boolean isMatching(String regex, String stringToTest) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(stringToTest);
        return matcher.matches();
    }

    public static void repeatedFinds(CharSequence sequence, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sequence);
        System.out.printf("\n find() calls on %s for regex %s:\n", sequence, regex);

        while(matcher.find()) {
            System.out.println("matching string " + matcher.group());
        }

    }

    public static void replaceText(CharSequence inputSequence, String regex) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(inputSequence);
        String replaceWith = "HaLLaisiken";
        if (m.find()) {
            System.out.println("it matches ");
            PrintStream var10000 = System.out;
            String var10001 = m.replaceFirst(replaceWith);
            var10000.println("String after first replacement " + var10001);
        }

        m.replaceAll(replaceWith);
        System.out.println("String after replaceAll:" + replaceWith);
    }

    public static void usingStringMethods() {
        String testString = "5034 Bergen";
        String regex = "\\d{4}\\s\\D{6}";
        if (testString.matches(regex)) {
            System.out.println("5034 Bergen matches with " + regex);
        }

        String stringWithDividers = "Hi! how are you today? The weather, its been fantastic!";
        String[] dividerComponents = stringWithDividers.split("[!?,]");
        String[] var4 = dividerComponents;
        int var5 = dividerComponents.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            String pc = var4[var6];
            System.out.println(pc);
        }

        System.out.println();
    }
}
