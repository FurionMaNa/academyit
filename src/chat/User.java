package chat;

import java.io.Serializable;

public class User implements Serializable {

    private String name;
    private String color;

    public User(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
