package java1_03.task1_2;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DeferDates {

     public static String getTimeDifference(String dateTimeInUTC, String timeZone1, String timeZone2) {
        try {
            LocalDateTime utcDateTime = LocalDateTime.parse(dateTimeInUTC.replace("Z", ""));
            ZoneId zoneId1 = ZoneId.of(timeZone1);
            ZoneId zoneId2 = ZoneId.of(timeZone2);

            ZonedDateTime zonedDateTime1 = ZonedDateTime.of(utcDateTime, ZoneId.of("UTC")).withZoneSameInstant(zoneId1);
            ZonedDateTime zonedDateTime2 = ZonedDateTime.of(utcDateTime, ZoneId.of("UTC")).withZoneSameInstant(zoneId2);

            if (zonedDateTime1.getYear() != zonedDateTime2.getYear()) {
                return "YEAR";
            } else if (zonedDateTime1.getMonth() != zonedDateTime2.getMonth()) {
                return "MONTH";
            } else if (zonedDateTime1.getDayOfMonth() != zonedDateTime2.getDayOfMonth()) {
                return "DAY";
            } else if (zonedDateTime1.getHour() != zonedDateTime2.getHour()) {
                return "HOUR";
            } else {
                return "0"; 
            }
        } catch (DateTimeException e) {
            System.err.println("Ошибка в формате даты-времени");
            return "Ошибка в формате даты-времени"; 
        }
    }
}
