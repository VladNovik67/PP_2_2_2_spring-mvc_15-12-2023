package web.dao;

import web.model.Users;

import java.util.List;

public interface UsersDao {

    void add(Users user);
    List<Users> getUsers(int count);

}
