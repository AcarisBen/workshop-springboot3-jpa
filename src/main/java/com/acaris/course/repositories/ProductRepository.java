package com.acaris.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acaris.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
