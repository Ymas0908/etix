package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum Statut {
	ACTIF,
	INACTIF;
	public static List<Statut> statuts() {
		return List.of(Statut.values());
	}

}