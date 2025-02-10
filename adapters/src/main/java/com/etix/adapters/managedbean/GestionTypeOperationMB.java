package com.etix.adapters.managedbean;//package com.itcentrex.adapters.managedbean;
//
//import com.itcentrex.gimuemoa.gimregistra.application.model.CompteComptable;
//import com.itcentrex.gimuemoa.gimregistra.application.model.enumeration.ServiceType;
//import com.itcentrex.gimuemoa.gimregistra.application.service.CompteComptableService;
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
//public class GestionTypeOperationMB {
//    ServiceType serviceType;
//    List<ServiceType> serviceTypes;
//    CompteComptable compteComptable;
//    List<CompteComptable> compteComptables;
//    @Inject
//    private CompteComptableService compteComptableService;
//
//    @PostConstruct
//    public void init() {
//        serviceTypes = new ArrayList<>();
//        serviceTypes.add(ServiceType.AJUSTEMENT_COMPTABLE);
//        serviceTypes.add(ServiceType.REMISE_DE_PAIEMENT);
//        compteComptables = compteComptableService.getCompteComptables();
//        //typeOperationComptable = new TypeOperationComptable();
//        //typeOperationComptables = typeOperationComptableService.getTypeOperationComptables();
//    }
//
//
//}
