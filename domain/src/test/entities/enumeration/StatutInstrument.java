package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum StatutInstrument {
    ACTIF,
    INACTIF;

    public static List<StatutInstrument> statutInstrumentList() {
        return List.of(StatutInstrument.values());
    }
}
