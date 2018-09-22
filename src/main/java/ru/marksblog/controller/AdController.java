package ru.marksblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.marksblog.model.Ad;
import ru.marksblog.service.AdService;

import java.util.List;

@Controller
public class AdController {

    @Autowired
    AdService adService;

    @RequestMapping(path = "/admin/ad")
    public String ad(ModelMap model) {
        Ad ad = new Ad();
        model.addAttribute("ad", ad);
        List<Ad> ads = adService.findAll();
        model.addAttribute("ads", ads);
        return "admin/ad";
    }

    @RequestMapping(path = "/adAdd", method = RequestMethod.POST)
    public String adAdd(@ModelAttribute("ad") Ad ad) {
        adService.persist(ad);
        return "redirect:admin/ad";
    }

    @RequestMapping(path = "/adDelete", method = RequestMethod.POST)
    public String adDelete(@ModelAttribute("ad") Ad ad) {
        adService.deleteById(ad.getId());
        return "redirect:admin/ad";
    }

    @RequestMapping(path = "/adUpdate", method = RequestMethod.POST)
    public String adUpdate(@ModelAttribute("ad") Ad ad) {
        adService.update(ad);
        return "redirect:admin/ad";
    }

    @RequestMapping(path = "/getAllByCategory", method = RequestMethod.POST)
    public String getAllByCategory(@ModelAttribute("ad") Ad ad, ModelMap model) {
        List<Ad> ads = adService.getAllByCategory(ad.getCategory());
        model.addAttribute("catads", ads);
        return "admin/ad";
    }
}
