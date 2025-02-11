package com.etix.adapters.driving.repositories;

import com.etix.adapters.entities.EvenementEntity;
import com.etix.domain.models.enumerations.TypeEvenement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
@Repository
public interface EvenementRepository extends JpaRepository<EvenementEntity, Integer> {

@Query("SELECT e FROM EvenementEntity e WHERE e.lieu = :lieu")
List<EvenementEntity> findByLieu(String lieu);


@Query("SELECT e FROM EvenementEntity e WHERE e.typeEvenement = :type")
List<EvenementEntity> findByType(TypeEvenement type);

@Query("SELECT e FROM EvenementEntity e WHERE e.date = :date")
List<EvenementEntity> findByDate(LocalDateTime date);

}
