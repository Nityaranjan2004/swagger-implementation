package com.example.swaggerImplementation.repo;


import com.example.swaggerImplementation.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}