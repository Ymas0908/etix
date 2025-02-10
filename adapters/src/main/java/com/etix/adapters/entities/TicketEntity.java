package com.etix.adapters.entities;

import com.etix.domain.models.Tickets;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Builder
@Table(name = "tickets")
public class TicketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String reference;
    private String libelle;
    private String description;
    private Double prix;
    private Integer quantite;

    public static TicketEntity toEntity(Tickets tickets) {
        return new TicketEntityBuilder()
                .id(tickets.getId())
                .reference(tickets.getReference())
                .libelle(tickets.getLibelle())
                .description(tickets.getDescription())
                .prix(tickets.getPrix())
                .quantite(tickets.getQuantite())
                .build();
    }

    public Tickets toDomain() {
        return new Tickets.Builder()
                .id(id)
                .reference(reference)
                .libelle(libelle)
                .description(description)
                .prix(prix)
                .quantite(quantite)
                .build();
    }

}
