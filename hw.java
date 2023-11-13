import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

class hw {
    public static void task1(double[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(("|") + Math.round(numbers[i]));
            System.out.println(("|") + Math.floor(numbers[i]));
            System.out.println(("|") + Math.ceil(numbers[i]));


        }

        // for (double val : numbers) {
        //     System.out.println(Math.round(val) + "     " + Math.floor(val) + "     " + (Math.ceil(val)));
        // }
    }
    public static void task3() {
        double[] funnyNumbers = {0, 0, 0, 0}; // {кол-во введенных, максимум, минимум, сумма чисел}
        Scanner sc = new Scanner(System.in);
        double x ;
        try {
            while(true) {
                x = sc.nextDouble();
                if (funnyNumbers[0] == 0) {
                    funnyNumbers[1] = x;
                    funnyNumbers[2] = x;
                }
                funnyNumbers[0]++;
                funnyNumbers[1] = funnyNumbers[1] > x ? funnyNumbers[1] : x;
                funnyNumbers[2] = funnyNumbers[2] < x ? funnyNumbers[2] : x;
                funnyNumbers[3] += x;
            }
        }
        catch(Exception e) {

        }
        finally{
            sc.close();
            System.out.println("YOUR numberAmount: "+ funnyNumbers[0]);
            System.out.println("YOUR max: "+ funnyNumbers[1]);
            System.out.println("YOUR min: "+ funnyNumbers[2]);
            System.out.println("YOUR sum: "+ funnyNumbers[3]);
            System.out.println("YOUR average: "+ (funnyNumbers[3] / funnyNumbers[0]));

        }
    }

    public static void task4(int size) {
        Random rnd = new Random();
        int startQueue = 0;
        int curNumber = 0;
        int queueAmount = 0;
        for(int i = 0; i < size; i++) {
            curNumber = rnd.nextInt(-10, 10);
            System.out.print("Curnumber: " + curNumber);
            if (startQueue == 0) {
                queueAmount++;
            }
            else {
                if ((startQueue > 0 && curNumber > 0) || (startQueue < 0 && curNumber < 0)) {
                    queueAmount++;
                }
                else{
                    queueAmount = 1;
                }
            }
            startQueue = curNumber;
            System.out.println("   CURAMount: "+ queueAmount);

        }
        System.out.println("AMount: "+ queueAmount);
    }
    public static void main(String[] args) {
        double[] numbers = {30.0, 10000.1, 12.5, 99.99, 0.0, -23.45, -4.5,-129.675};
        //task1(numbers);
        //task3();
        task4(10);
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Please enter a number");
        // boolean x = sc.next() instanceof String;
        // sc.close();
        // System.out.println(x);
    }
}