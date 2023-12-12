package java1_03.task1_1.main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


public class MonthInfo {
    private Calendar date;

    public Calendar getDate() {
        return date;
    }

    public MonthInfo() {
        this.date = Calendar.getInstance();        
    }

    public MonthInfo(String date) {
        String[] dateParts = date.split("-");
        this.date = new GregorianCalendar(Integer.valueOf(dateParts[0]), Integer.valueOf(dateParts[1]) - 1,Integer.valueOf(dateParts[2]));
        
    }

    public String getFullMonthName() {
        DateFormat monthFormat = new SimpleDateFormat("MMMM");
        return monthFormat.format(date.getTime());
    }

    public int getMonthNumber() {
        return date.get(Calendar.MONTH) + 1;
    }

    public String getFirstDayOfWeek() {
        DateFormat dayFormat = new SimpleDateFormat("E");
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date.getTime());
        calendar.set(Calendar.DAY_OF_MONTH, 1);

        return dayFormat.format(calendar.getTime());
    }

    public String getLastDayOfMonth() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date.getTime());
        calendar.set(Calendar.DAY_OF_MONTH, date.getActualMaximum(Calendar.DAY_OF_MONTH));

        return dateFormat.format(calendar.getTime());
    }

    public int getNumberOfDaysInMonth() {
        return this.date.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    public String getQuarterInfo() {
        int quarter = (this.date.get(Calendar.MONTH) / 3) + 1;
        return this.date.get(Calendar.YEAR) + " Q" + quarter;
    }

    public void getDateInfo() {
        String monthOfDate = getFullMonthName();
        int monthNumber = getMonthNumber();
        String startDay = getFirstDayOfWeek();
        String endDay = getLastDayOfMonth();
        int amountOfDays = getNumberOfDaysInMonth();
        String quarterInfo = getQuarterInfo();

        System.out.println(monthOfDate + "\t" + monthNumber + "\t" + startDay + "\t" + endDay + "\t" + amountOfDays + "\t" + quarterInfo);
    }
}
