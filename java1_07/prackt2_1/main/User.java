package java1_07.prackt2_1.main;

import java.util.Set;

public class User {
     private String name;
    private Set<String> favorites;

    public User(String name, Set<String> favorites) {
        this.name = name;
        this.favorites = favorites;
    }

    public String getName() {
        return name;
    }

    public Set<String> getFavorites() {
        return favorites;
    }
}
