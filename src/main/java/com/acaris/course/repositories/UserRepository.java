package com.acaris.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acaris.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
