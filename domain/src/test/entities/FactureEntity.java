package com.itcentrex.adapters.entities;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class FactureEntity {
    private Integer id;
    private String numeroFacture;
    private Integer idContributeur;
    private String numeroTable;
    private LocalDateTime dateHeureCreation;
    private Double montantHT;
    private Double montantTVA;
    private Double montantTTC;
    private Boolean partage;
}
