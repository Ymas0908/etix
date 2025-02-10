package com.itcentrex.adapters.entities;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class BureauDeDouaneEntity {

    private Integer id;
    private String nomBureau;
    private String adresseGeographique;
}
