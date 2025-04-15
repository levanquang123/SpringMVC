package com.lap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lap.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
