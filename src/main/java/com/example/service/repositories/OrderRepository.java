package com.example.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.service.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}