package com.etix.adapters.managedbean;//package com.itcentrex.adapters.managedbean;
//
//import com.itcentrex.gimuemoa.gimregistra.application.model.Contributeur;
//import com.itcentrex.gimuemoa.gimregistra.application.service.ContributeurService;
//import jakarta.annotation.PostConstruct;
//import jakarta.faces.view.ViewScoped;
//import jakarta.inject.Inject;
//import jakarta.inject.Named;
//import lombok.Getter;
//import lombok.Setter;
//import org.primefaces.PrimeFaces;
//import org.primefaces.extensions.component.switchcase.Switch;
//
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.List;
//
//@Named
//@Setter
//@Getter
//@ViewScoped
//public class ContributeurMB implements Serializable {
//    private Contributeur contributeurSelected;
//    private List<Contributeur> contributeurs = new ArrayList<>();
//    boolean contributeurIsSelected;
//    @Inject
//    private ContributeurService contributeurService;
//
//    private String option;
//
//    @PostConstruct
//    public void init() {
//        contributeurs = contributeurService.findAllContributeurs();
//
//    }
//
//    public void prInteger() {
//        System.out.prIntegerln(option);
//        PrimeFaces.current().ajax().update("donneeForm");
//    }
//
//}
