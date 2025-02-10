package com.itcentrex.adapters.entities;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class AttestationBancaireEntity {

    private Integer id;
    private String referenceAttestation;
    private LocalDateTime dateHeureEdition;
    private String objet;
    private Integer idUsagerDemandeur;
    private Integer idInstrumentConserne;
    private Integer idContributeur;
    private String urlArchivage;
}
