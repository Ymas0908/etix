package com.itcentrex.adapters.entities;

import com.itcentrex.adapters.entities.enumeration.Frequence;
import com.itcentrex.adapters.entities.enumeration.StatutOrdreVirement;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class OrdreVirementEntity {

    private Integer id;
    private LocalDateTime dateHeureCreation;
    private LocalDateTime dateHeurePremiereEmission;
    private LocalDateTime dateHeureDerniereEmission;
    private String libelle;
    private Integer idInstrumentPaiementInitiateur;
    private Integer idInstrumentPaiementBeneficiaire;
    private Double montant;
    private StatutOrdreVirement statutOrdreVirement;
    private Frequence frequence;

}
