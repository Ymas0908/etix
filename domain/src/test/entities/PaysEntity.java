package com.itcentrex.adapters.entities;


import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class PaysEntity {

    private Integer iD;
    private String codeIso;
    private String indicatifInternational;
    private String nom;
    private String nationalite;

    public List<PaysEntity> collecterLesPays() {
        throw new UnsupportedOperationException();
    }

    public Integer collecterLaLongueurDuMsidnDuPays(PaysEntity pays) {
        throw new UnsupportedOperationException();
    }

    public PaysEntity collecterUnPays(Integer idPays) {
        throw new UnsupportedOperationException();
    }

    public boolean verifierLaLongueurEtLaSyntaxeDuMsidn(Integer msidn) {
        throw new UnsupportedOperationException();
    }

    public void verifierLaValiditeDuMsidn(List<String> lesPrefixes) {
        throw new UnsupportedOperationException();
    }

    public List<PaysEntity> collecterLesPaysOperationDisponibles() {
        throw new UnsupportedOperationException();
    }

    public List<PaysEntity> collecterLesPaysDeOperationParContributeur(Integer idContributeur) {
        throw new UnsupportedOperationException();
    }
}