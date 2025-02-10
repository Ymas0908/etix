package com.etix.domain.ports.driver;

import com.etix.domain.models.Evenement;
import com.etix.domain.models.enumerations.TypeEvenement;

import java.time.LocalDateTime;
import java.util.List;

public interface GererLesEvenements {



    Evenement saveEvenement(Evenement evenement);

    List<Evenement> getAllEvenements();
    List<Evenement> getEvenementsByDate(LocalDateTime date);

    List<Evenement> getEvenementsByLieu(String lieu);

    List<Evenement> getEvenementsByType(TypeEvenement type);




}
