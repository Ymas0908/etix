package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum StatutTerminal {
    INITIE, ACTIF, INACTIF, VERROUILLE;

    public static List<StatutTerminal> statutTerminals() {
        return List.of(StatutTerminal.values());
    }

}