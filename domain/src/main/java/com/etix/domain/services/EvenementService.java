package com.etix.domain.services;

import com.etix.domain.models.Evenement;
import com.etix.domain.models.enumerations.TypeEvenement;
import com.etix.domain.ports.driving.GestionEvenement;

import java.util.List;

public class EvenementService implements GestionEvenement {

    @Override
    public Evenement saveEvenement(Evenement evenement) {
        return null;
    }

    @Override
    public Evenement getEvenementById(Integer id) {
        return null;
    }

    @Override
    public List<Evenement> getAllEvenements() {
        return null;
    }

    @Override
    public List<Evenement> getEvenementsByType(TypeEvenement typeEvenement) {
        return null;
    }
}
