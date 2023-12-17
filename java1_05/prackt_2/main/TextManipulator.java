package java1_05.prackt_2.main;

import java.util.ArrayList;
import java.util.List;

public class TextManipulator {
    private String text;

    public String getText() {
        return text;
    }

    public int[] findOccurrences(String searchString) {
        return findOccurrences(searchString, false);
    }

    public int[] findOccurrences(String searchString, boolean caseSensitive) {
        String textToSearch = caseSensitive ? text : text.toLowerCase();
        searchString = caseSensitive ? searchString : searchString.toLowerCase();

        List<Integer> occurrences = new ArrayList<>();
        int index = textToSearch.indexOf(searchString);
        while (index != -1) {
            occurrences.add(index);
            index = textToSearch.indexOf(searchString, index + 1);
        }

        int[] result = new int[occurrences.size()];
        for (int i = 0; i < occurrences.size(); i++) {
            result[i] = occurrences.get(i);
        }

        return result;
    }

    public int replaceText(String searchText, String replacementText) {
        return replaceText(searchText, replacementText, false);
    }

    public int replaceText(String searchText, String replacementText, boolean caseSensitive) {
        int replacementsCount = 0;

        int[] occurrences = findOccurrences(searchText, caseSensitive);
        for (int i = occurrences.length - 1; i >= 0; i--) {
            int index = occurrences[i];
            text = text.substring(0, index) + replacementText + text.substring(index + searchText.length());
            replacementsCount++;
        }

        return replacementsCount;
    }

    public TextManipulator(String text) {
        this.text = text;
    }

}
