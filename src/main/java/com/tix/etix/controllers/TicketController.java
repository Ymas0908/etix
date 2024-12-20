package com.tix.etix.controllers;

import com.tix.etix.models.Tickets;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("etix/ticket/v1")
public class TicketController {


    @PostMapping("/saveTicket")
    public void saveTicket (Tickets Tickets) {
     System.out.println( Tickets + "ticket crée");
    }


    @GetMapping("/getTicketsbyEvenement/{idEvenement}")
    public ResponseEntity<Tickets> getTicketsbyEvenement (@PathVariable("idEvenement") Integer idEvenement) {
        return ResponseEntity.ok(new Tickets());
    }
}
