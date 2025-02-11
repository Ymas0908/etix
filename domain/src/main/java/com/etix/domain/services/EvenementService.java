package com.etix.domain.services;

import com.etix.domain.ddd.DomaineService;
import com.etix.domain.models.Evenement;
import com.etix.domain.models.Tickets;
import com.etix.domain.models.enumerations.TypeEvenement;
import com.etix.domain.models.enumerations.TypeTicket;
import com.etix.domain.ports.driver.GererLesEvenements;
import com.etix.domain.ports.driver.GererLesTickets;
import com.etix.domain.ports.driving.GestionEvenement;

import java.time.LocalDateTime;
import java.util.List;

 @DomaineService
public class EvenementService implements GererLesEvenements {
    private final GestionEvenement gestionEvenement;

    public EvenementService(GestionEvenement gestionEvenement) {
        this.gestionEvenement = gestionEvenement;
    }

    @Override
    public Evenement saveEvenement(Evenement evenement) {
        return gestionEvenement.saveEvenement(evenement);
    }

    @Override
    public List<Evenement> getAllEvenements() {
        return gestionEvenement.getAllEvenements();
    }

    @Override
    public List<Evenement> getEvenementsByDate(LocalDateTime date) {
        return gestionEvenement.getEvenementsByDate(date);
    }

    @Override
    public List<Evenement> getEvenementsByLieu(String lieu) {
        return gestionEvenement.getEvenementsByLieu(lieu);
    }


    @Override
    public List<Evenement> getEvenementsByType(TypeEvenement type) {
        return gestionEvenement.getEvenementsByType(type);
    }





}
