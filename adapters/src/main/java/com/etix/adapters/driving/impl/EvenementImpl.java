package com.etix.adapters.driving.impl;

import com.etix.adapters.driving.repositories.EvenementRepository;
import com.etix.adapters.entities.EvenementEntity;
import com.etix.domain.exceptions.EntityNotExistsException;
import com.etix.domain.models.Evenement;
import com.etix.domain.models.enumerations.TypeEvenement;
import com.etix.domain.ports.driving.GestionEvenement;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
@Component
public class EvenementImpl implements GestionEvenement {
    private final EvenementRepository evenementRepository;

    public EvenementImpl(EvenementRepository evenementRepository) {
        this.evenementRepository = evenementRepository;
    }

    @Override
    public Evenement saveEvenement(Evenement evenement) {
        return evenementRepository.save(EvenementEntity.toEntity(evenement)).toDomain();
    }

    @Override
    public Evenement getEvenementById(Integer id) {
        return evenementRepository.findById(id)
                .orElseThrow( ()-> new EntityNotExistsException("Evenement non trouvé"))
                .toDomain();
    }

    @Override
    public List<Evenement> getAllEvenements() {
        return evenementRepository.findAll()
                .stream()
                .map(EvenementEntity::toDomain)
                .toList();
    }

    @Override
    public List<Evenement> getEvenementsByLieu(String lieu) {
        return evenementRepository.findByLieu(lieu)
                .stream()
                .map(EvenementEntity::toDomain)
                .toList();
    }

    @Override
    public List<Evenement> getEvenementsByType(TypeEvenement typeEvenement) {
        return evenementRepository.findByType(typeEvenement).
                stream().map(EvenementEntity::toDomain)
                .toList();
    }

    @Override
    public List<Evenement> getEvenementsByDate(LocalDateTime date) {
        return evenementRepository.findByDate(date).
                stream().map(EvenementEntity::toDomain)
                .toList();
    }
}
