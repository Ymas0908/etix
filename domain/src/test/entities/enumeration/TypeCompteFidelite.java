package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum TypeCompteFidelite {
    USAGER, MARCHAND;

    public static List<TypeCompteFidelite> typeCompteFideliteList() {
        return List.of(TypeCompteFidelite.values());
    }
}
