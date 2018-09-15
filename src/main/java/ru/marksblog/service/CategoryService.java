package ru.marksblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.marksblog.model.Category;
import ru.marksblog.repository.CategoryRepository;

import java.util.List;

@Service
@Transactional
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(int id) {
        return categoryRepository.findById(id);
    }

    public void deleteById(int id) {
        categoryRepository.deleteById(id);
    }

<<<<<<< HEAD

=======
>>>>>>> master
}
