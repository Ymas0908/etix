package com.itcentrex.adapters.entities;

import com.itcentrex.adapters.entities.enumeration.StatutConsentement;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class ConsentementEntity {

    private Integer id;
    private String libelle;
    private LocalDateTime dateHeureDemande;
    private String description;
    private Integer idUsagerDestinataire;
    private Integer idContributeurEmetteur;
    private LocalDate dateValidation;
    private StatutConsentement statutConsentement;
    private String motifRevocation;
    private LocalDateTime dateHeureTraitement;

}
