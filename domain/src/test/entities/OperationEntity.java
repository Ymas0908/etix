package com.itcentrex.adapters.entities;

import com.itcentrex.adapters.entities.enumeration.NatureOperation;
import com.itcentrex.adapters.entities.enumeration.StatutOperation;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Map;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class OperationEntity {

    private Integer id;
    private LocalDateTime dateHeureCreation;
    private Integer idUsager;
    private Integer idTypeOperation;
    private NatureOperation natureOperation;
    private String libelle;
    private Integer idInstrumentUsagerInitiateur;
    private Integer idInstrumentUsagerBeneficiaire;
    private Integer idInstrumentContributeurInitiateur;
    private Map<Integer, Double> lesMarchands;
    private StatutOperation statutOperation;
    private Integer idTransactionCorrespondante;
    private Double montantTotalHT;
    private Double montantFrais;
    private Double montantTVA;

}
