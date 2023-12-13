package web.service;

import web.model.Users;

import java.util.List;

public interface UserService {
    List<Users> getUsers(int count);
    void add(Users user);
}
