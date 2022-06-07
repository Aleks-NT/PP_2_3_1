package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void save(User user);

    void deleteById(long id);

    void edit(User user);

    User getById(long id);
}