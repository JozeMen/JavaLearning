package java1_05.prackt_2.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import java1_05.prackt_2.main.TextManipulator;

public class TextManipulationTest {
    @Test
    public void testFindOccurrences() {
        TextManipulator textManipulator = new TextManipulator(
                "Также как современная методология разработки позволяет выполнить важные как задания по разработке КАК стандартных подходов.");
        assertEquals("[6, 72, 98]", Arrays.toString(textManipulator.findOccurrences("как")));
        assertEquals("[98]", Arrays.toString(textManipulator.findOccurrences("КАК", true)));
    }

    @Test
    public void testReplaceText() {
        TextManipulator textManipulator = new TextManipulator(
                "Также как современная методология разработки позволяет выполнить важные как задания по разработке КАК стандартных подходов.");
        assertEquals(
                3,
                textManipulator.replaceText("как", "ТОСТ"));

        TextManipulator textManipulator1 = new TextManipulator(
                "Также как современная методология разработки позволяет выполнить важные как задания по разработке КАК стандартных подходов.");
        assertEquals(
                1,
                textManipulator1.replaceText("КАК", "ТОСТ", true));
    }

}
