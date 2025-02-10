package com.etix.domain.ports.driving;

import com.etix.domain.models.Tickets;

import java.util.List;

public interface GestionTicket {

    Tickets saveTicket(Tickets tickets);

    List<Tickets> getAllTickets();
    Tickets getTicketById(Integer id);
}
