package ru.marksblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.marksblog.model.Company;
import ru.marksblog.service.CompanyService;

import java.util.List;

@RestController
@RequestMapping(path = "/Api/company")
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

    @PostMapping(path = "/persist", produces = "application/json", consumes = "application/json")
    public Company persist(Company company) {
        companyService.persist(company);
        return company;
    }

    @PutMapping(path = "/update", produces = "application/json", consumes = "application/json")
    public Company update(Company company) {
        companyService.update(company);
        return company;
    }

    @DeleteMapping(path = "/deleteById", produces = "application/json", consumes = "application/json")
    public String deleteById(Company company) {
        companyService.deleteById(company.getId());
        return "redirect:admin/company";
    }
}
