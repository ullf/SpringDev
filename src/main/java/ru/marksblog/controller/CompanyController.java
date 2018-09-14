package ru.marksblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.marksblog.model.Company;
import ru.marksblog.service.CompanyService;

import java.util.List;

@Controller
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @RequestMapping(path = "/company")
    public String company(ModelMap model) {
        Company company = new Company();
        model.addAttribute("company", company);
        List<Company> companies = companyService.findAll();
        model.addAttribute("companies", companies);
        return "company";
    }

    @RequestMapping(path = "/companyadd", method = RequestMethod.POST)
    public String company(@ModelAttribute("company") Company company) {
        companyService.persist(company);
        return "redirect:/company";
    }

    @RequestMapping(path = "/companydelete", method = RequestMethod.POST)
    public String companyDelete(@ModelAttribute("company") Company company) {
        companyService.deleteById(company.getId());
        return "redirect:/company";
    }

    @RequestMapping(path = "/companyupdate", method = RequestMethod.POST)
    public String companyUpdate(@ModelAttribute("company") Company company) {
        companyService.updateById(company.getId(), company.getCompname(), company.getAddress(), company.getDescription());
        return "redirect:/company";
    }
}
