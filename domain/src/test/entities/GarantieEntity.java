package com.itcentrex.adapters.entities;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class GarantieEntity {

    private Integer id;
    private String referenceGarantie;
    private String libelle;
    private String description;
    private Integer idProduitAssurance;
}
