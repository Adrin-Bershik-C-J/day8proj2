package com.example.helpdeskorm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.helpdeskorm.domain.TicketTag;

public interface TicketTagRepository extends JpaRepository<TicketTag,Long>{
    
}
