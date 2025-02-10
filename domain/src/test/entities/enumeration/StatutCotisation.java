package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum StatutCotisation {
    INITIE, PAYEE;

    public static List<StatutCotisation> statutCotisationList() {
        return List.of(StatutCotisation.values());
    }
}
