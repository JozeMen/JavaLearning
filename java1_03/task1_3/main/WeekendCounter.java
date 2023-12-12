package java1_03.task1_3.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class WeekendCounter {
    public static int getWeekends(String startDate, String endDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date start = formatter.parse(startDate);
            Calendar cal1 = new GregorianCalendar();
            cal1.setTime(start);
            
            Date end = formatter.parse(endDate);
            int weekendsCount = 0;
            while (cal1.getTime().before(end) || cal1.getTime().equals(end)) {
                int dayOfWeek = cal1.get(Calendar.DAY_OF_WEEK);
                if (dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY) {
                    weekendsCount++;
                }
                cal1.add(Calendar.DAY_OF_MONTH, 1);
            }
            return weekendsCount;
        }
        catch(Exception e) {
            System.out.println("Введите дату в формате yyyy-MM-dd");
            return -1;
        }
    }
}
