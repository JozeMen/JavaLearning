package java1_03.prackt2_1.main;

public class WeekendDateCheker {
    public void getResult(int year, int weekNumber) {
        if (weekNumber < 52 && weekNumber > 0) {
            if (year > 1900) {
                WeeksInISO test = new WeeksInISO();
                test.getRangeOfDays(year, weekNumber);
                System.out.printf("%s - %s", test.getDateStartRange(), test.getDateEndRange());
            }
        }
    }
}
