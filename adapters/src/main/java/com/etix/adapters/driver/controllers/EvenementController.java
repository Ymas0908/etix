package com.etix.adapters.driver.controllers;

import com.etix.adapters.entities.EvenementEntity;
import com.etix.domain.models.Evenement;
import com.etix.domain.models.enumerations.TypeEvenement;
import com.etix.domain.ports.driver.GererLesEvenements;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("etix/evenements/v1")
public class EvenementController {

    private GererLesEvenements gererLesEvenements;



    @PostMapping("/saveEvenement")
    public ResponseEntity<EvenementEntity> saveEvenement(@RequestBody Evenement evenement) {
        try {
            gererLesEvenements.saveEvenement(evenement);
            System.out.println( evenement + "enregistré avec succès");
            return ResponseEntity.ok().build();
    }
        catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().build();
        }
    }


    @GetMapping("/getEvenementsByLieu")
    public ResponseEntity<List<EvenementEntity>> getEvenementsByLieu( @RequestParam String lieu) {

     try {
    gererLesEvenements.getEvenementsByLieu(lieu);
    return ResponseEntity.ok().build();
       } catch (Exception e) {
    e.printStackTrace();
    return ResponseEntity.badRequest().build();
}
    }



    @GetMapping("/getEvenementsByType")
    public ResponseEntity<List<EvenementEntity>> getEvenementsByType( @RequestParam TypeEvenement type) {

     try {
    gererLesEvenements.getEvenementsByType(type);
    return ResponseEntity.ok().build();
       } catch (Exception e) {
    e.printStackTrace();
    return ResponseEntity.badRequest().build();
}
    }
}




