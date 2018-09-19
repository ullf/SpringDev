package ru.marksblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.marksblog.model.Category;
import ru.marksblog.service.CategoryService;

import java.util.List;

@RestController
@RequestMapping(path = "/Api/category")
public class CategoryApi {

    @Autowired
    CategoryService categoryService;

    @GetMapping(produces = "application/json")
    public List<Category> findAll() {
        return categoryService.findAll();
    }

    @GetMapping(path = "/{id}", produces = "application/json")
    public Category getCategoryById(@PathVariable("id") Integer id) {
        return categoryService.findById(id);
    }

    @PostMapping(path = "/persist", produces = "application/json", consumes = "application/json")
    public Category persist(Category category) {
        categoryService.persist(category);
        return category;
    }

    @PutMapping(path = "/update", produces = "application/json", consumes = "application/json")
    public Category update(Category category) {
        categoryService.update(category);
        return category;
    }

    @DeleteMapping(path = "/deleteById", produces = "application/json", consumes = "application/json")
    public String deleteById(Category category) {
        categoryService.deleteById(category.getId());
        return "redirect:/category";
    }
}
