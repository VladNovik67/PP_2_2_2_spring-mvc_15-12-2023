package web.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.Users;

import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class UsersDaoImp implements UsersDao {

    private static final List<Users> userList = new ArrayList<>();

    static {
        userList.add(new Users("Maibah", "2000", "23"));
        userList.add(new Users("Audi", "L", "203"));
        userList.add(new Users("BMV", "XL", "5000"));
        userList.add(new Users("BMV", "400", "KKK"));
        userList.add(new Users("LADA", "Grante", "3412"));
    }



    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(Users user) {
        sessionFactory.getCurrentSession().save(user);
    }


    @Override
    @SuppressWarnings("unchecked")
    public List<Users> getUsers(int count) {
        TypedQuery<Users> query = sessionFactory.getCurrentSession().createQuery("from Users");
        if (count == 0) {
            return query.getResultList();
        }
        return query.getResultList().stream().limit(count).collect(Collectors.toList());
    }
}
