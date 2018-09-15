package ru.marksblog.repository;

import org.springframework.stereotype.Repository;
import ru.marksblog.model.Category;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class CategoryRepository {

    @PersistenceContext
    EntityManager entityManager;

    public void persist(Object obj) {
        if (obj != null) {
            entityManager.persist(obj);
        }
    }

    public Category findById(int id) {
        Query query = entityManager.createQuery("SELECT c FROM Category c WHERE c.id=:id", Category.class);
        query.setParameter("id", id);
        return (Category) query.getResultList().get(0);
    }

    public List<Category> findAll() {
        Query query = entityManager.createQuery("SELECT c FROM Category c", Category.class);
        return query.getResultList();
    }

    public void deleteById(int id) {
        Query query = entityManager.createQuery("DELETE FROM Category c WHERE c.id=:id");
        query.setParameter("id", id);
        query.executeUpdate();
    }
}
