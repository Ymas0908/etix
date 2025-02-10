package com.etix.adapters.driver.controllers;

import com.etix.domain.models.Evenement;
import com.etix.domain.models.enumerations.TypeEvenement;
import com.etix.domain.models.enumerations.TypeTicket;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("etix/evenements/v1")
public class EvenementController {


    @PostMapping("/saveEvenement")
    public ResponseEntity<String> saveEvenement(@RequestParam String evenement) {
        System.out.println( evenement + "enregistré avec succès");
        return ResponseEntity.ok(evenement);
    }

    @GetMapping("/getEvenementsByDate")
    public ResponseEntity<List<Evenement>> getEvenementsByDate(@RequestParam("date") LocalDateTime dateEvenement) {
        List<Evenement> evenements = new ArrayList<>();
        return ResponseEntity.ok(evenements);
    }


    @GetMapping("/getEvenementsByLieu/{lieu}")
    public ResponseEntity<Evenement> getEvenementsByLieu (@PathVariable("lieu") String lieu){
        Evenement evenement = new Evenement();
        evenement.setLieu(lieu);
        return ResponseEntity.ok(evenement);

    }

    @GetMapping("/getByType")
    public ResponseEntity<List<Evenement>> getEvenementsByType(@RequestParam("type") TypeEvenement type) {
        List<Evenement> evenements = new ArrayList<>();
        return ResponseEntity.ok(evenements);
    }

    @GetMapping("/getEvenements/{idEvenement}")
    public ResponseEntity<List<Evenement>> getEvenements (@PathVariable("idEvenement") Integer idEvenement){
        List<Evenement> evenements = new ArrayList<>();
        return ResponseEntity.ok(evenements);
    }

    @GetMapping("/getEvenementsByLibelle/{libelle}")
    public ResponseEntity<List<Evenement>> getEvenementsByLibelle (@PathVariable("libelle") String libelle){
        List<Evenement> evenement = new ArrayList<>();



        return ResponseEntity.ok(evenement);
    }
}