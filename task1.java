public class task1 {
    public static void task(double[] numbers) {
        System.out.print("Изначальное число" + '\t');
        for (double val : numbers) {
            System.out.print(val+ "\t");
        }
        System.out.println();
        System.out.print("Окрагуление Round" + '\t');
        for (double val : numbers) {
            System.out.printf(String.format("%d\t", Math.round(val)) );
        }
        System.out.println();
        System.out.print("Окрагуление Floor" + '\t');
        for (double val : numbers) {
            System.out.print(Math.floor(val) + "\t");
        }
        System.out.println();
        System.out.print("Окрагуление Ceil" + '\t');
        for (double val : numbers) {
            System.out.print(Math.ceil(val) + "\t");
        }
    }

    public static void main(String[] args) {
        double[] numbers = {30.0, 10000.1, 12.5, 99.99, 0.0, -23.45, -4.5,-129.675};
        task(numbers);
    }
}
