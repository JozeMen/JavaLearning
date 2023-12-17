package java1_05.prackt_1.main;

public class Transliteration {
    static String[] rusLetters = { "А", "Б", "В", "Г", "Д", "Е", "Ё", "Ж", "З", "И", "Й", "К", "Л", "М", "Н", "О", "П",
            "Р", "С", "Т", "У", "Ф", "Х", "Ц", "Ч", "Ш", "Щ", "Ъ", "Ы", "Ь", "Э", "Ю", "Я" };
    static String[] latLetters = { "A", "B", "V", "G", "D", "E", "Yo", "Zh", "Z", "I", "", "K", "L", "M", "N", "O", "P",
            "R", "S", "T", "U", "F", "Kh", "Cz", "Ch", "Sh", "Sh", "", "Y", "", "E", "Yu", "Ya" };

    private static int getLetter(String[] array, String target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(target)) {
                return i;
            }
        }
        return -1;
    }

    public static String rusToLat(String russianText) {
        StringBuilder result = new StringBuilder();

        for (char ch : russianText.toCharArray()) {
            int temp = getLetter(rusLetters, String.valueOf(Character.toUpperCase(ch)));
            String transliterated;
            if (temp > -1) {
                transliterated = latLetters[temp];
            } else {
                transliterated = String.valueOf(ch);
            }
            if (Character.isLowerCase(ch)) {
                transliterated = transliterated.substring(0, 1).toLowerCase() + transliterated.substring(1);
            }
            result.append(transliterated);
        }

        return result.toString();
    }

    public static String latToRus(String latText) {
        StringBuilder result = new StringBuilder();
        String transliterated;
        String newCombination = "";
        for (char ch : latText.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                int temp = getLetter(latLetters, String.valueOf(Character.toUpperCase(ch)));
                transliterated = "";
                newCombination += ch;

                if (temp > -1) {
                    transliterated = rusLetters[temp];
                } else {
                    transliterated = String.valueOf(ch);
                }
                if (Character.isLowerCase(ch)) {
                    transliterated = transliterated.substring(0, 1).toLowerCase() + transliterated.substring(1);
                }

                if (getLetter(latLetters, newCombination) > -1 && newCombination.length() > 1) {
                    result.deleteCharAt(result.length() - 1);
                    transliterated = rusLetters[getLetter(latLetters, newCombination)] ;
                    transliterated = Character.isLowerCase(newCombination.charAt(0)) ?  transliterated.toLowerCase() : transliterated.toUpperCase();
                    newCombination = "";
                } else if (newCombination.length() > 1) {
                    newCombination = String.valueOf(newCombination.charAt(1));
                }

            } else {
                transliterated = String.valueOf(ch);
            }
            result.append(transliterated);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String russianText = "Привет, Юля!";
        String latinText = rusToLat(russianText);

        System.out.println("Russian to Latin: " + rusToLat(russianText));
        System.out.println("Latin to Russian: " + latToRus(latinText));
    }
}
