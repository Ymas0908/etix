package com.itcentrex.adapters.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class CompteDeclarantEntity {

    private Integer id;
    private String numeroCompteDeclarant;
    private String raisonSociale;
    private String adresseGeographique;

}
