package com.example.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.service.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
