package com.etix.adapters.driver.facades;

import com.etix.adapters.entities.EvenementEntity;
import com.etix.domain.models.enumerations.TypeEvenement;
import com.etix.domain.ports.driver.GererLesEvenements;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
@AllArgsConstructor
@Component
public class EvenementFacade {

    private GererLesEvenements gererLesEvenements;





    public EvenementEntity saveEvenement(EvenementEntity evenement) {
        return EvenementEntity.toEntity(gererLesEvenements.saveEvenement(evenement.toDomain()));
    }
     public List<EvenementEntity> getEvenementsByDate() {

         return gererLesEvenements.getEvenementsByDate(LocalDateTime.now())
                 .stream()
                 .map(EvenementEntity::toEntity).
                 toList();
     }


     public  List<EvenementEntity> getEvenementsByLieu(String lieu) {
         return gererLesEvenements.getEvenementsByLieu(lieu)
                 .stream()
                 .map(EvenementEntity::toEntity).
                 toList();
     }


     public List<EvenementEntity> getEvenementsByType(TypeEvenement type) {
         return gererLesEvenements.getEvenementsByType(type)
                 .stream()
                 .map(EvenementEntity::toEntity).
                 toList();
     }

}
