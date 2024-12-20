package com.tix.etix.services.impl;

import com.tix.etix.models.Tickets;
import com.tix.etix.repositories.TicketsRepository;
import com.tix.etix.services.TicketService;

import java.util.List;

public class TicketsServiceImpl implements TicketService {
    private TicketsRepository ticketsRepository;

    @Override
    public Tickets creerTicket(Tickets tickets) {
        return ticketsRepository.save(tickets);
    }

    @Override
    public Tickets getTicketById(Integer id) {
        return ticketsRepository.findById(id).orElse(null);
    }

    @Override
    public List<Tickets> getTicketsByUsager(Integer usager) {
        return ticketsRepository.findByIdUsager(usager);
    }
}
