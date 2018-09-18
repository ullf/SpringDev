package ru.marksblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.marksblog.model.Category;
import ru.marksblog.service.CategoryService;

import java.util.List;

@RestController
@RequestMapping(path = "/api/category")
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
}
