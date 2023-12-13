package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UsersDao;
import web.model.Users;
import java.util.List;

@Service
public class UsersServiceImp implements UserService {

    @Autowired
    private UsersDao userDao;

    @Transactional
    @Override
    public void add(Users user) {
        userDao.add(user);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Users> getUsers(int count) {
        return userDao.getUsers(count);
    }
}
