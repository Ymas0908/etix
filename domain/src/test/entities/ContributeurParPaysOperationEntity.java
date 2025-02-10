package com.itcentrex.adapters.entities;

import java.util.List;

public class ContributeurParPaysOperationEntity {
    private ContributeurEntity contributeur;
    private PaysEntity pays;
    private Integer iD;
    private String ribCompteOperation;

    public List<PaysEntity> collecterLesPaysDeOperationParContributeur(Integer idContributeur) {
        throw new UnsupportedOperationException();
    }
}