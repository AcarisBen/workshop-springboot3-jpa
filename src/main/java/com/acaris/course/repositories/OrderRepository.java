package com.acaris.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acaris.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
