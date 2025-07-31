package com.example.helpdeskorm.controller;
import com.example.helpdeskorm.service.TicketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping("/tickets")
    public List<Object> getTicketsWithTags() {
        return ticketService.getAllTickets().stream().map(ticket -> {
            return new Object() {
                public String title = ticket.getTitle();
                public String user = ticket.getUser().getName();
                public List<String> tags = ticket.getTags().stream()
                        .map(tag -> tag.getName())
                        .collect(Collectors.toList());
            };
        }).collect(Collectors.toList());
    }
}


