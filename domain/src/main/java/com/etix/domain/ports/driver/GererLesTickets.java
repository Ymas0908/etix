package com.etix.domain.ports.driver;

import com.etix.domain.models.Tickets;
import com.etix.domain.models.enumerations.TypeTicket;

import java.util.List;

public interface GererLesTickets {


    Tickets saveTicket(Tickets tickets);
    List<Tickets> getAllTickets();
}
