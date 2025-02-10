package com.etix.domain.ports.driving;

import com.etix.domain.models.Tickets;

public interface TicketRepo {
    Tickets getTicketById(Integer id);
}
