package java1_03.prackt2_1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class WeeksInISO {
    private String dateStartRange;
    private String dateEndRange;

    public String getDateStartRange() {
        return dateStartRange;
    }

    public String getDateEndRange() {
        return dateEndRange;
    }

    public void getRangeOfDays(int year, int weekNumber) {
        LocalDate firstDayOfYear = LocalDate.of(year, 1, 1);
        LocalDate firstMondayOfYear = firstDayOfYear.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));

        LocalDate firstDayOfTargetWeek = firstMondayOfYear.plusWeeks(weekNumber - 1);
        LocalDate lastDayOfTargetWeek = firstDayOfTargetWeek.plusDays(6);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
        dateStartRange = firstDayOfTargetWeek.atStartOfDay().format(formatter);
        dateEndRange = lastDayOfTargetWeek.atTime(23, 59, 59).format(formatter);
    }
}
