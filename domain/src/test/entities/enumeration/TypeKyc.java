package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum TypeKyc {
    COURT,
    LONG;

    public static List<TypeKyc> getList() {
        return List.of(TypeKyc.values());
    }
}