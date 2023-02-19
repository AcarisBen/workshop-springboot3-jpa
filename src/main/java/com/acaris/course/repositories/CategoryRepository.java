package com.acaris.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acaris.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
