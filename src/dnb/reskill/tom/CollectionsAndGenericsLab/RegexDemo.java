package src.dnb.reskill.tom.CollectionsAndGenericsLab;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {


    public static void main(String[] args) {


        //a series of regular expression tests

     /*  System.out.println(isMatching(".x.a.","yxpar"));//test . which stands for any character (true)
        System.out.println(isMatching(".x.a.","yapar"));//test . which stands for any character (false)
        System.out.println(isMatching("[agh]?","a"));//test that ag or h occurs, but only once and one char (true)
        System.out.println(isMatching("[a]?","ag"));//test that a occurs, but only once and one char (false)
        System.out.println(isMatching("[a]+","aa"));//test that a occurs one or more then one time (true)
        System.out.println(isMatching("[a]+","h"));//test that a occurs one or more then one time (false)
        System.out.println(Pattern.matches("\\d","1")); //test for a digit (true)
        System.out.println(Pattern.matches("\\d","11")); //test for a digit (false)
        System.out.println(Pattern.matches("[\\d]{3}\\Dx?y?","188dy")); //test for a little more complex regex (true)*/
        System.out.println((Pattern.matches("[\\D]+[\\d]{3}$","hallaisiken132"))); // TRUE
        //repeatedFinds("","/hallo/hallaisiken132/hello");
        repeatedFinds("/hallo/hallaisiken132/hello", "[a-z]+\\d{3}");
        //replaceText("hello mum", "[a-z]+");
        //usingStringMethods();

    }
    public static boolean isMatching(String regex, String stringToTest){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(stringToTest);
        return matcher.matches();
    }

    public static void repeatedFinds(CharSequence sequence, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sequence);

        System.out.printf("\n find() calls on %s for regex %s:\n", sequence, regex);
        //int numberOfGroups = matcher.groupCount();
        //System.out.println("number of groups:" + numberOfGroups);

        while(matcher.find()){
            System.out.println("matching string " + matcher.group());
        }
    }

    public static String findFormattedText(String stringToFind,String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(stringToFind);
        while (matcher.find()) {
            return matcher.group();
        }
        return null;
    }





    public static void replaceText (CharSequence inputSequence, String regex){
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(inputSequence);
        String replaceWith = "HaLLaisiken";
        if (m.find()){
            System.out.println("it matches " );
            System.out.println("String after first replacement " + m.replaceFirst(replaceWith));
        }
        m.replaceAll(replaceWith);
        System.out.println("String after replaceAll:" + replaceWith);
    }
    public static void usingStringMethods(){
        //I had to look at solution code for this one
        String testString = "5034 Bergen";
        String regex = "\\d{4}\\s\\D{6}";
        if(testString.matches(regex))
            System.out.println("5034 Bergen matches with " + regex );
        String stringWithDividers = "Hi! how are you today? The weather, its been fantastic!";
        String[] dividerComponents = stringWithDividers.split("[!?,]"); //TODO ASK for explanation of brackets
        for (String pc : dividerComponents) {
            System.out.println(pc);
        }
        System.out.println();
    }
}
