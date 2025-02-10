package com.itcentrex.adapters.entities;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MmpPaysOperationContributeurEntity {
    private ContributeurEntity contributeur;
    private MmpEntity mmp;
    private PaysEntity pays;
    private Integer iD;

    public void creerLesPaysDeOperationDuContributeur(List<PaysEntity> lesPaysDeOperation) {
        throw new UnsupportedOperationException();
    }

    public MmpPaysOperationContributeurEntity creerLesMmpParPaysDeOperationParContributeur() {
        throw new UnsupportedOperationException();
    }

    public void rattacherLesPaysSelectionnesAuContributeur(List<PaysEntity> lesPaysSelectionnes) {
        throw new UnsupportedOperationException();
    }

    public List<MmpPaysOperationContributeurEntity> collecterLesMmpParContributeurParPaysDeOperation(Integer idPays, Integer idContributeur) {
        throw new UnsupportedOperationException();
    }

    public void supprimerUneMmpRattacheeAuPaysOperation(Integer idMmp) {
        throw new UnsupportedOperationException();
    }

    public List<MmpEntity> collecterLesMmpParPaysDeOperation(Integer idPays) {
        throw new UnsupportedOperationException();
    }

    public void rattacherDesMmpsAuContributeur(List<MmpEntity> lesMmps) {
        throw new UnsupportedOperationException();
    }

    public void detacherDesMmpsDuContributeur(List<MmpEntity> lesMmps) {
        throw new UnsupportedOperationException();
    }
}