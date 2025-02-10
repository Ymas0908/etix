package com.itcentrex.adapters.entities;

import com.itcentrex.adapters.entities.enumeration.StatutDemande;
import com.itcentrex.adapters.entities.enumeration.TypeDemande;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class DemandeEntity {

    private Integer id;
    private String numeroDemande;
    private String libelle;
    private String description;
    private TypeDemande typeDemande;
    private Integer idUsagerInitiateur;
    private Integer idUsagerDestinataire;
    private Integer idContributeurInitiateur;
    private Integer idContributeurDestinataire;
    private LocalDateTime dateHeureDemande;
    private StatutDemande statutDemande;

}
