package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum TypeContributeur {
    BANQUE,
    EME,
    MICRO_FINANCE,
    TRESOR_PUBLIC,
    FINTECH;

    public static List<TypeContributeur> typeContributeurList() {
        return List.of(TypeContributeur.values());
    }

}
