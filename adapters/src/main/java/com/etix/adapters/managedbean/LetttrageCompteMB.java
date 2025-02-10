package com.etix.adapters.managedbean;//package com.itcentrex.adapters.managedbean;
//
//import com.itcentrex.gimuemoa.gimregistra.application.model.EcritureComptable;
//import com.itcentrex.gimuemoa.gimregistra.application.service.EcritureComptableService;
//import jakarta.annotation.PostConstruct;
//import jakarta.faces.view.ViewScoped;
//import jakarta.inject.Inject;
//import jakarta.inject.Named;
//import lombok.Getter;
//import lombok.Setter;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Named
//@ViewScoped
//@Getter
//@Setter
//public class LetttrageCompteMB {
//    List<EcritureComptable> ecritureComptables;
//    EcritureComptable ecritureComptable;
//
//    @Inject
//    EcritureComptableService ecritureComptableService;
//
//    @PostConstruct
//    public void init() {
//        ecritureComptables = new ArrayList<>();
//        ecritureComptables = ecritureComptableService.getEcritureComptables();
//    }
//}
