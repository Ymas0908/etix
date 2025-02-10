package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum SituationMatrimoniale {
    CELIBATAIRE,
    MARIE,
    DIVORCE,
    VEUF,
    VEUVE;

    public static List<SituationMatrimoniale> situationMatrimonialeList() {
        return List.of(SituationMatrimoniale.values());
    }
}