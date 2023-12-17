package java1_06.task2.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java1_06.task2.main.TextFormater;

/**
 * TextFormaterTest
 */
public class TextFormaterTest {

    @Test
    public void testTextFormater() {
        String text = """
                        Lorem ipsum dolor sit amet, consectetur
                adipiscing elit, sed do eiusmod tempor
                incididunt ut labore et dolore magna aliqua. Ut
                enim ad minim veniam, quis nostrud exercitation
                ullamco laboris nisi ut aliquip ex ea commodo
                consequat. Duis aute irure dolor in reprehenderit
                in voluptate velit esse cillum dolore eu fugiat
                nulla pariatur. Excepteur sint occaecat cupidatat
                non proident, sunt in culpa qui officia deserunt
                mollit anim id est laborum.""";
        String result = "ADIPISCING ALIQUA ALIQUIP AMET ANIM AUTE CILLUM COMMODO CONSECTETUR CONSEQUAT CULPA CUPIDATAT DESERUNT DOLOR DOLORE DUIS EIUSMOD ELIT ENIM ESSE EST EXCEPTEUR EXERCITATION FUGIAT INCIDIDUNT IPSUM IRURE LABORE LABORIS LABORUM LOREM MAGNA MINIM MOLLIT NISI NON NOSTRUD NULLA OCCAECAT OFFICIA PARIATUR PROIDENT QUI QUIS REPREHENDERIT SED SINT SIT SUNT TEMPOR ULLAMCO VELIT VENIAM VOLUPTATE";
        assertEquals(result, TextFormater.getFormatedText(text));

        String text1 = "Добрый день!";
        String result1 = "ДЕНЬ ДОБРЫЙ";
        assertEquals(result1, TextFormater.getFormatedText(text1));

        String text2 = "Эх раз, да еще раз, да еще много-много раз!";
        String result2 = "ЕЩЕ МНОГО РАЗ";
        assertEquals(result2, TextFormater.getFormatedText(text2));

    }
}