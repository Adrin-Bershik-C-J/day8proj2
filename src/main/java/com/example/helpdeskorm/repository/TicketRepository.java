package com.example.helpdeskorm.repository;

import com.example.helpdeskorm.domain.Ticket;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
