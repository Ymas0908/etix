package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum StatutConsentement {
    INITIE, ACCEPTE, REFUSE, PROROGE, REVOQUE;

    public static List<StatutConsentement> statutConsentementList() {
        return List.of(StatutConsentement.values());
    }
}
