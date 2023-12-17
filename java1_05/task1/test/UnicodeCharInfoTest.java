package java1_05.task1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java1_05.task1.main.UnicodeCharInfo;

public class UnicodeCharInfoTest {
    @Test
    public void testGetAllInfo() {
        UnicodeCharInfo charInfo = new UnicodeCharInfo('0');
        assertEquals("48\t U+0030\t 1\t /\t DIGIT\t -1\t", charInfo.getAllInfo());

        UnicodeCharInfo charInfo1 = new UnicodeCharInfo('Ж');
        assertEquals("1046\t U+0416\t З\t Е\t LETTER_UPPER\t -1\t", charInfo1.getAllInfo());

    }
}
