package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum TypeContribuable {

    INDIVIDUEL, SOCIETE;

    public static List<TypeContribuable> typeContribuableList() {
        return List.of(TypeContribuable.values());
    }
}
