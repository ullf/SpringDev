package ru.marksblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.marksblog.model.Ad;
import ru.marksblog.service.AdService;

import java.util.List;

@RestController
@RequestMapping(path = "/api/ad")
public class AdApi {

    @Autowired
    AdService adService;

    @GetMapping(produces = "application/json")
    public List<Ad> findAll() {
        return adService.findAll();
    }

    @GetMapping(path = "/{id}", produces = "application/json")
    public Ad getCategoryById(@PathVariable("id") Integer id) {
        return adService.findById(id);
    }
}
