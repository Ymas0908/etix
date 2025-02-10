package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum OptionLivraison {
    RETIRE, LIVRE;

    public static List<OptionLivraison> optionLivraisons() {
        return List.of(OptionLivraison.values());
    }

}