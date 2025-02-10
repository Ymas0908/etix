package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum TypeInstitutionReglement {
    BANQUE,
    MOBILE,
    MICRO_FINANCE,
    CARTE_BANCAIRE;

    public static List<TypeInstitutionReglement> typeInstitutionReglementList() {
        return List.of(TypeInstitutionReglement.values());
    }

}
