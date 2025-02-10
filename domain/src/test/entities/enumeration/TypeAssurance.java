package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum TypeAssurance {
    IARD, EPARGNE;

    public static List<TypeAssurance> typeAssuranceList() {
        return List.of(TypeAssurance.values());
    }
}
