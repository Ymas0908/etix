package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum TypeDemande {
    CHEQUIER, CREDIT, OUVERTURE_DE_COMPTE, CARTE_BANCAIRE, TUTORAT;

    public static List<TypeDemande> typeDemandeList() {
        return List.of(TypeDemande.values());
    }
}
