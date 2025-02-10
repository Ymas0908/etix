package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum StatutVerification {
    A_VERIFIER,
    VERIFIE;

    public static List<StatutVerification> getList() {
        return List.of(StatutVerification.values());
    }
}