package java1_05.prackt_1.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java1_05.prackt_1.main.Transliteration;

public class TransliterationTest {
    @Test
    public void testMethod() {
        assertEquals("Привет, Юля!", Transliteration.latToRus("Privet, Yulya!"));
        assertEquals("Privet, Yulya!", Transliteration.rusToLat("Привет, Юля!"));
    }
}
