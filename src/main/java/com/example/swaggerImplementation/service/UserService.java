package com.example.swaggerImplementation.service;
import com.example.swaggerImplementation.model.User;
import com.example.swaggerImplementation.repo.UserRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }


    @Cacheable(cacheNames = "user",key = "#id")
    public User getUser(Long id)
    {
        return userRepository.findById(id).orElse(null);
    }
}