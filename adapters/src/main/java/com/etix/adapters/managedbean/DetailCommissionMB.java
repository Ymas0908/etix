package com.etix.adapters.managedbean;//package com.itcentrex.adapters.managedbean;
//
//import com.itcentrex.gimuemoa.gimregistra.application.model.DetailCommission;
//import com.itcentrex.gimuemoa.gimregistra.application.model.Transaction;
//import com.itcentrex.gimuemoa.gimregistra.application.service.DetailCommissisonService;
//import com.itcentrex.gimuemoa.gimregistra.application.service.TransactionService;
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
//public class DetailCommissionMB {
//    @Getter
//    @Setter
//    private DetailCommission detailCommission;
//    @Getter
//    @Setter
//    private List<DetailCommission> detailCommissions;
//    @Getter
//    @Setter
//    @Inject
//    private DetailCommissisonService detailCommissisonService;
//
//    @PostConstruct
//    public void init() {
//        detailCommissions = detailCommissisonService.getDetailCommissionsItems(5);
//    }
//}
