package java1_07.prackt2_2.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java1_07.prackt2_2.main.BracketValidator;

public class BracketValidatorTest {
    @Test
    public void testMethod() {
        String input1 = "{[()]}";
        String input2 = "{[()";
        String input3 = "{[(])}";
        String input4 = "a(b)c[d]e{f}";
        assertEquals(-1, BracketValidator.validate(input1));
        assertEquals(4, BracketValidator.validate(input2));
        assertEquals(3, BracketValidator.validate(input3));
        assertEquals(-1, BracketValidator.validate(input4));
    }
}
