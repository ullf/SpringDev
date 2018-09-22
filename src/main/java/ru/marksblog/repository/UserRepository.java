package ru.marksblog.repository;

import org.springframework.stereotype.Repository;
import ru.marksblog.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.servlet.http.HttpSession;

@Repository
public class UserRepository {

    @PersistenceContext
    EntityManager entityManager;

    public void persist(Object obj) {
        if (obj != null) {
            entityManager.persist(obj);
        }
    }

    public void deleteByUsername(String username) {
        Query query = entityManager.createQuery("DELETE FROM User user WHERE user.username=:username", User.class);
        query.setParameter("username", username);
        query.executeUpdate();
    }

    public void update(User user) {
        entityManager.merge(user);
    }

    public void auth(String username, String password) {
        HttpSession session;
        Query query = entityManager.createQuery("SELECT user FROM User user WHERE user.username=:username and user.userpassword=:password", User.class);
        query.setParameter("username", username);
        query.setParameter("password", password);
    }
}
