package com.itcentrex.adapters.entities;

import com.itcentrex.adapters.entities.enumeration.StatutContact;
import com.itcentrex.adapters.entities.enumeration.TypeTaxe;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class TaxeEntity {

    private Integer id;
    private String libelle;
    private String description;
    private Integer idContributeurEmetteur;
    private TypeTaxe typeTaxe;


}
