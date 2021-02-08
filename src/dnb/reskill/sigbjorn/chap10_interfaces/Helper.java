package src.dnb.reskill.sigbjorn.chap10_interfaces;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Helper {
    static final String CLOCK_FORMAT = "HH:mm";

    public static ZonedDateTime createTime(int hour, int minute) {
        int year = 2021; // Can be replaced with actual year
        int month = 2; // Can be replaced with actual month
        int day = 9; // Can be replaced with actual day
        ZoneId zoneId = ZoneId.of("UTC+02:00");
        return ZonedDateTime.of(year, month, day, hour,minute,0,0, zoneId);
    }

    public static String getHourMinutesFormatted(ZonedDateTime zdt) {
        String pattern = CLOCK_FORMAT;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return zdt.format(formatter).toString();
    }

}
