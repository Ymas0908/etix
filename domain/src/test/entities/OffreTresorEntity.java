package com.itcentrex.adapters.entities;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class OffreTresorEntity {

    private Integer id;
    private String reference;
    private String libelle;
    private String description;
    private Integer prixUnitaire;
    private Integer idPosteComptable;
}
