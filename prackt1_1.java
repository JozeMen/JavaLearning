import java.util.Scanner;

public class prackt1_1 {
    public static void Parser(double price) {
        double priceWithoutNDS = (price * 100) / 120;
        double priceNDS = price - priceWithoutNDS;
        System.out.println("Стоимость товара без НДС: " + String.format("%.2f",priceWithoutNDS));
        System.out.println("Сумма НДС в чеке: " + String.format("%.2f",priceNDS));
        System.out.println("Сумма НДС для налоговой декларации: " + Math.round(priceNDS));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите стоимость товара с НДС");
        if (sc.hasNextDouble()) {
            Parser(sc.nextDouble());
            sc.close();
        }
    }
}
