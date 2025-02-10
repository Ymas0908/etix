package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum StatutNotification {
    INITIEE, LUE, NON_LUE;

    public static List<StatutNotification> statutNotifications() {
        return List.of(StatutNotification.values());
    }

}