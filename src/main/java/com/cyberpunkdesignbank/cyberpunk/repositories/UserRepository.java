package com.cyberpunkdesignbank.cyberpunk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cyberpunkdesignbank.cyberpunk.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
