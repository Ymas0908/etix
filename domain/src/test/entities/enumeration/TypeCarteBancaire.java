package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum TypeCarteBancaire {

    DEBIT, CREDIT, PREPAYEE;

    public static List<TypeCarteBancaire> typeCarteBancaires() {
        return List.of(TypeCarteBancaire.values());
    }

}