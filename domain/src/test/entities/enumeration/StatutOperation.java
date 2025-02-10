package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum StatutOperation {
    INITIEE, ENCOURS, SUSPENDUE, ANNULEE, TERMINEE;

    public static List<StatutOperation> statutOrdreVirements() {
        return List.of(StatutOperation.values());
    }

}