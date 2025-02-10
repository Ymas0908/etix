package com.itcentrex.adapters.entities;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class EcheanceRemboursementEntity {

    private Integer id;
    private Integer idContributeur;
    private String numeroCredit;
    private Integer idInstrumentPaiement;
    private String numeroOrdreEcheance;
    private LocalDateTime dateEcheance;
    private Double montant;
    private Double montantPenalite;

}
