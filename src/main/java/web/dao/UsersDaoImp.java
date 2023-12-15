package web.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UsersDaoImp implements UsersDao {


    @PersistenceContext
    private EntityManager entityManager;


    public List<User> getAllUsers() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Transactional
    public User saveUser(User user) {
        entityManager.persist(user);
        entityManager.flush();
        return user;
    }


    @Transactional
    public User updateUser(User user) {
        entityManager.merge(user);
        entityManager.flush();
        return user;
    }

    @Transactional
    public User deleteUser(User user) {
        if (entityManager.contains(user)) {
            entityManager.remove(user);
        } else {
            entityManager.remove(entityManager.merge(user));
        }
        return user;
    }


    @Transactional
    public User getUser(int count) {
        User response = (User) entityManager.find(User.class, (long) count);
        return response;
    }

    @Override
    public void add(User user) {

    }

    @Override
    public List<User> getUsers(int count) {
        return null;
    }
}
