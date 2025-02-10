package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum StatutContributeur {
    INITIE,
    REJETTE,
    VALIDE,
    ACTIF,
    INACTIF;

    public static List<StatutContributeur> statutContributeurList() {
        return List.of(StatutContributeur.values());
    }
}
