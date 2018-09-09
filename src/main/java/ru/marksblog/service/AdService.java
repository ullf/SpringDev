package ru.marksblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.marksblog.model.Ad;
import ru.marksblog.repository.AdRepository;

import java.util.List;

@Service
@Transactional
public class AdService {

    @Autowired
    AdRepository adRepository;

    public void persist(Object obj) {
        if (obj != null) {
            adRepository.persist(obj);
        }
    }

    public Ad findById(int id) {
        Ad ad = adRepository.findById(id);
        return ad;
    }

    public List<Ad> findAll() {
        List<Ad> ads = adRepository.findAll();
        return ads;
    }

    public void deleteById(int id) {
        adRepository.deleteById(id);
    }

    public void updateById(int id, String adname) {
        adRepository.updateById(id, adname);
    }

    public List<Ad> getAllByCategory(String category) {
        List<Ad> ads = adRepository.getAllByCategory(category);
        for (int i = 0; i < ads.size(); i++) {
            System.out.println(ads.get(i).toString());
        }
        return ads;
    }
}
