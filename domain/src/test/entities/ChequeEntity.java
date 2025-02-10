package com.itcentrex.adapters.entities;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class ChequeEntity {

    private Integer id;
    private String numeroCheque;
    private Integer idChequier;
    private LocalDateTime dateInitialisation;
    private LocalDateTime dateEcaissement;
    private Double montant;
    private String nomBeneficiaire;
    private Boolean oppose;
    private LocalDateTime dateOpposition;
    private String raisonOpposition;
}
