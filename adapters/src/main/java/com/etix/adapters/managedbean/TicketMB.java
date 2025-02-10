package com.etix.adapters.managedbean;//package com.itcentrex.adapters.managedbean;
//
//import com.itcentrex.gimuemoa.gimregistra.application.model.Ticket;
//import com.itcentrex.gimuemoa.gimregistra.application.service.TicketService;
//import jakarta.annotation.PostConstruct;
//import jakarta.faces.view.ViewScoped;
//import jakarta.inject.Named;
//import lombok.Getter;
//import lombok.Setter;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.List;
//
//@Named
//@Setter
//@Getter
//@ViewScoped
//public class TicketMB implements Serializable {
//    List<Ticket> tickets = new ArrayList<>();
//    List<String> motifs = new ArrayList<>();
//    @Autowired
//    TicketService ticketService;
//
//    @PostConstruct
//    public void init() {
//        tickets = ticketService.findAllTickets();
//        motifs = ticketService.listMotifs();
//
//
//    }
//}
