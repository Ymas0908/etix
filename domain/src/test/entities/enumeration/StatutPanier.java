package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum StatutPanier {
    INITIE, ANNULE, TRAITE;

    public static List<StatutPanier> statutPaniers() {
        return List.of(StatutPanier.values());
    }

}