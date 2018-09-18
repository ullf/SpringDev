package ru.marksblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.marksblog.model.Company;
import ru.marksblog.service.CompanyService;

import java.util.List;

@RestController
@RequestMapping(path = "/api/company")
public class CompanyApi {

    @Autowired
    CompanyService companyService;

    @GetMapping(produces = "application/json")
    public List<Company> findAll() {
        return companyService.findAll();
    }

    @GetMapping(path = "/{id}", produces = "application/json")
    public Company getCategoryById(@PathVariable("id") Integer id) {
        return companyService.findById(id);
    }
}
