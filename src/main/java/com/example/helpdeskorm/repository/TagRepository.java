package com.example.helpdeskorm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.helpdeskorm.domain.Tag;

public interface TagRepository extends JpaRepository<Tag,Long>{
    
}
