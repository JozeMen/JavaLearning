package java1_03.task1_1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java1_03.task1_1.main.MonthInfo;

public class MonthInfoTest {

    @Test
    public void getFullMonthName() {
        var monthInfo = new MonthInfo("2023-11-12");
        assertEquals("ноябрь", monthInfo.getFullMonthName());
        monthInfo = new MonthInfo("1900-01-01");
        assertEquals("январь", monthInfo.getFullMonthName());

    }

    @Test
    public void getMonthNumber() {
        var monthInfo = new MonthInfo("2023-11-12");
        assertEquals(11, monthInfo.getMonthNumber());
        monthInfo = new MonthInfo("1900-01-01");
        assertEquals(1, monthInfo.getMonthNumber());

    }

    @Test
    public void getFirstDayOfWeek() {
        var monthInfo = new MonthInfo("2023-11-12");
        assertEquals("ср", monthInfo.getFirstDayOfWeek());
        monthInfo = new MonthInfo("1900-01-01");
        assertEquals("пн", monthInfo.getFirstDayOfWeek());

    }

    @Test
    public void getLastDayOfMonth() {
        var monthInfo = new MonthInfo("2023-11-12");
        assertEquals("2023-11-30", monthInfo.getLastDayOfMonth());
        monthInfo = new MonthInfo("1900-01-01");
        assertEquals("1900-01-31", monthInfo.getLastDayOfMonth());

    }

    @Test
    public void getNumberOfDaysInMonth() {
        var monthInfo = new MonthInfo("2023-11-12");
        assertEquals(30, monthInfo.getNumberOfDaysInMonth());
        monthInfo = new MonthInfo("1900-01-01");
        assertEquals(31, monthInfo.getNumberOfDaysInMonth());

    }

    @Test
    public void getQuarterInfo() {
        var monthInfo = new MonthInfo("2023-11-12");
        assertEquals("2023 Q4", monthInfo.getQuarterInfo());
        monthInfo = new MonthInfo("1900-01-01");
        assertEquals("1900 Q1", monthInfo.getQuarterInfo());

    }
}
