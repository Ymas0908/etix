package com.tix.etix.controllers;

import com.tix.etix.models.Evenement;
import com.tix.etix.models.enumeration.TypeEvenement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity<List<Evenement>> getEvenementsByDate(@RequestParam("date")  LocalDateTime dateEvenement) {
        List<Evenement> evenements = new ArrayList<>();
        evenements.add(new Evenement(1,"https://cdn.tikerama.com/images/tiGAhOgXlvHv3ongFL3pEmQ0vxMnSoNOslRjk39T.jpg","Concert de Himra", LocalDate.of(2024, 12, 26), TypeEvenement.CONCERT,"Parc des expositions","Moov Africa"));
        evenements.add(new Evenement(1,"https://cdn.tikerama.com/images/tiGAhOgXlvHv3ongFL3pEmQ0vxMnSoNOslRjk39T.jpg","Concert de Himra", LocalDate.of(2024, 12, 26), TypeEvenement.CONCERT,"Parc des expositions","Moov Africa"));
        return ResponseEntity.ok(evenements);
    }


    @GetMapping("/getEvenementsByLieu/{idLieu}")
    public ResponseEntity<Evenement> getEvenementsByLieu (@PathVariable("lieu") String lieu){

        return ResponseEntity.ok(
                new Evenement(1,"","Ceci est un concert", LocalDate.of(2024, 12, 26), TypeEvenement.CONCERT,"Stade de bouaké","Moov Africa"));
    }

   @GetMapping("/getByType/{type}")
    public ResponseEntity<List<Evenement>> getEvenementsByType(@PathVariable("type") TypeEvenement type) {
        List<Evenement> evenements = new ArrayList<>();
evenements.add(new Evenement(1,"","Ceci est un concert", LocalDate.of(2024, 12, 26), TypeEvenement.CONCERT,"Stade de bouaké","Moov Africa"));
        return ResponseEntity.ok(evenements);
    }

    @GetMapping("/getEvenements/{idEvenement}")
    public ResponseEntity<List<Evenement>> getEvenements (@PathVariable("idEvenement") Integer idEvenement){
        List<Evenement> evenements = new ArrayList<>();
        evenements.add(new Evenement(1,"https://cdn.tikerama.com/images/tiGAhOgXlvHv3ongFL3pEmQ0vxMnSoNOslRjk39T.jpg","Concert de Himra", LocalDate.of(2024, 12, 26), TypeEvenement.CONCERT,"Parc des expositions","Moov Africa"));
       evenements.add(new Evenement(1,"https://www.africatopsports.com/wp-content/uploads/2017/11/Cote-divoire-Maroc.jpg","Phase de poule, Civ-Mrc", LocalDate.of(2024, 12, 26), TypeEvenement.MATCH,"Stade de bouaké","Moov Africa"));
       evenements.add(new Evenement(1,"https://cdn.tikerama.com/images/5Mh8COA8lnoGeTkST5RM57tpf7FUwpTg62kMxWx7.jpg","Bonjour 2025", LocalDate.of(2024, 12, 26), TypeEvenement.SPECTACLE,"Stade de bouaké","X-Factor Africa"));
       evenements.add(new Evenement(1,"https://baab.ci/wp-content/uploads/2021/08/Festival-Grillades_BAAB.jpg","Festival des grillades", LocalDate.of(2024, 12, 26), TypeEvenement.FESTIVAL,"Derrière le palais de la culture","Moov Africa"));
        return ResponseEntity.ok(evenements);
    }


    @GetMapping("/getEvenementsByLibelle/{libelle}")
    public ResponseEntity<Evenement> getEvenementsByLibelle (@PathVariable("libelle") String libelle){
        return ResponseEntity.ok(new Evenement(1,"","Ceci est un concert",LocalDate.of(2024, 12, 26), TypeEvenement.FESTIVAL,"Stade de bouaké","Moov Africa"));
    }
}
