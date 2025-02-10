package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum TypeInstrumentPaiement {
    COMPTE_BANCAIRE, CARTE_BANCAIRE, MOBILE_WALLET, COMPTE_FIDELITE;

    public static List<TypeInstrumentPaiement> typeInstrumentPaiements() {
        return List.of(TypeInstrumentPaiement.values());
    }

}