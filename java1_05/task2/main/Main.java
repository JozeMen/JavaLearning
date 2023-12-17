package java1_05.task2.main;

import java.util.regex.Pattern;

public class Main {
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)*@([a-zA-Z0-9]+\\.)+[a-zA-Z]{2,}$");
    private static final Pattern PHONE_PATTERN = Pattern.compile("^(\\+7){1}-?\\(?\\d\\d\\d\\)?-?\\d\\d\\d-?\\d\\d-?\\d\\d$");
    private static final Pattern INN_PATTERN = Pattern.compile("^([0-9]){10}|([0-9]){12}$");
    private static final Pattern USERNAME_PATTERN = Pattern.compile("^[a-zA-Z][a-zA-Z0-9_$\\.]{7,}$");

    public static void main(String[] args) {
        System.out.println(typeChecker("         user.name@example.com"));
    }

    public static String typeChecker(String input) {
        String trimmedInput = input.trim();

        if (EMAIL_PATTERN.matcher(trimmedInput).matches()) {
            return "email";
        } else if (PHONE_PATTERN.matcher(trimmedInput).matches()) {
            return "телефон";
        } else if (INN_PATTERN.matcher(trimmedInput).matches()) {
            return "ИНН";
        } else if (USERNAME_PATTERN.matcher(trimmedInput).matches()) {
            return "username";
        } else {
            return "none";
        }
    }
}
