package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum TypeOffre {
    
    ACTION, BON_TRESOR, OBLIGATION_TRESOR;

    public static List<TypeOffre> typeOffres() {
        return List.of(TypeOffre.values());
    }

}