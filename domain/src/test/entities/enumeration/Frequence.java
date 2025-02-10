package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum Frequence {
    PONCTUELLE, RECURRENTE;

    public static List<Frequence> frequences() {
        return List.of(Frequence.values());
    }

}