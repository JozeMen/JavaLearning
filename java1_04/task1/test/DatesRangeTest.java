package java1_04.task1.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Test;

import java1_04.task1.main.DatesRange;

public class DatesRangeTest {
    LocalDate[] parser(String[] dates) {
        LocalDate[] calendars = new LocalDate[dates.length];
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        for (int i = 0; i < calendars.length; i++) {
            calendars[i] = LocalDate.parse(dates[i], formatter);
        }
        return calendars;
    }

    @Test
    public void testGetCalendarsBetween() {
        String[] dates = { "2020-05-28", "2020-05-29", "2020-05-30", "2020-05-31",
                "2020-06-01", "2020-06-02" };
        LocalDate start = LocalDate.of(2020, 5, 28);
        LocalDate end = LocalDate.of(2020, 6, 2);

        LocalDate[] result = DatesRange.getCalendarsBetween(start, end);
        LocalDate[] expected = parser(dates);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testGetCalendarsBetweenZero() {
        String[] dates = new String[] { "2023-02-28" };
        LocalDate start = LocalDate.of(2023, 02, 28);
        LocalDate end = LocalDate.of(2023, 02, 28);

        LocalDate[] result = DatesRange.getCalendarsBetween(start, end);
        LocalDate[] expected = parser(dates);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testGetCalendarsBetweenStartBetterEnd() {
        String[] dates = new String[] {};
        LocalDate start = LocalDate.of(2023, 11, 12);
        LocalDate end = LocalDate.of(2023, 11, 11);

        LocalDate[] result = DatesRange.getCalendarsBetween(start, end);
        LocalDate[] expected = parser(dates);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testGetCalendarsBetweenYear() {
        LocalDate start = LocalDate.of(1901, 01, 01);
        LocalDate end = LocalDate.of(1901, 12, 31);

        LocalDate[] result = DatesRange.getCalendarsBetween(start, end);
        assertEquals(365, result.length);
    }

}
