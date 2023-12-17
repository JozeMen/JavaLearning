package java1_05.task1.main;

public class UnicodeCharInfo {
    private static final String DIGIT = "DIGIT";
    private static final String LETTER_UPPER = "LETTER_UPPER";
    private static final String LETTER_LOWER = "LETTER_LOWER";
    private static final String SPACE = "SPACE";
    private static final String OTHER = "OTHER";

    private char symbol;

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public int getIntUnicode() {
        return (int) symbol;
    }

    public String getHexUnicode() {
        String unicodeHex = String.format("U+%04X", getIntUnicode());
        return unicodeHex;
    }

    public char getNextSymbol() {
        return (char) (getIntUnicode() + 1);
    }

    public char getPreviousSymbol() {
        return (char) (getIntUnicode() - 1);
    }

    public String getSymbolType() {
        if (Character.isDigit(symbol)) {
            return DIGIT;
        } else if (Character.isUpperCase(symbol)) {
            return LETTER_UPPER;
        } else if (Character.isLowerCase(symbol)) {
            return LETTER_LOWER;
        } else if (Character.isWhitespace(symbol)) {
            return SPACE;
        } else {
            return OTHER;
        }
    }

    public int getAlphabetPosition() {
        if ((symbol >= 'a' && symbol <= 'z') || (symbol >= 'A' && symbol <= 'Z')) {
            char lowercaseChar = Character.toLowerCase(symbol);
            return lowercaseChar - 'a' + 1;
        } else {
            return -1;
        }
    }

    public String getAllInfo() {
        int intUnicode = getIntUnicode();
        String hexUnicode = getHexUnicode();
        char nextSymbol = getNextSymbol();
        char prevSymbol = getPreviousSymbol();
        String typeSymbol = getSymbolType();
        int alphPosition = getAlphabetPosition();

        String result = String.format("%d\t %s\t %c\t %c\t %s\t %d\t", intUnicode, hexUnicode, nextSymbol,
                prevSymbol,
                typeSymbol,
                alphPosition);
        System.out.printf(result);
                return result;
    }

    public UnicodeCharInfo(char ch) {
        symbol = ch;
    }
}
