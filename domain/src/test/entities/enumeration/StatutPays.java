package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum StatutPays {
    ACTIF,
    INACTIF;

    public static List<StatutPays> statutPaysList() {
        return List.of(StatutPays.values());
    }
}
