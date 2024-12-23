package com.tix.etix.services.impl;

import com.tix.etix.models.Evenement;
import com.tix.etix.models.enumeration.TypeEvenement;
import com.tix.etix.repositories.EvenementRepository;
import com.tix.etix.services.EvenementService;

import java.util.List;

public class EvenementServiceImpl implements EvenementService {

    private EvenementRepository evenementRepository;
    @Override
    public Evenement saveEvenement() {
return evenementRepository.save(new Evenement());
    }

    @Override
    public Evenement getEvenementById(Integer id) {
        return evenementRepository.findById(id).orElse(null);
    }

    @Override
    public List<Evenement> getEvenementByLibelle(String libelle) {
        return evenementRepository.findByLibelle(libelle);
    }

    @Override
    public List<Evenement> getEvenementByLieu(String lieu) {
        return evenementRepository.findByLieu(lieu);
    }

    @Override
    public List<Evenement> getEvenementByType(TypeEvenement typeEvenement) {
        return evenementRepository.findByTypeEvenement(typeEvenement);
    }

    @Override
    public void deleteEvenementById(Integer id) {
        System.out.println("Evenement deleted "+id);

    }

}

