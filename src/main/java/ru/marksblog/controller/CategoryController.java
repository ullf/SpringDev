package ru.marksblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.marksblog.model.Category;
import ru.marksblog.service.CategoryService;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @RequestMapping(path = "/category")
    public String category(ModelMap model) {
        Category category1 = new Category();
        model.addAttribute("category", category1);
        List<Category> cateogryList = categoryService.findAll();
        model.addAttribute("categories", cateogryList);
        return "category";
    }

    @RequestMapping(path = "/categoryAdd", method = RequestMethod.POST)
    public String categoryAdd(@ModelAttribute("category") Category category) {
        categoryService.persist(category);
        return "redirect:/category";
    }

    @RequestMapping(path = "/categoryDelete", method = RequestMethod.POST)
    public String categoryDelete(@ModelAttribute("category") Category category) {
        categoryService.deleteById(category.getId());
        return "redirect:/category";
    }

    @RequestMapping(path = "categoryUpdate", method = RequestMethod.POST)
    public String categoryUpdate(@ModelAttribute("category") Category category) {
        categoryService.update(category);
        return "redirect:/category";
    }
}
