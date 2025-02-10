package com.itcentrex.adapters.entities;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class AvisImpositionEntity {

    private Integer id;
    private String referenceAvisImposition;
    private LocalDateTime dateHeureCreation;
    private String libelle;
    private Integer idUsagerDestinataire;
    private Double montant;
    private String ncc;
    private Integer idNatureImpo;
    private LocalDateTime dateEcheance;

}
