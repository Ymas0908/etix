package com.itcentrex.adapters.entities;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class RecepisseDePaiementEntity {

    private Integer id;
    private LocalDateTime dateHeureCreation;
    private Integer idUsagerDestinataire;
    private Integer idContributeurEmetteur;
    private String referenceFacture;
    private String urlArchivage;


}
