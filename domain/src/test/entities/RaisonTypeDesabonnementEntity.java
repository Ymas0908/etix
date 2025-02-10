package com.itcentrex.adapters.entities;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class RaisonTypeDesabonnementEntity {
    private ContributeurParPaysOperation contributeur_Par_Pays_Operation;
    private Integer iD;
    private String libelle;
    private String commentaire;

    public List<RaisonTypeDesabonnementEntity> collecterLesRaisonsTypesDeDesabonnement() {
        throw new UnsupportedOperationException();
    }
}