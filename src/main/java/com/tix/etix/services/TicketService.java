package com.tix.etix.services;

import com.tix.etix.models.Evenement;
import com.tix.etix.models.Tickets;
import com.tix.etix.models.Usager;
import java.util.List;

public interface TicketService {

    Tickets creerTicket(Tickets tickets);
    Tickets getTicketById(Integer id);
    List<Tickets> getTicketsByUsager(Integer usager);
}
