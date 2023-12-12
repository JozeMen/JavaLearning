package java1_03.task1_3.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java1_03.task1_3.main.WeekendCounter;

public class WeekendCounterTest {
    @Test
    public void testGetWeekends() {
        assertEquals(0, WeekendCounter.getWeekends("2023-11-01", "2023-11-01"));
        assertEquals(0, WeekendCounter.getWeekends("2023-05-01", "2023-05-03"));
        assertEquals(2, WeekendCounter.getWeekends("2023-05-01", "2023-05-07"));
        assertEquals(105, WeekendCounter.getWeekends("2023-01-01", "2023-12-31"));

    }
}
