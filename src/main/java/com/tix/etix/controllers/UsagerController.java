package com.tix.etix.controllers;

import com.tix.etix.models.Evenement;
import com.tix.etix.models.Usager;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("etix/usager/v1")
public class UsagerController {


    @PostMapping("/saveUsager")
    public void saveUsager (@RequestBody Usager usager) {
        System.out.println(usager + "  créé avec succes");
    }
    
    @GetMapping("/getUsagers({idUsager})")
    public ResponseEntity<List<Usager>> getUsagers (@PathVariable("idUsager") String idUsager){
        List<Usager> usagers = new ArrayList<>();
        usagers.add(new Usager("Mamadou", "Diop", "Y2O2y@example.com", 123456789));
        usagers.add(new Usager("Mamadou", "Diop", "Y2O2y@example.com", 123456789));
        usagers.add(new Usager("Mamadou", "Diop", "Y2O2y@example.com", 123456789));
        usagers.add(new Usager("Mamadou", "Diop", "Y2O2y@example.com", 123456789));
        return ResponseEntity.ok(usagers);

    }
}
