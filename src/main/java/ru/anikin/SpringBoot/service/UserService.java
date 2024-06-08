package ru.anikin.SpringBoot.service;


import ru.anikin.SpringBoot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void saveUser(User user);

    User showUserById(long id);

    void deleteUserById(long id);

}
