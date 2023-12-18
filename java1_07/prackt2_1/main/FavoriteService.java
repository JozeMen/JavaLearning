package java1_07.prackt2_1.main;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class FavoriteService {
    private Set<String> allFavorites;
    private Set<String> commonFavorites;
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }
    public Set<String> getAllFavorites() {
        return allFavorites;
    }

    public FavoriteService() {
        allFavorites = new HashSet<>();
        commonFavorites = new HashSet<>();
        users = new ArrayList<>();
    }

    public void processInput(String input) {
        String[] parts = input.split(":");
        if (parts.length == 2) {
            String userName = parts[0].trim();
            String[] favorites = parts[1].split(",");
            Set<String> userFavorites = new HashSet<>(Arrays.asList(favorites));

            if (users.isEmpty()) {
                commonFavorites.addAll(userFavorites);
            } else {
                commonFavorites.retainAll(userFavorites);
            }

            allFavorites.addAll(userFavorites);

            users.add(new User(userName, userFavorites));
        } else {
            System.out.println("Некорректный формат ввода, попробуйте снова");
        }
    }

    public String printCommonFavorites() {
        return "Всеобщие любимки: " + String.join(", ", commonFavorites);
    }

    public String printAllFavorites() {
        return "Все любимки: " + String.join(", ", allFavorites);
    }

    public String[] printUserFavorites() {
        String[] result = new String[users.size()];
        int i = 0;
        for (User user : users) {
            Set<String> uniqueUserFavorites = new HashSet<>(user.getFavorites());
            uniqueUserFavorites.removeAll(commonFavorites);

            result[i++] = user.getName() + ": " + String.join(", ", uniqueUserFavorites);
        }
        return result;
    }

    public String[] printFavoritesCount() {
        String[] result;
        Map<String, Integer> favoritesCountMap = new HashMap<>();
        for (String favorite : allFavorites) {
            int count = 0;
            for (User user : users) {
                if (user.getFavorites().contains(favorite)) {
                    count++;
                }
            }
            favoritesCountMap.put(favorite, count);
        }
        result = new String[favoritesCountMap.size()];
        int i = 0;
        System.out.println("Количество пользователей, которым нравится каждая любимка:");
        for (Map.Entry<String, Integer> entry : favoritesCountMap.entrySet()) {
            result[i++] = entry.getKey() + ": " + entry.getValue();
        }
        return result; 
    }
}
