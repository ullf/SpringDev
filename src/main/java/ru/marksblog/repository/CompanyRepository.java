package ru.marksblog.repository;

import org.springframework.stereotype.Repository;
import ru.marksblog.model.Company;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class CompanyRepository {

    @PersistenceContext
    EntityManager entityManager;

    public void persist(Object obj) {
        if (obj != null) {
            entityManager.persist(obj);
        }
    }

    public Company findById(int id) {
        Query query = entityManager.createQuery("SELECT c FROM Company c WHERE c.id=:id", Company.class);
        query.setParameter("id", id);
        return (Company) query.getResultList().get(0);
    }

    public void deleteById(int id) {
        Query query = entityManager.createQuery("DELETE FROM Company c WHERE c.id=:id");
        query.setParameter("id", id);
        query.executeUpdate();
    }

    public List<Company> findAll() {
        Query query = entityManager.createQuery("SELECT company FROM Company company", Company.class);
        return query.getResultList();
    }

    public void update(Company company) {
        entityManager.merge(company);
    }

}
