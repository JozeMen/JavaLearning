package java1_05.task1;

public class Main {

    public static void main(String[] args) {
        UnicodeCharInfo charInfo = new UnicodeCharInfo('0');
        charInfo.getAllInfo();
        System.out.println();

        charInfo = new UnicodeCharInfo('A');
        charInfo.getAllInfo();
        System.out.println();

        charInfo = new UnicodeCharInfo('%');
        charInfo.getAllInfo();
    }
}