package ru.marksblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.marksblog.model.Product;
import ru.marksblog.repository.ProductRepository;

import java.util.List;

//Для изучния
@Service
@Transactional
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public void persist(Object object){ productRepository.persist(object); }

    public void printAll() {
        List<Product> products=productRepository.printAll();
        for(int i=0;i<products.size();i++){
            System.out.println(products.get(i).getName());
        }
    }

    public void selectProductById(int id){
        System.out.println(productRepository.selectProductById(id).getName());
    }

    public ProductRepository getProductRepository() {
        return productRepository;
    };
}
