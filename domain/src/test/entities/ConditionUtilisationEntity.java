package com.itcentrex.adapters.entities;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class ConditionUtilisationEntity {

    private Integer id;
    private Double montantMaxJournalierRetrait;
    private Double montantMaxHebdomadaireRetrait;
    private Double montantMaxMensuelRetrait;
    private Double montantMaxJournalierAchat;
    private Double montantMaxHebdomadaireAchat;
    private Double montantMaxMensuelAchat;
    private Double montantaMaxSolde;
    private Integer idInstrumentPaiement;

}
