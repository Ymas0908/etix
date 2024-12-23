package com.tix.etix.repositories;

import com.tix.etix.models.Evenement;
import com.tix.etix.models.enumeration.TypeEvenement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.List;


@Repository
public interface EvenementRepository extends JpaRepository<Evenement, Integer> {
    List<Evenement> findByDateEvenement(LocalDateTime dateEvenement);
    List<Evenement> findByLibelle(String libelle);
    List<Evenement> findByTypeEvenement(TypeEvenement typeEvenement);
    List<Evenement> findByLieu(String lieu);


}
