package com.acaris.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acaris.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
