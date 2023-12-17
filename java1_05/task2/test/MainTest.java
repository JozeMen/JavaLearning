package java1_05.task2.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java1_05.task2.main.Main;

public class MainTest {
    @Test
    public void testMain() {
        assertEquals("email", Main.typeChecker("user.name@example.com"));
        assertEquals("email", Main.typeChecker("user_name1@some.example.com"));
        assertEquals("телефон", Main.typeChecker("+7(123)456-78-90"));
        assertEquals("none", Main.typeChecker("71234567890"));
        assertEquals("username", Main.typeChecker("aaaa1111"));

    }
}
