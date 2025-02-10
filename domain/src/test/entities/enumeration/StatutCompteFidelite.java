package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum StatutCompteFidelite {
    ACTIF, INACTIF;

    public static List<StatutCompteFidelite> statuCompteFideliteList() {
        return List.of(StatutCompteFidelite.values());
    }
}
