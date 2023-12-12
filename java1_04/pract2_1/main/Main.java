package java1_04.pract2_1.main;

public class Main {

    public static void main(String[] args) {
        // ArrayStatistics stat1 = new ArrayStatistics();
        // stat1.getStatistics();

        // ArrayStatistics stat2 = new ArrayStatistics(1);
        // stat2.getStatistics();

        // ArrayStatistics stat3 = new ArrayStatistics(3);
        // stat3.getStatistics();

        ArrayStatistics stat4 = new ArrayStatistics(3);
        int[] array = {3,4,5,1,2,0,11,3,2,5};
        stat4.setArray(array);
        stat4.getStatistics();

        // ArrayStatistics stat5 = new ArrayStatistics(100_000);
        // stat5.getStatistics();

    }
}