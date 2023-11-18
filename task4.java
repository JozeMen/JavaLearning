import java.util.Random;

public class task4 {
    public static void task(int size) {
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
        task(10);
    }
}
