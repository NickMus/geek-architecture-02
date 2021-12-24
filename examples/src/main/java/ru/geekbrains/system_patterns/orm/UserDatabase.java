package ru.geekbrains.system_patterns.orm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UserDatabase {

    static Connection connection;


    public Connection connection() {
        String url = "jdbc:mysql://localhost:3306/users";
        String login = "root";
        String password = "1234";
        try {
            connection = DriverManager.getConnection(url, login, password);
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public void insert(List<User> users) {
        try {
            PreparedStatement insertUser = connection().prepareStatement("insert into users");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
