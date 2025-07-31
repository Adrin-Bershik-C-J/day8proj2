package com.example.helpdeskorm.repository;

import com.example.helpdeskorm.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}
