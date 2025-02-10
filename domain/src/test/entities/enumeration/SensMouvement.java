package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum SensMouvement {
    DEBIT, CREDIT;

    public static List<SensMouvement> sensMouvements() {
        return List.of(SensMouvement.values());
    }

}