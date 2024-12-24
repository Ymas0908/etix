package com.tix.etix.controllers;

import com.tix.etix.models.Evenement;
import com.tix.etix.models.Tickets;
import com.tix.etix.models.enumeration.TypeEvenement;
import com.tix.etix.models.enumeration.TypeTicket;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("etix/ticket/v1")
public class TicketController {


    @PostMapping("/saveTicket")
    public void saveTicket (Tickets Tickets) {
     System.out.println( Tickets + "ticket crée");
    }


    @GetMapping("/getTicketsbyEvenement/{idEvenement}")
    public ResponseEntity<List<Tickets>> getTicketsbyEvenement (@PathVariable("idEvenement") Integer idEvenement) {
        List<Tickets> tickets = new ArrayList<>();
//        tickets.add(new Tickets(1, "ref1", Evenement, "Libelle1", "Description1", 100.0, TypeTicket.VIP, 50, 50));
        return ResponseEntity.ok(tickets);

    }
}
