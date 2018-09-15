package ru.marksblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.marksblog.model.Company;
import ru.marksblog.repository.CompanyRepository;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> master
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
<<<<<<< HEAD

    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    public void updateById(int id, String compname, String address, String description) {
        companyRepository.updateById(id, compname, address, description);
    }
=======
>>>>>>> master
}
