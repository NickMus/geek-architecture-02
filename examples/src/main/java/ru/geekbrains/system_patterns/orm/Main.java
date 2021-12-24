package ru.geekbrains.system_patterns.orm;

public class Main {
    public static void main(String[] args) {
        UserDatabase userDatabase = new UserDatabase();
        User user = new User(1,"mike", "1111");
        UserRepository userRepository = new UserRepository(userDatabase.connection());
        userRepository.beginTransaction();

        userRepository.insert(user);
        userRepository.commitTransaction();
    }
}
