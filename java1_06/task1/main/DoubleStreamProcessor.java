package java1_06.task1.main;

import java.util.Arrays;
import java.util.stream.DoubleStream;

public class DoubleStreamProcessor {
    private DoubleStreamProcessor() {}
    public static long countZeros(DoubleStream doubleStream) {
        return doubleStream.filter(value -> value == 0.0).count();
    }

    public static boolean getInt(DoubleStream doubleStream) {
        return doubleStream.anyMatch(value -> value % 1 != 0);
    }

public static double calculateRange(DoubleStream doubleStream) {
        double[] values = doubleStream.toArray();

        if (values.length == 0) {
            System.err.println("Пустой поток");
            return 0;
        }
        double min = Arrays.stream(values).min().orElseThrow();
        double max = Arrays.stream(values).max().orElseThrow();

        return Math.abs(max - min);
    }

    public static double[] getBetterThan(DoubleStream doubleStream, double limit) {
        return doubleStream.filter(value -> value > limit).toArray();
    }

    public static double findMaxStringLengthValue(DoubleStream doubleStream) {
        try {
        return doubleStream
                .mapToObj(Double::toString)
                .max((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .map(Double::parseDouble)
                .orElseThrow(() -> new IllegalArgumentException("Пустой поток"));
        }
        catch (IllegalArgumentException e) {
            System.err.println(e.getLocalizedMessage());
            return 0;
        }
    }
}
