package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum Genre {
    FEMININ,
    MASCULIN;

    public static List<Genre> getList() {
        return List.of(Genre.values());
    }
}
