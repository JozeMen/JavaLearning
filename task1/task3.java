package task1;
import java.util.Scanner;

public class task3 {
    public static void task() {
        int amountOfNumbers = 0;
        double max = 0; 
        double min = 0;
        double sum = 0;
        //double[] notfunnyNumbers = {0, 0, 0, 0}; // {кол-во введенных, максимум, минимум, сумма чисел}
        Scanner sc = new Scanner(System.in);
        double x ;
        try {
            while(true) {
                System.out.print("Введите число:  ");
                x = sc.nextDouble();
                if (amountOfNumbers == 0) {
                    max = x;
                    min = x;
                }
                amountOfNumbers++;
                max = max > x ? max : x;
                min = min < x ? min : x;
                sum += x;
            }
        }
        catch(Exception e) {
            System.out.println("Итак, у вас:  ");
        }
        finally{
            sc.close();
            System.out.println("Кол-во введеныых: "+ amountOfNumbers);
            System.out.println("Максимум: "+ max);
            System.out.println("Минимум: "+ min);
            System.out.println("Сумма чисел: "+ sum);
            System.out.println("Среднее: "+ (sum / amountOfNumbers));

        }
    }

    public static void main(String[] args) {
        task();
    }
}
