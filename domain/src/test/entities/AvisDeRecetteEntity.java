package com.itcentrex.adapters.entities;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class AvisDeRecetteEntity {

    private Integer id;
    private String referenceAvisRecette;
    private LocalDateTime dateHeureCreation;
    private String libelle;
    private Integer idUsagerDestinataire;
    private Double montant;
    private String numeroPosteComptable;

}
