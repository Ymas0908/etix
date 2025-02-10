package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum StatutOrdreVirement {
    INITIEE, EMIS, ANNULEE;

    public static List<StatutOrdreVirement> statutOrdreVirements() {
        return List.of(StatutOrdreVirement.values());
    }

}