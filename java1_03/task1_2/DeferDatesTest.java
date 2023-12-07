package java1_03.task1_2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DeferDatesTest {
    @Test
    public void testMethod() {
        assertEquals("0", DeferDates.getTimeDifference("2023-11-12T00:00:00Z", "UTC+00", "UTC+00"));
        assertEquals("HOUR", DeferDates.getTimeDifference("2023-11-12T00:00:00Z", "UTC+01", "UTC+02"));
        assertEquals("DAY", DeferDates.getTimeDifference("2023-05-10T23:00:00Z", "UTC-03", "UTC+04"));
        assertEquals("YEAR", DeferDates.getTimeDifference("2010-12-31T20:15:00Z", "Europe/Moscow", "Asia/Vladivostok"));
    }
}
