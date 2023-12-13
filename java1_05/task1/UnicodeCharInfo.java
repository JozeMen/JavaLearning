package java1_05.task1;

public class UnicodeCharInfo {
    private static final String DIGIT = "DIGIT";
    private static final String UPPERCASE_LETTER = "UPPERCASE_LETTER";
    private static final String LOWERCASE_LETTER = "LOWERCASE_LETTER";
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
            return UPPERCASE_LETTER;
        } else if (Character.isLowerCase(symbol)) {
            return LOWERCASE_LETTER;
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

    public void getAllInfo() {
        int intUnicode = getIntUnicode();
        String hexUnicode = getHexUnicode();
        char nextSymbol = getNextSymbol();
        char prevSymbol = getPreviousSymbol();
        String typeSymbol = getSymbolType();
        int alphPosition = getAlphabetPosition();
        System.out.printf("%d\t %s\t %c\t %c\t %s\t %d\t", intUnicode, hexUnicode, nextSymbol,
                prevSymbol,
                typeSymbol,
                alphPosition);
    }

    public UnicodeCharInfo(char ch) {
        symbol = ch;
    }
}
