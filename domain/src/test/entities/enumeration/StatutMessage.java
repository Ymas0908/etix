package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum StatutMessage {
    LU, NON_LUE;

    public static List<StatutMessage> statutMessageList() {
        return List.of(StatutMessage.values());
    }
}

