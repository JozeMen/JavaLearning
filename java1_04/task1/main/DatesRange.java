package java1_04.task1.main;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class DatesRange {
    public static LocalDate[] getCalendarsBetween(LocalDate startCalendar, LocalDate endCalendar) {
        long diff = ChronoUnit.DAYS.between(startCalendar, endCalendar);
        LocalDate[] calendars = new LocalDate[(int) diff + 1];
        int i = 0;
        if (startCalendar.isBefore(endCalendar) || startCalendar.isEqual(endCalendar)) {
            System.out.println((int) diff + 1);
            while (i < calendars.length) {   
                
                calendars[i] = LocalDate.of(startCalendar.getYear(), startCalendar.getMonth(), startCalendar.getDayOfMonth());
                startCalendar = startCalendar.plusDays(1); 
                i++;
            }
            return calendars;
        }
        return new LocalDate[0];
    }
}
