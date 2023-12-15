package web.service;

import java.util.List;
import web.model.User;

public interface UserService {
    User getUser(int count);

    Object deleteUser(User user);

    Object updateUser(User user);

    Object saveUser(User user);
    List<User> getAllUsers();
//    void add(Users user);
}
