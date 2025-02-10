package com.etix.adapters.managedbean;//package com.itcentrex.adapters.managedbean;
//
//import com.itcentrex.gimuemoa.gimregistra.application.model.DetailsComission;
//import com.itcentrex.gimuemoa.gimregistra.application.model.HistoSolde;
//import com.itcentrex.gimuemoa.gimregistra.application.model.enumeration.StatutHistoSolde;
//import com.itcentrex.gimuemoa.gimregistra.application.model.enumeration.StatutTransaction;
//import com.itcentrex.gimuemoa.gimregistra.application.service.CalculSoldeService;
//import com.itcentrex.gimuemoa.gimregistra.application.service.HistoSoldeService;
//import jakarta.annotation.PostConstruct;
//import jakarta.faces.view.ViewScoped;
//import jakarta.inject.Inject;
//import jakarta.inject.Named;
//import lombok.Getter;
//import lombok.Setter;
//import org.primefaces.PrimeFaces;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.Date;
//import java.util.List;
//
//@Named
//@ViewScoped
//public class HistoSoldeMB {
//    @Getter
//    @Setter
//    private List<HistoSolde> histoSoldes;
//    @Getter
//    @Setter
//    private HistoSolde histoSolde;
//    @Getter
//    @Setter
//    private List<StatutHistoSolde> statutHistoSoldes;
//    @Getter
//    @Setter
//    private Date dateDebut;
//    @Getter
//    @Setter
//    private Date dateFin;
//    @Inject
//    @Getter
//    @Setter
//    private HistoSoldeService histoSoldeService;
//
//    @PostConstruct
//    public void init() {
//        histoSoldes = histoSoldeService.getHistoSolde();
//    }
//}
