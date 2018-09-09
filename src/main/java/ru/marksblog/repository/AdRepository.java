package ru.marksblog.repository;

import org.springframework.stereotype.Repository;
import ru.marksblog.model.Ad;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class AdRepository {

    @PersistenceContext
    EntityManager entityManager;

    public void persist(Object obj) {
        if (obj != null) {
            entityManager.persist(obj);
        }
    }

    public Ad findById(int id) {
        Query query = entityManager.createQuery("SELECT ad FROM Ad ad WHERE ad.id=:id", Ad.class);
        query.setParameter("id", id);
        return (Ad) query.getResultList().get(0);
    }

    public List<Ad> findAll() {
        Query query = entityManager.createQuery("SELECT ad FROM Ad ad", Ad.class);
        return query.getResultList();
    }

    public void deleteById(int id) {
        Query query = entityManager.createQuery("DELETE FROM Ad ad WHERE ad.id=:id");
        query.setParameter("id", id);
        query.executeUpdate();
    }

    public void updateById(int id, String adname) {
        Query query = entityManager.createQuery("UPDATE Ad ad SET ad.adname=:adname");
        query.setParameter("adname", adname);
        query.executeUpdate();
    }

    public List<Ad> getAllByCategory(String category) {
        Query query = entityManager.createQuery("SELECT ad FROM Ad ad WHERE ad.category=:category", Ad.class);
        query.setParameter("category", category);
        return query.getResultList();
    }
}
