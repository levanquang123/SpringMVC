package com.lap.service;

import com.lap.model.User;
import com.lap.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepo;

    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public List<User> getAllUsers() {
        List<User> users = userRepo.findAll();
        if (users.isEmpty()) {
            User sample = new User();
            sample.setName("Default User");
            sample.setEmail("default@example.com");
            userRepo.save(sample);
            users = userRepo.findAll(); // Lấy lại sau khi thêm
        }
        return users;
    }
}
