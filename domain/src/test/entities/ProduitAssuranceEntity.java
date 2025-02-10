package com.itcentrex.adapters.entities;

import com.itcentrex.adapters.entities.enumeration.TypeAssurance;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ProduitAssuranceEntity {

    private Integer id;
    private String reference;
    private String libelle;
    private String description;
    private Integer idContributeuAssureur;
    private TypeAssurance typeAssurance;
    // private List<Prestation> prestations;

}
