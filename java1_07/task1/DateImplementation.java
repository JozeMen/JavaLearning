package java1_07.task1;

import java.time.LocalDate;

public class DateImplementation implements SomeInterface<LocalDate> {
    private LocalDate currentDate;

    public LocalDate getCurrentDate() {
        return currentDate;
    }

    @Override
    public LocalDate getData() {
        return getCurrentDate();
    }

    @Override
    public boolean validate(LocalDate date) {
        return true;
    }

    public boolean validate(String date) {
        return true;

    }

}
