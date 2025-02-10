package com.itcentrex.adapters.entities;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class BordereauDeDeclarationEntity {

    private Integer id;
    private String referenceBordereau;
    private String libelle;
    private Integer idBureauDouane;
    private LocalDateTime dateHeureCreation;
    private Integer idUsagerDestinataire;
    private String ncc;
    private Integer idCompteDeCredit;
    private Double montantTaxesDouanieres;
    private LocalDateTime dateEcheance;
}
