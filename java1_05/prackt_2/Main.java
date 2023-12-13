package java1_05.prackt_2;

public class Main {
    public static void main(String[] args) {
        TextManipulator textManipulator = new TextManipulator("Также как современная методология разработки позволяет выполнить важные как задания по разработке КАК стандартных подходов.");

        int[] occurrences = textManipulator.findOccurrences("как");
        System.out.println("Кол-во вхождений" + java.util.Arrays.toString(occurrences));

        int replacementsCount = textManipulator.replaceText("как", "ТОСТ");
        System.out.println("Кол-во замен: " + replacementsCount);
        System.out.println("Обновленный текст: " + textManipulator.getText());
    }
}
