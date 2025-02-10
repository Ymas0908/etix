package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum StatutContact {
	ACTIF,
	INACTIF;
	public static List<StatutContact> statutContacts() {
		return List.of(StatutContact.values());
	}

}