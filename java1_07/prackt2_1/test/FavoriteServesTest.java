package java1_07.prackt2_1.test;

import java1_07.prackt2_1.main.FavoriteService;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FavoriteServesTest {
    @Test
    public void processInput_ValidInput_ShouldUpdateCommonFavoritesAndAllFavorites() {

        FavoriteService app = new FavoriteService();
        app.processInput("Миша: Апельсин, кушать, осень");
        assertEquals(3, app.getAllFavorites().size());

        FavoriteService app1 = new FavoriteService();
        app1.processInput("Миша:");
        assertEquals(0, app1.getAllFavorites().size());

        FavoriteService app2 = new FavoriteService();
        app2.processInput(" ");
        assertEquals(0, app2.getAllFavorites().size());

    }

    @Test
    public void printCommonFavorites() {
        FavoriteService app = new FavoriteService();
        app.processInput("Миша: Апельсин, кушать, осень");
        app.processInput("Маша: Рисовать, осень, спать");
        app.processInput("Степан: Программирование, зеленый чай, осень, иней, гулять");

        app.printCommonFavorites();
        assertEquals("Всеобщие любимки:  осень", app.printCommonFavorites());

        FavoriteService app1 = new FavoriteService();
        app1.processInput("Миша: ");
        app1.processInput("Маша: ");
        assertEquals("Всеобщие любимки:  ", app1.printCommonFavorites());

        FavoriteService app2 = new FavoriteService();
        app2.processInput("Миша: Апельсин, кушать, осень");
        app2.processInput("Маша: Апельсин, кушать, осень");

        app2.printCommonFavorites();
        assertEquals("Всеобщие любимки:  Апельсин,  осень,  кушать", app2.printCommonFavorites());

    }

    @Test
    public void printAllFavorites() {

        FavoriteService app = new FavoriteService();
        app.processInput("Миша: Апельсин, кушать, осень");
        app.processInput("Маша: Рисовать, осень, спать");
        app.processInput("Степан: Программирование, зеленый чай, осень, иней, гулять");

        app.printCommonFavorites();
        assertEquals(
                "Все любимки:  Апельсин,  гулять,  осень,  Рисовать,  зеленый чай,  спать,  иней,  кушать,  Программирование",
                app.printAllFavorites());

        FavoriteService app1 = new FavoriteService();
        app1.processInput("Миша: ");
        app1.processInput("Маша: ");
        assertEquals("Все любимки:  ", app1.printAllFavorites());

        FavoriteService app2 = new FavoriteService();
        app2.processInput("Миша: Апельсин, кушать, осень");
        app2.processInput("Маша: Апельсин, кушать, осень");

        app2.printCommonFavorites();
        assertEquals("Все любимки:  Апельсин,  осень,  кушать", app2.printAllFavorites());
    }

    @Test
    public void printUserFavorites_Common() {
        FavoriteService app = new FavoriteService();
        app.processInput("Миша: Апельсин, кушать, осень");
        app.processInput("Маша: Рисовать, осень, спать");
        app.processInput("Степан: Программирование, зеленый чай, осень, иней, гулять");

        String[] strArray = new String[3];
        strArray[0] = "Миша:  Апельсин,  кушать";
        strArray[1] = "Маша:  Рисовать,  спать";
        strArray[2] = "Степан:  гулять,  зеленый чай,  иней,  Программирование";

        app.printUserFavorites();
        for (int i = 0; i < strArray.length; i++) {
            assertEquals(strArray[i],
                    app.printUserFavorites()[i]);
        }

    }

    @Test
    public void printUserFavorites_Empty() {
        FavoriteService app = new FavoriteService();
        app.processInput("Миша: ");
        app.processInput("Маша: ");
        app.processInput("Степан: ");

        String[] strArray = new String[3];
        strArray[0] = "Миша: ";
        strArray[1] = "Маша: ";
        strArray[2] = "Степан: ";

        app.printUserFavorites();
        for (int i = 0; i < strArray.length; i++) {
            assertEquals(strArray[i],
                    app.printUserFavorites()[i]);
        }
    }

    @Test
    public void printUserFavorites_All() {
        FavoriteService app = new FavoriteService();
        app.processInput("Миша: Апельсин, кушать, осень");
        app.processInput("Маша: Рисовать, спать");
        app.processInput("Степан: Программирование, зеленый чай, иней, гулять");

        String[] strArray = new String[3];
        strArray[0] = "Миша:  Апельсин,  осень,  кушать";
        strArray[1] = "Маша:  Рисовать,  спать";
        strArray[2] = "Степан:  гулять,  зеленый чай,  иней,  Программирование";

        app.printUserFavorites();
        for (int i = 0; i < strArray.length; i++) {
            assertEquals(strArray[i],
                    app.printUserFavorites()[i]);
        }
    }

    @Test
    public void printFavoritesCount_Common() {
        FavoriteService app = new FavoriteService();
        app.processInput("Миша: Апельсин, иней, осень");
        app.processInput("Маша: Рисовать, осень");
        app.processInput("Степан: осень, иней");

        String[] strArray = new String[4];
        strArray[0] = " Апельсин: 1";
        strArray[1] = " осень: 3";
        strArray[2] = " Рисовать: 1";
        strArray[3] = " иней: 2";

        app.printUserFavorites();
        for (int i = 0; i < strArray.length; i++) {
            assertEquals(strArray[i],
                    app.printFavoritesCount()[i]);
        }

    }

    @Test
    public void printFavoritesCount_Empty() {
        FavoriteService app = new FavoriteService();
        app.processInput("Миша: ");
        app.processInput("Маша: ");
        app.processInput("Степан: ");

        String[] strArray = new String[0];

        app.printUserFavorites();
        for (int i = 0; i < strArray.length; i++) {
            assertEquals(strArray[i],
                    app.printFavoritesCount()[i]);
        }
    }
}
