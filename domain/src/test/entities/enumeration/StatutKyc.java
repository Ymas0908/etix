package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum StatutKyc {
    PRE_VALIDE,
    INITIE,
    VALIDE,
    REJETE,
    ELIGIBLE_BLACKLISTE,
    BLACKLISTE;

    public static List<StatutKyc> statutKycList() {
        return List.of(StatutKyc.values());
    }
}