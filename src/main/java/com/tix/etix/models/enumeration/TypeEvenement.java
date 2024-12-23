package com.tix.etix.models.enumeration;
import java.util.List;

public enum TypeEvenement {
    CONCERT,
    SPECTACLE,
    MATCH,
    FESTIVAL;

    public static List<TypeEvenement> TypeEvenement() {
        return List.of(TypeEvenement.values());
    }
}
