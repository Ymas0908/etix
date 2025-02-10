package com.itcentrex.adapters.entities;

import com.itcentrex.adapters.entities.enumeration.StatutCotisation;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class CotisationEntity {

    private Integer id;
    private Integer idContractAssurance;
    private Integer idContributeur;
    private Integer idInstrumentPaiement;
    private String numeroOrdreCotisation;
    private LocalDateTime dateAppelCotation;
    private LocalDateTime dateCotisation;
    private Double montant;
    private StatutCotisation statutCotisation;
}
