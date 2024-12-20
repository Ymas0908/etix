package com.tix.etix.repositories;

import com.tix.etix.models.Tickets;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketsRepository extends JpaRepository<Tickets, Integer> {
    List<Tickets> findByIdUsager(Integer idUsager);

    Tickets findByReference(String reference);

    List<Tickets> findByprix(Double prix);
}
