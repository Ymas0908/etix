package com.tix.etix.controllers;

import com.tix.etix.models.Evenement;
import com.tix.etix.models.enumeration.TypeEvenement;
import com.tix.etix.models.enumeration.TypeTicket;
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
        evenements.add(new Evenement(1,"https://cdn.tikerama.com/images/tiGAhOgXlvHv3ongFL3pEmQ0vxMnSoNOslRjk39T.jpg","Concert de Himra", "",LocalDate.of(2024, 12, 26), TypeEvenement.CONCERT,"Parc des expositions","Moov Africa",TypeTicket.VIP));
        evenements.add(new Evenement(1,"https://cdn.tikerama.com/images/tiGAhOgXlvHv3ongFL3pEmQ0vxMnSoNOslRjk39T.jpg","Concert de Himra", "",LocalDate.of(2024, 12, 26), TypeEvenement.CONCERT,"Parc des expositions","Moov Africa",TypeTicket.VIP));
        return ResponseEntity.ok(evenements);
    }


    @GetMapping("/getEvenementsByLieu/{idLieu}")
    public ResponseEntity<Evenement> getEvenementsByLieu (@PathVariable("lieu") String lieu){

        return ResponseEntity.ok(new Evenement(1,"https://cdn.tikerama.com/images/tiGAhOgXlvHv3ongFL3pEmQ0vxMnSoNOslRjk39T.jpg","Concert de Himra", "",LocalDate.of(2024, 12, 26), TypeEvenement.CONCERT,"Parc des expositions","Moov Africa",TypeTicket.VIP));
    }

    @GetMapping("/getByType/{type}")
    public ResponseEntity<List<Evenement>> getEvenementsByType(@PathVariable("type") TypeEvenement type) {
        List<Evenement> evenements = new ArrayList<>();
        evenements.add(new Evenement(1,"https://cdn.tikerama.com/images/tiGAhOgXlvHv3ongFL3pEmQ0vxMnSoNOslRjk39T.jpg","Concert de Himra", "",LocalDate.of(2024, 12, 26), TypeEvenement.CONCERT,"Parc des expositions","Moov Africa",TypeTicket.VIP));
        return ResponseEntity.ok(evenements);
    }

    @GetMapping("/getEvenements/{idEvenement}")
    public ResponseEntity<List<Evenement>> getEvenements (@PathVariable("idEvenement") Integer idEvenement){
        List<Evenement> evenements = new ArrayList<>();
        evenements.add(new Evenement(1,"https://cdn.tikerama.com/images/tiGAhOgXlvHv3ongFL3pEmQ0vxMnSoNOslRjk39T.jpg","Concert sauvage 2 Himra", "",LocalDate.of(2024, 12, 26), TypeEvenement.CONCERT,"Parc des expositions","Moov Africa",TypeTicket.GP));
        evenements.add(new Evenement(1,"https://cdn.tikerama.com/images/zaGpwn4SsnXSG9YyUVnI0DaSd6N0TnO3baJfVfyh.jpg","Petit Poto","", LocalDate.of(2024, 12, 28), TypeEvenement.PARTY,"Espace Perle Rare Abbata","dgfdf",TypeTicket.VIP));
        evenements.add(new Evenement(1,"https://cdn.tikerama.com/images/bR9yJqITiX4ctm7ixqcCtiVojgcrhTN8npu5Y5rc.jpg","Mother Africa Festival","", LocalDate.of(2024, 12, 28), TypeEvenement.FESTIVAL,"Mother Africa Beach, Abidjan","dgfdf",TypeTicket.VIP));
        evenements.add(new Evenement(1,"https://www.africatopsports.com/wp-content/uploads/2017/11/Cote-divoire-Maroc.jpg","Phase de poule, Civ-Mrc","", LocalDate.of(2024, 12, 26), TypeEvenement.MATCH,"Stade de bouaké","Moov Africa",TypeTicket.GP));
        evenements.add(new Evenement(1,"https://cdn.tikerama.com/images/5Mh8COA8lnoGeTkST5RM57tpf7FUwpTg62kMxWx7.jpg","Bonjour 2025","", LocalDate.of(2025, 01, 04), TypeEvenement.SPECTACLE,"Stade de bouaké","X-Factor Africa",TypeTicket.GP));
        evenements.add(new Evenement(1,"https://baab.ci/wp-content/uploads/2021/08/Festival-Grillades_BAAB.jpg","Festival des grillades","", LocalDate.of(2024, 12, 26), TypeEvenement.FESTIVAL,"Derrière le palais de la culture","Moov Africa",TypeTicket.GP));
        evenements.add(new Evenement(1,"https://cdn.tikerama.com/images/IRegnn7siaDMvfs2xvrn8Ov7qpPlEhPsGDzCGUEG.jpg","3XDAVS en concert","", LocalDate.of(2024, 12, 30), TypeEvenement.CONCERT,"Palais de la culture d'Abidjan","",TypeTicket.GP));
        evenements.add(new Evenement(1,"https://cdn.tikerama.com/images/TKTWBQ8FPX7bJUtcW5ZqNmbphqyhaKoHpIgFeI6E.jpg","Babi Last Night","", LocalDate.of(2024, 12, 31), TypeEvenement.PARTY," Abbatta Hôtel mangrove","",TypeTicket.GP));
        return ResponseEntity.ok(evenements);
    }


    @GetMapping("/getEvenementsByLibelle/{libelle}")
    public ResponseEntity<Evenement> getEvenementsByLibelle (@PathVariable("libelle") String libelle){
        return ResponseEntity.ok(new Evenement(1,"","Ceci est un concert","",LocalDate.of(2024, 12, 26), TypeEvenement.FESTIVAL,"Stade de bouaké","Moov Africa",TypeTicket.GP));
    }
}