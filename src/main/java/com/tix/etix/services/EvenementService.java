package com.tix.etix.services;

import com.tix.etix.models.Evenement;
import com.tix.etix.models.enumeration.TypeEvenement;
import java.util.List;

public interface EvenementService {
    Evenement saveEvenement();
    Evenement getEvenementById(Integer id);
    List<Evenement> getEvenementByLibelle(String libelle);

    List<Evenement>getEvenementByLieu(String lieu);
    List<Evenement>getEvenementByType(TypeEvenement typeEvenement);
    void deleteEvenementById(Integer id);

}
