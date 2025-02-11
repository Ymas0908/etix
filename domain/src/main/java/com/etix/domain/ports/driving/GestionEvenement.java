package com.etix.domain.ports.driving;

import com.etix.domain.models.Evenement;
import com.etix.domain.models.enumerations.TypeEvenement;

import java.time.LocalDateTime;
import java.util.List;

public interface GestionEvenement {

    Evenement saveEvenement(Evenement evenement);

    Evenement getEvenementById(Integer id);


    List<Evenement> getAllEvenements();


    List<Evenement> getEvenementsByLieu(String lieu);

    List<Evenement> getEvenementsByType(TypeEvenement typeEvenement);

    List<Evenement> getEvenementsByDate(LocalDateTime date);

}
