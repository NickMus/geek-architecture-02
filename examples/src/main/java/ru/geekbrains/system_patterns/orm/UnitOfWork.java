package ru.geekbrains.system_patterns.orm;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class UnitOfWork {

    private final Connection conn;
    private UserDatabase userDatabase;
    private UserRepository userRepository;

    private final List<User> newUsers = new ArrayList<>();
    private final List<User> updateUsers = new ArrayList<>();
    private final List<User> deleteUsers = new ArrayList<>();

    public UnitOfWork(Connection conn) {
        this.conn = conn;
        this.userDatabase = new UserDatabase();
    }

    public void registerNew(User user) {
        this.newUsers.add(user);
    }

    public void registerUpdate(User user) {
        this.updateUsers.add(user);
    }

    public void registerDelete(User user) {
        this.deleteUsers.add(user);
    }

    public void commit() {
        insert();
        update();
        delete();
    }

    private void update() {
        // TODO
    }

    private void insert() {
        // TODO
        for (int i = 0; i < newUsers.size(); i++) {
            userDatabase.insert(newUsers);
        }
    }

    private void delete() {
        // TODO
    }
}
