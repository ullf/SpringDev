package ru.marksblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.marksblog.model.User;
import ru.marksblog.repository.UserRepository;

@Service
@Transactional
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void persist(Object obj) {
        userRepository.persist(obj);
    }

    public void update(User user) {
        userRepository.update(user);
    }

    public void deleteByUsername(String username) {
        userRepository.deleteByUsername(username);
    }

    public boolean auth(String username, String password) {
        return userRepository.auth(username, password);
    }

    public String getPasswordByUsername(String username) {
        return userRepository.getPasswordByUsername(username);
    }
}
