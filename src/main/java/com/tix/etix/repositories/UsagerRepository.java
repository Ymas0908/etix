package com.tix.etix.repositories;

import com.tix.etix.models.Usager;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsagerRepository extends JpaRepository<Usager, Integer> {



    List<Usager> findByNom(String nom);
List<Usager> findByEmail(String email);
    List<Usager> findByTelephone(Integer telephone);

}
