package ru.marksblog.repository;

import org.springframework.stereotype.Repository;
import ru.marksblog.model.Company;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
<<<<<<< HEAD
import java.util.List;
=======
>>>>>>> master

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
<<<<<<< HEAD

    public List<Company> findAll() {
        Query query = entityManager.createQuery("SELECT company FROM Company company", Company.class);
        return query.getResultList();
    }

    public void updateById(int id, String compname, String address, String description) {
        Query query = entityManager.createQuery("UPDATE Company comp SET comp.compname=:compname,comp.description=:description,comp.address=:address WHERE comp.id=:id");
        query.setParameter("id", id);
        query.setParameter("compname", compname);
        query.setParameter("address", address);
        query.setParameter("description", description);
        query.executeUpdate();
    }

=======
>>>>>>> master
}
