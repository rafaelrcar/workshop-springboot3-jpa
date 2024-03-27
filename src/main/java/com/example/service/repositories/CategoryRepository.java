package com.example.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.service.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
