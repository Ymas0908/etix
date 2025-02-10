package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum StatutAutorisation {
    INITIE, AUTORISE, REFUSE;

    public static List<StatutAutorisation> statutAutorisationList() {
        return List.of(StatutAutorisation.values());
    }
}
