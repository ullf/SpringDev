package ru.marksblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.marksblog.model.Company;
import ru.marksblog.repository.CompanyRepository;

@Service
@Transactional
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    public void persist(Object obj) {
        companyRepository.persist(obj);
    }

    public Company findById(int id) {
        return companyRepository.findById(id);
    }

    public void deleteById(int id) {
        companyRepository.deleteById(id);
    }
}
