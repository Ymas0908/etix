package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum StatutReservation {
    INITIEE, ANNULEE, CONFIRMEE;

    public static List<StatutReservation> statutReservations() {
        return List.of(StatutReservation.values());
    }

}