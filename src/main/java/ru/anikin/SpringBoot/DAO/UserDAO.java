package ru.anikin.SpringBoot.DAO;



import ru.anikin.SpringBoot.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();

    void saveUser(User user);

    User showUserById(long id);

    void deleteUserById(long id);
}
