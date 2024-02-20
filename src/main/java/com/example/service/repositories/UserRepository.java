package com.example.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.service.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
