package ru.anikin.SpringBoot.DAO;



import ru.anikin.SpringBoot.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();

    public void saveUser(User user);

    public User showUserById(long id);

    public void deleteUserById(long id);
}
