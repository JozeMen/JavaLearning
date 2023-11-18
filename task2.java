import java.util.Scanner;

public class task2 {
     public static void task() {
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

    public static void main(String[] args) {
        task();
    }
}
