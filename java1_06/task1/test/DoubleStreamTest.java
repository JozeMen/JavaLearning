package java1_06.task1.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.stream.DoubleStream;

import org.junit.Test;

import java1_06.task1.main.DoubleStreamProcessor;

public class DoubleStreamTest {
    @Test
    public void testClass_Empty() {
        double limit = 4;
        // Пустой поток
        assertEquals(0, DoubleStreamProcessor.countZeros(DoubleStream.of()));
        assertEquals(false, DoubleStreamProcessor.getInt(DoubleStream.of()));
        assertEquals("0.0", String.valueOf(DoubleStreamProcessor.calculateRange(DoubleStream.of())));
        assertEquals("[]", Arrays
                .toString(DoubleStreamProcessor.getBetterThan(DoubleStream.of(), limit)));
        assertEquals("0.0", String.valueOf(DoubleStreamProcessor.findMaxStringLengthValue(DoubleStream.of())));

    }

    @Test
    public void testClass_ThreeEqualStream() {
        double limit = 4;
        assertEquals(0, DoubleStreamProcessor.countZeros(DoubleStream.of(1.5, 2, 3.83, 2, 5.2,
                6.0, 2)));
        assertEquals(true, DoubleStreamProcessor.getInt(DoubleStream.of(1.5, 2, 3.83, 2, 5.2,
                6.0, 2)));
        assertEquals("4.5", String.valueOf(DoubleStreamProcessor.calculateRange(DoubleStream.of(1.5, 2, 3.83, 2, 5.2,
                6.0, 2))));
        assertEquals("[5.2, 6.0]", Arrays
                .toString(DoubleStreamProcessor.getBetterThan(DoubleStream.of(1.5, 2, 3.83, 2, 5.2,
                        6.0, 2), limit)));
        assertEquals("3.83",
                String.valueOf(DoubleStreamProcessor.findMaxStringLengthValue(DoubleStream.of(1.5, 2, 3.83, 2, 5.2,
                        6.0, 2))));

    }

    @Test
    public void testClass_LessOneStream() {
        double limit = 0;
        assertEquals(0, DoubleStreamProcessor.countZeros(DoubleStream.of(0.12, 0.67, 0.23, 0.56, 0.98)));
        assertEquals(true, DoubleStreamProcessor.getInt(DoubleStream.of(0.12, 0.67, 0.23, 0.56, 0.98)));
        assertEquals("0.86",
                String.valueOf(DoubleStreamProcessor.calculateRange(DoubleStream.of(0.12, 0.67, 0.23, 0.56, 0.98))));
        assertEquals("[0.12, 0.67, 0.23, 0.56, 0.98]", Arrays
                .toString(DoubleStreamProcessor.getBetterThan(DoubleStream.of(0.12, 0.67, 0.23, 0.56, 0.98), limit)));
        assertEquals("0.12", String.valueOf(
                DoubleStreamProcessor.findMaxStringLengthValue(DoubleStream.of(0.12, 0.67, 0.23, 0.56, 0.98))));

    }

    @Test
    public void testClass_Requiered() {
        double limit = 4;
        assertEquals(5,
                DoubleStreamProcessor
                        .countZeros(DoubleStream.of(0, 0, 0, 0, 0, 2, 5, -1, 12345.0987654321, 1.5, 2, 3.83, 3, 4, 5.2,
                                6.0, 2.5, 8.3, 1.54, 3.33)));
        assertEquals(true,
                DoubleStreamProcessor
                        .getInt(DoubleStream.of(0, 0, 0, 0, 0, 2, 5, -1, 12345.0987654321, 1.5, 2, 3.83, 3, 4, 5.2,
                                6.0, 2.5, 8.3, 1.54, 3.33)));
        assertEquals("12346.0987654321",
                String.valueOf(DoubleStreamProcessor.calculateRange(
                        DoubleStream.of(0, 0, 0, 0, 0, 2, 5, -1, 12345.0987654321, 1.5, 2, 3.83, 3, 4, 5.2,
                                6.0, 2.5, 8.3, 1.54, 3.33))));
        assertEquals("[5.0, 12345.0987654321, 5.2, 6.0, 8.3]", Arrays
                .toString(DoubleStreamProcessor.getBetterThan(
                        DoubleStream.of(0, 0, 0, 0, 0, 2, 5, -1, 12345.0987654321, 1.5, 2, 3.83, 3, 4, 5.2,
                                6.0, 2.5, 8.3, 1.54, 3.33),
                        limit)));
        assertEquals("12345.0987654321",
                String.valueOf(DoubleStreamProcessor.findMaxStringLengthValue(
                        DoubleStream.of(0, 0, 0, 0, 0, 2, 5, -1, 12345.0987654321, 1.5, 2, 3.83, 3, 4, 5.2,
                                6.0, 2.5, 8.3, 1.54, 3.33))));

    }
}
