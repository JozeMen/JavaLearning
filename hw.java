import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

class hw {
    public static void task1(double[] numbers) {
        //Некрасивый вариант таблицы
        // for (double val : numbers) {
        //     System.out.println(Math.round(val) + "     " + Math.floor(val) + "     " + (Math.ceil(val)));
        // }

        //Красивая таблица, но некрасивый код
        for (double val : numbers) {
            System.out.print(Math.round(val) + "    " );
        }
        System.out.println();
        for (double val : numbers) {
            System.out.print( Math.floor(val)+ "  ");
        }
        System.out.println();
        for (double val : numbers) {
            System.out.print(+ (Math.ceil(val))+ "  ");
        }
    }

    public static void task2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение: ");
        if (sc.hasNextInt()) {
            System.out.println("Тип данных: int");
        } else if (sc.hasNextDouble()) {
            System.out.println("Тип данных: double");
        } else if (sc.hasNextBoolean()) {
            System.out.println("Тип данных: boolean");
        } else {
            System.out.println("Тип данных: String");
        }
        sc.close();
    }
    public static void task3() {
        double[] funnyNumbers = {0, 0, 0, 0}; // {кол-во введенных, максимум, минимум, сумма чисел}
        Scanner sc = new Scanner(System.in);
        double x ;
        try {
            while(true) {
                System.out.print("Введите число:  ");
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
            System.out.println("Итак, у вас:  ");
        }
        finally{
            sc.close();
            System.out.println("Кол-во введеныых: "+ Math.round(funnyNumbers[0]));
            System.out.println("Максимум: "+ funnyNumbers[1]);
            System.out.println("Минимум: "+ funnyNumbers[2]);
            System.out.println("Сумма чисел: "+ funnyNumbers[3]);
            System.out.println("Среднее: "+ (funnyNumbers[3] / funnyNumbers[0]));

        }
    }

    public static void task4(int size) {
        Random rnd = new Random();
        int startQueue = 0;
        int curNumber = 0;
        int queueAmount = 0;
        int maxQueueAmount = 0;
        for(int i = 0; i < size; i++) {
            curNumber = rnd.nextInt(-1000, 1000);
            System.out.print("Текущее число: " + curNumber);
            if (startQueue == 0) {
                queueAmount++;
            }
            else {
                if ((startQueue > 0 && curNumber > 0) || (startQueue < 0 && curNumber < 0)) {
                    queueAmount++;
                }
                else{
                    maxQueueAmount = maxQueueAmount < queueAmount ? queueAmount : maxQueueAmount;
                    queueAmount = 1;
                }
            }
            startQueue = curNumber;
            System.out.println("   Текущая длина послед-ти: "+ queueAmount);

        }
        System.out.println("Итоговая длина послед-ти: "+ maxQueueAmount);
    }
    public static void main(String[] args) {
        double[] numbers = {30.0, 10000.1, 12.5, 99.99, 0.0, -23.45, -4.5,-129.675};
        //task1(numbers);
        //task2();
        //task3();
        task4(10);


    }
}