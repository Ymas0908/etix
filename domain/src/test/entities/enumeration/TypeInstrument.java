package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum TypeInstrument {
    COMPTE_BANCAIRE, CARTE_BANCAIRE, MOBILE_WALLET, COMPTE_FIDELITE;

    public static List<TypeInstrument> typeInstrumentList() {
        return List.of(TypeInstrument.values());
    }
}
