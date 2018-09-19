package ru.marksblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.marksblog.model.Ad;
import ru.marksblog.service.AdService;

import java.util.List;

@RestController
@RequestMapping(path = "/Api/ad")
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

    @PutMapping(path = "/update", produces = "application/json", consumes = "application/json")
    public Ad update(Ad ad) {
        adService.update(ad);
        return ad;
    }

    @DeleteMapping(path = "/deleteById", produces = "application/json", consumes = "application/json")
    public String deleteById(Ad ad) {
        adService.deleteById(ad.getId());
        return "redirect:/ad";
    }
}
