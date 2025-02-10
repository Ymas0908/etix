package com.itcentrex.adapters.entities;

import lombok.*;

import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class DatEntity {

    private Integer id;
    private String numeroDossierDat;
    private LocalDateTime dateMiseEnPlace;
    private Double capitalPlace;
    private Float tauxInteret;
    private Integer dureePlacement;
    private Integer idUsager;
    private Integer idContributeur;
}
