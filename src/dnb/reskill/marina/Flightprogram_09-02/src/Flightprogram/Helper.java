package Flightprogram;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Helper {

    private static final String CLOCK_FORMAT = "HH:mm";

    public static ZonedDateTime createTime (int hour, int minutes) {
        int year = 2021;
        int month = 2;
        int day = 9;
        ZoneId zoneID = ZoneId.of("UTC+02:00");
        return ZonedDateTime.of(year, month, day, hour, minutes, 0, 0 , zoneID);
    }
    
    public static String getHourMinutesFormatted (ZonedDateTime zdt) {
        String pattern = CLOCK_FORMAT;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return zdt.format(formatter).toString();
    }



}
