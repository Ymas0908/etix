package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum StatutDemande {
    INITIEE, ACCEPTEE, REFUSEE;

    public static List<StatutDemande> statutDemandeList() {
        return List.of(StatutDemande.values());
    }
}
