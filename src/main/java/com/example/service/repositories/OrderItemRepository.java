package com.example.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.service.entities.OrderItem;
import com.example.service.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}