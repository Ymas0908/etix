package com.itcentrex.adapters.entities;

import com.itcentrex.adapters.entities.enumeration.SensMouvement;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MouvementCompteEntity {

    private Integer id;
    private LocalDateTime dateOperation;
    private LocalDateTime dateValeur;
    private String libelle;
    private Double montant;
    private SensMouvement sensMouvement;
    private Integer idInstrument;
}
