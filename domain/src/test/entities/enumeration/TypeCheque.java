package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum TypeCheque {
    BARRE, NON_BARRE;

    public static List<TypeCheque> typeChequeList() {
        return List.of(TypeCheque.values());
    }
}
