package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum StatutArticlePanier {
    COMPTANT, RESERVE, CREDIT;

    public static List<StatutArticlePanier> statutArticles() {
        return List.of(StatutArticlePanier.values());
    }
}