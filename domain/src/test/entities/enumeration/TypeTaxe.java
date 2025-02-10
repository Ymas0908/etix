package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum TypeTaxe {
	IMPOT,
	TAXE;
	public static List<TypeTaxe> typeTaxes() {
		return List.of(TypeTaxe.values());
	}

}