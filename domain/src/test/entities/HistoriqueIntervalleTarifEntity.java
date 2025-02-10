package com.itcentrex.adapters.entities;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class HistoriqueIntervalleTarifEntity {
    private IntervalleTarifEntity intervalleTarif;
    private Integer iD;
    private LocalDateTime dateHeureCreation;
    private Double montantMini;
    private Double montantMaxi;
    private Double montant;
    private Float pourcentage;
    private String commentaire;
    private Integer historiqueTarifServicePrecedent;
}