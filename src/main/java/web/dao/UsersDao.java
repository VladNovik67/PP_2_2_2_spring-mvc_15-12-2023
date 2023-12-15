package web.dao;

import web.model.User;

import java.util.List;

public interface UsersDao {

    public List<User> getAllUsers();

    User saveUser(User user);

    User updateUser(User user);

    User deleteUser(User user);


    User getUser(int count);

    void add(User user);

    List<User> getUsers(int count);

}
