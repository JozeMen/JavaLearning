package task1;

public class prackt1_2 {
    public static String getDayAddition(int num) {
        int preLastDigit = num % 100 / 10;
        if (preLastDigit == 1) {
            return "дней";
        }
        switch (num % 10) {
            case 1:
                return "день";
            case 2:
            case 3:
            case 4:
                return "дня";
            default:
                return "дней";
        }
    }

    public static String getHoursAddition(int num) {
        int preLastDigit = num % 100 / 10;
        if (preLastDigit == 1) {
            return "часов";
        }
        switch (num % 10) {
            case 1:
                return "час";
            case 2:
            case 3:
            case 4:
                return "часа";
            default:
                return "часов";
        }
    }

    public static String getMinutesAddition(int num) {
        int preLastDigit = num % 100 / 10;
        if (preLastDigit == 1) {
            return "минут";
        }
        switch (num % 10) {
            case 1:
                return "минута";
            case 2:
            case 3:
            case 4:
                return "минуты";
            default:
                return "минут";
        }
    }

    public static void task(int minutes) {
        if  (minutes == 0) {
            System.out.println("Уже началось!");
        }
        else {
            int lastMinutes = minutes % 60;
            int hours = (minutes / 60) % 24;
            int days = (minutes / 60) / 24;
            System.out.printf("%d %s %d %s %d %s", days, getDayAddition(days), hours, getHoursAddition(hours), lastMinutes, getMinutesAddition(lastMinutes));
        }
    }
    public static void main(String[] args) {
        int taskVariable = 1923;       
        if (args.length != 0) {
            try {
                taskVariable = Integer.parseInt(args[0]);
            }
            catch (Exception e) {

            }
        }
        task(taskVariable);
    }
}
