package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {

    List<User> getAllUsers();

    void save(User user);

    void deleteById(long id);

    void edit(User user);

    User getById(long id);
}