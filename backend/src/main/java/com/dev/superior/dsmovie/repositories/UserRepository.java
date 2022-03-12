package com.dev.superior.dsmovie.repositories;

import com.dev.superior.dsmovie.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends  JpaRepository<User, Long> {
    
    User findByEmail(String email);
}
