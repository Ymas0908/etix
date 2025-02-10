package com.etix.adapters.managedbean;//package com.itcentrex.adapters.managedbean;
//
//import com.itcentrex.gimuemoa.gimregistra.application.model.CompteComptable;
//import com.itcentrex.gimuemoa.gimregistra.application.service.CompteComptableService;
//import jakarta.annotation.PostConstruct;
//import jakarta.faces.view.ViewScoped;
//import jakarta.inject.Inject;
//import jakarta.inject.Named;
//import lombok.Getter;
//import lombok.Setter;
//
//import java.util.List;
//
//@Named
//@ViewScoped
//@Getter
//@Setter
//public class CompteComptableMB {
//
//    CompteComptable compteComptable;
//    List<CompteComptable> compteComptables;
//
//    @Inject
//    CompteComptableService compteComptableService;
//
//    @PostConstruct
//    public void init() {
//        compteComptable = new CompteComptable();
//        compteComptables = compteComptableService.getCompteComptables();
//    }
//}
