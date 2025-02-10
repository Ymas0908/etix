package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum TypeArticle {

    PRODUIT, SERVICE, TAXE;

    public static List<TypeArticle> typeArticles() {
        return List.of(TypeArticle.values());
    }

}