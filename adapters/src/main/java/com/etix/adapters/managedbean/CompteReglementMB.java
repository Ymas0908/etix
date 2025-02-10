package com.etix.adapters.managedbean;//package com.itcentrex.adapters.managedbean;
//
//import com.itcentrex.gimuemoa.gimregistra.application.model.Contributeur;
//import com.itcentrex.gimuemoa.gimregistra.application.model.HistoriqueSolde;
//import com.itcentrex.gimuemoa.gimregistra.application.model.OrdreReglement;
//import com.itcentrex.gimuemoa.gimregistra.application.model.enumeration.StatutOrdreReglement;
//import com.itcentrex.gimuemoa.gimregistra.application.service.OrdreReglementService;
//import jakarta.annotation.PostConstruct;
//import jakarta.faces.view.ViewScoped;
//import jakarta.inject.Inject;
//import jakarta.inject.Named;
//import lombok.Getter;
//import lombok.Setter;
//
//import java.io.Serializable;
//import java.util.List;
//
//@Named
//@ViewScoped
//@Getter
//@Setter
//public class CompteReglementMB implements Serializable {
//    private List<OrdreReglement> ordreReglements;
//    private List<HistoriqueSolde> historiqueSoldes;
//    private List<Contributeur> contributeurs;
//    private OrdreReglement ordreReglement;
//    private String[] selectedStatut;
//    private List<StatutOrdreReglement> statutOrdreReglements;
//
//    @Inject
//    private OrdreReglementService ordreReglementService;
//
//
//    @PostConstruct
//    public void init() {
//        ordreReglements = ordreReglementService.getOrdreReglements();
//        historiqueSoldes = ordreReglementService.getHistoriqueSoldes();
//        contributeurs = ordreReglementService.getContributeurs();
//        ordreReglement = new OrdreReglement();
//        statutOrdreReglements = StatutOrdreReglement.statutOrdreReglements();
//    }
//
//    public String redirectGenerateOrder() {
//        return "/gestion-compte-reglement/init-ordre-reglement?faces-redirect=true";
//    }
//
//    public OrdreReglement getOrdreReglement() {
//        return ordreReglementService.getOrdreReglement();
//    }
//
//
//}
