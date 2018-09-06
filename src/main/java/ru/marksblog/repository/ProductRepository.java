package ru.marksblog.repository;

import org.springframework.stereotype.Repository;
import ru.marksblog.model.Product;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

//Для изучния
@Repository
public class ProductRepository {

    @PersistenceContext
    EntityManager entityManager;


    public void persist(Object object){
        if(object!=null){
            entityManager.persist(object);
        }
    }

    public Product selectProductById(int id){
        return entityManager.createQuery("SELECT e FROM Product e WHERE id="+id,Product.class).getResultList().get(0);
    }

    public List<Product> printAll(){
        return entityManager.createQuery("SELECT e FROM Product e",Product.class).getResultList();
    }
}
