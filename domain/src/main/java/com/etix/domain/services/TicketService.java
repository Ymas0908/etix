package com.etix.domain.services;

import com.etix.domain.models.Tickets;
import com.etix.domain.models.enumerations.TypeTicket;
import com.etix.domain.ports.driver.GererLesTickets;
import com.etix.domain.ports.driving.GestionTicket;

import java.util.List;

public class TicketService implements GererLesTickets {
    private final GestionTicket gestionTicket;

    public TicketService(GestionTicket gestionTicket) {
        this.gestionTicket = gestionTicket;
    }


    @Override
    public Tickets saveTicket(Tickets tickets) {
        return gestionTicket.saveTicket(tickets);
    }

    @Override
    public List<Tickets> getAllTickets() {
        return gestionTicket.getAllTickets();
    }


}
