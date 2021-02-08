package dnb.reskill.sigbjorn.day11;

import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;
import java.util.regex.Pattern;

public class LabChapter7Exercise2 {
    public static void main(String[] args) {
        formattingExercises();

        //*** Copied from demo
        //demoNumberFormatting();
        //demoTimeFormatting();
        //demoDateFormatting();

    }



    private static void formattingExercises() {
        StringBuilder sb = new StringBuilder(100);
        Formatter formatter = new Formatter(sb, new Locale("no")); // nno/nn = Nynorsk, nob/nb = Bokmål, // nor/no = Norsk

        // 4$    = argumentIndex
        // +,(   = three flags: always sign, thousand grouping, minus parantheses
        // 13    = width, minimum number of chars (--- not effecting float below ----)
        // .4    = maximum number of chars, or max number of decimal points for fractions
        // f     = conversion, decimal integer

        formatter.format("%4$+(,13.4f - %d - %d - %d\n", 3, 4, 5, -684748563.342);
        System.out.println(sb.toString());


        // 2$    = argumentIndex
        // -     = one flag: left justification
        // 15    = width, minimum number of chars
        // s     = conversion, string

        // 1$    = argumentIndex
        // s     = conversion, string

        formatter.format("%2$-15s %1$s\n", "World", "Hello");
        System.out.println(sb.toString());

        // Variant without left justification
        formatter.format("%2$15s %1$s\n", "World", "Hello");
        System.out.println(sb.toString());

    }



    private static void demoDateFormatting() {

        System.out.println("\nFormatting dates:");

        Calendar calendar = Calendar.getInstance();

        System.out.printf("Month name:   %1$tB %1$tb  %n", calendar);
        System.out.printf("Day name:     %1$tA %1$ta  %n", calendar);

        System.out.printf("Year:         %1$tY %1$ty  %n", calendar);
        System.out.printf("Month:        %1$tm        %n", calendar);
        System.out.printf("Day of month: %1$td %1$te  %n", calendar);
        System.out.printf("Day of year:  %1$tj        %n", calendar);

        System.out.printf("MM/DD/YY:     %1$tD %n", calendar);
        System.out.printf("YYYY-MM-DD:   %1$tF %n", calendar);

        System.out.printf("Complete d/t: %1$tc %n", calendar);
    }




    private static void demoTimeFormatting() {

        System.out.println("\nFormatting times:");

        Calendar calendar = Calendar.getInstance();

        System.out.printf("Time (24):     %1$tH:%1$tM:%1$tS       %n", calendar);
        //System.out.printf("Time (12):     %1$tr:%1$tM:%1$tS %1$tp %n", calendar);

        //System.out.printf("HH:MM (24):    %1$tR %n", calendar);
        System.out.printf("HH:MM:SS (24): %1$tT %n", calendar);
        //System.out.printf("HH:MM:SS (12): %1$tr %n", calendar);

        //System.out.printf("Timezone:      %1$tz %n", calendar);
        //System.out.printf("Timezone name: %1$tZ %n", calendar);
    }



    private static void demoNumberFormatting() {
//        'b', 'B'	general	        If the argument arg is null, then the result is "false". If arg is a boolean or Boolean, then the result is the string returned by String.valueOf(arg). Otherwise, the result is "true".
//        'h', 'H'	general	        If the argument arg is null, then the result is "null". Otherwise, the result is obtained by invoking Integer.toHexString(arg.hashCode()).
//        's', 'S'	general	        If the argument arg is null, then the result is "null". If arg implements Formattable, then arg.formatTo is invoked. Otherwise, the result is obtained by invoking arg.toString().
//        'c', 'C'	character	    The result is a Unicode character
//        'd'	    integral	    The result is formatted as a decimal integer
//        'o'	    integral	    The result is formatted as an octal integer
//        'x', 'X'	integral	    The result is formatted as a hexadecimal integer
//        'e', 'E'	floating point	The result is formatted as a decimal number in computerized scientific notation
//        'f'	    floating point	The result is formatted as a decimal number
//        'g', 'G'	floating point	The result is formatted using computerized scientific notation or decimal format, depending on the precision and the value after rounding.
//        'a', 'A'	floating point	The result is formatted as a hexadecimal floating-point number with a significand and an exponent
//        't', 'T'	date/time	    Prefix for date and time conversion characters. See Date/Time Conversions.
//        '%'	    percent	        The result is a literal '%' ('\u0025')
//        'n'	    line separator	The result is the platform-specific line separator

        System.out.println("\nFormatting numbers:");

        System.out.printf("Booleans:    %b %B %n",  true, false);
        System.out.printf("Hex:         %h %H %n",  867576, 867576);
        System.out.printf("Character:   %c %C %n",  'a',  '\u0068');
        System.out.printf("Decimal int: %d    %n",  63);
        System.out.printf("Octal int:   %o    %n",  63);
        System.out.printf("Hex int:     %x %X %n",  63, 63);
        System.out.printf("Float:       %f    %n",  123456.798);
        System.out.printf("Float (e):   %e %E %n",  123456.798,  0.123456798);
        System.out.printf("Exam score:  %d%%  %n",  99);
    }



}

