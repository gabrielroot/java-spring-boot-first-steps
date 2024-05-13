package dio.web.myfirstwebapi.model;

import lombok.Data;

import java.util.Random;

@Data
public class User {
    private Integer id;
    private String login;
    private String password;

    public User() {}

    public User(String login, String password) {
        this.id = (new Random()).nextInt(101);
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}