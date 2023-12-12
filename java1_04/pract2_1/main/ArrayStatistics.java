package java1_04.pract2_1.main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ArrayStatistics {
    private int[] array;

    public int[] getArray() {
        return Arrays.copyOf(array, array.length);
    }

    public void setArray(int[] arr) {
        array = Arrays.copyOf(arr, arr.length);
    }

    public ArrayStatistics(int size) {
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(10);
        }
    }

    public ArrayStatistics() {
        this(3);
    }

     public int[] getMode() {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int value : array) {
            if (frequencyMap.containsKey(value)) {
                frequencyMap.put(value, frequencyMap.get(value) + 1);
            } else {
                frequencyMap.put(value, 1);
            }
        }

        int maxFrequency = 0;
        for (int frequency : frequencyMap.values()) {
            maxFrequency = Math.max(maxFrequency, frequency);
        }

        int modeCount = 0;
        for (int frequency : frequencyMap.values()) {
            if (frequency == maxFrequency) {
                modeCount++;
            }
        }

        int[] modeArray = new int[modeCount];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                modeArray[index++] = entry.getKey();
            }
        }

        return modeArray;
    }


    public double getMedian() {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);

        int medianIndex = sortedArray.length / 2;

        if (sortedArray.length % 2 == 0) {
            int medianValue1 = sortedArray[medianIndex - 1];
            int medianValue2 = sortedArray[medianIndex];
            return (medianValue1 + medianValue2) / 2;
        } else {
            return sortedArray[medianIndex];
        }
    }

    public double getAverage() {
        return Arrays.stream(array).sum() / array.length;
    }

    public double getVariance() {
        double average = getAverage();
        double sum = 0;
        for (int i : array) {
            sum += Math.pow(i - average, 2);
        }
        return sum;
    }

    public double getGeametricMean() {
        double multiplier = 1;
        for (int i : array) {
            multiplier *= i;
        }
        return Math.pow(multiplier, (1/array.length)); 
    }

    public int[] getShufledArray() {
        int[] shuffledArray = Arrays.copyOf(array, array.length);
        Random rand = new Random();

        for (int i = shuffledArray.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);

            int temp = shuffledArray[i];
            shuffledArray[i] = shuffledArray[index];
            shuffledArray[index] = temp;
        }

        return shuffledArray;
    }

    public int[] getSample(int size) {
        int[] sampleArray = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            int randomIndex = rand.nextInt(array.length);
            sampleArray[i] = array[randomIndex];
        }

        return sampleArray;

    }

    public void getStatistics() {
        System.out.println("Текущий массив");
        for (int i : array) {
            System.out.printf("%d\t", i);
        }
        System.out.println();
        System.out.println("Медиана: \t" + getMedian());
        System.out.println("Среднее арифм: \t" + getAverage());
        System.out.println("Дисперсия \t" + getVariance());
        System.out.println("Геометрическая \t" + getGeametricMean());

        System.out.println("Перемешанный массив");
        for (int i : getShufledArray()) {
            System.out.printf("%d\t", i);
        }
        System.out.println("\nВыборка");
        for (int i : getSample(3)) {
            System.out.printf("%d\t", i);
        }

    }
}
