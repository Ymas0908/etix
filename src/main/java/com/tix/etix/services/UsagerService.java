package com.tix.etix.services;

import com.tix.etix.models.Usager;

import java.util.List;

public interface UsagerService {

    Usager creerUsager(Usager usager);
    Usager getUsagerById(Integer id);
    List<Usager> getUsagerByEmail(String email);

}
