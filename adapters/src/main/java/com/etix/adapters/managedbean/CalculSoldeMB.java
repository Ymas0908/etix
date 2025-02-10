package com.etix.adapters.managedbean;/*
package com.itcentrex.adapters.managedbean;

import com.itcentrex.gimuemoa.gimregistra.application.model.DetailsComission;
import com.itcentrex.gimuemoa.gimregistra.application.model.Transaction;
import com.itcentrex.gimuemoa.gimregistra.application.model.Transaction0;
import com.itcentrex.gimuemoa.gimregistra.application.model.enumeration.StatutPaiement;
import com.itcentrex.gimuemoa.gimregistra.application.model.enumeration.StatutTransaction;
import com.itcentrex.gimuemoa.gimregistra.application.notification.FlashMessage;
import com.itcentrex.gimuemoa.gimregistra.application.service.CalculSoldeService;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;
import org.primefaces.PrimeFaces;

import java.util.Date;
import java.util.List;

@Named
@ViewScoped
public class CalculSoldeMB {
    @Getter
    @Setter
    private List<Transaction0> transactionsList;
    @Getter
    @Setter
    private List<DetailsComission> commissions;
    @Getter
    @Setter
    private Transaction0 transaction;
    @Getter
    @Setter
    private DetailsComission detailsComission;
    @Getter
    @Setter
    private List<StatutTransaction> ListstatutTransactions = StatutTransaction.listStatuts();
    @Getter
    @Setter
    private List<StatutPaiement> ListstatutPaiements = StatutPaiement.statutPaiementList();

    @Getter
    @Setter
    private StatutPaiement statutPaiement;

    @Getter
    @Setter
    private StatutTransaction statutTransaction;
    @Getter
    @Setter
    private Date dateDebut;
    @Getter
    @Setter
    private Date dateFin;
    @Inject
    @Getter
    @Setter
    private CalculSoldeService calculSoldeService;

    @PostConstruct
    public void init() {
        ListstatutTransactions = List.of(StatutTransaction.values());
        transactionsList = calculSoldeService.getTransactions();
    }


    public void showDetailCommission() {
        PrimeFaces.current().ajax().update("detailCommissionEditForm");
        PrimeFaces.current().executeScript("PF('editDetailCommissionSidebar').show()");
    }

    public void showDetailTransaction() {
        PrimeFaces.current().ajax().update("transactionEditForm");
        PrimeFaces.current().executeScript("PF('editTransactionSidebar').show()");
    }

//    public void calculerSolde() {
//        sommeDetailCommissions = 0; // Réinitialiser la somme
//
//        try {
//            if (commissions != null && !commissions.isEmpty()) {
//                for (DetailsComission detailsComission : commissions) {
//                    Double montant = detailsComission.getMontant(); // Récupérer le montant
//                    if (montant != null) {
//                        sommeDetailCommissions += montant;
//                    }
//                }
//                PrimeFaces.current().ajax().update("histoTableForm");
//                FlashMessage.flash(FlashMessage.INFO, "Succès !", "Historique de solde calculé avec succès.");
//                System.out.println("Calcul terminé. Montant total : " + sommeDetailCommissions);
//            } else {
//                System.out.println("La liste des commissions est vide ou nulle.");
//            }
//        } catch (Exception e) {
//            System.err.println("Une erreur est survenue lors du calcul du solde : " + e.getMessage());
//            e.printStackTrace(); // Facultatif : Affiche la pile d'exécution pour le débogage
//        }
//    }


    public void getDetailsComission() {
        commissions = calculSoldeService.getCommissions();
    }

}
*/
