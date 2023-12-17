package java1_06.task2.main;

import java.util.Arrays;

public class TextFormater {
    public static String getFormatedText(String inputText) {
        String[] words = inputText.split("\\P{L}+");

        words = Arrays.stream(words)
                .filter(word -> word.length() >= 3)
                .toArray(String[]::new);

        words = Arrays.stream(words)
                .map(String::toUpperCase)
                .toArray(String[]::new);

        words = Arrays.stream(words)
                .distinct()
                .toArray(String[]::new);

        Arrays.sort(words);

        return String.join(" ", words);
    }

    public static void main(String[] args) {
        String text = """
                        Lorem ipsum dolor sit amet, consectetur
                adipiscing elit, sed do eiusmod tempor
                incididunt ut labore et dolore magna aliqua. Ut
                enim ad minim veniam, quis nostrud exercitation
                ullamco laboris nisi ut aliquip ex ea commodo
                consequat. Duis aute irure dolor in reprehenderit
                in voluptate velit esse cillum dolore eu fugiat
                nulla pariatur. Excepteur sint occaecat cupidatat
                non proident, sunt in culpa qui officia deserunt
                mollit anim id est laborum.""";
        System.out.println(text);
        System.out.println(getFormatedText(text));

        String text1 = "Добрый день!";
        System.out.println(text1);
        System.out.println(getFormatedText(text1));
    }
}
