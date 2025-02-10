package com.itcentrex.adapters.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class CompteDeCreditEntity {

    private Integer id;
    private String numeroCompteCredit;
    private String raisonSociale;
    private String adresseGeographique;
    private Double solde;

}
