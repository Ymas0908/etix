package com.etix.adapters.managedbean;//package com.itcentrex.adapters.managedbean;
//
//import com.itcentrex.gimuemoa.gimregistra.application.model.*;
//import com.itcentrex.gimuemoa.gimregistra.application.model.enumeration.FileFormat;
//import com.itcentrex.gimuemoa.gimregistra.application.model.enumeration.StatutTransaction;
//import com.itcentrex.gimuemoa.gimregistra.application.model.enumeration.TypeTransaction;
//import com.itcentrex.gimuemoa.gimregistra.application.service.FinancialOderService;
//import com.itcentrex.gimuemoa.gimregistra.application.service.OperationService;
//import com.itcentrex.gimuemoa.gimregistra.application.service.TransactionService;
//import jakarta.annotation.PostConstruct;
//import jakarta.faces.application.FacesMessage;
//import jakarta.faces.context.FacesContext;
//import jakarta.faces.view.ViewScoped;
//import jakarta.inject.Named;
//import lombok.Getter;
//import lombok.Setter;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.List;
//
//@Named
//@Getter
//@Setter
//@ViewScoped
//public class TransactionMB implements Serializable {
//    private Transaction selectedTransaction;
//    private List<Transaction> selectedTransactions;
//
//    private Transaction transaction;
//    private List<Transaction> transactionExports;
//    private List<Transaction> transactions;
//    @Autowired
//    private TransactionService transactionService;
//
//    private List<FinancialOder> financialOders;
//    @Autowired
//    private FinancialOderService financialOderService;
//    private List<Operation> operations;
//    @Autowired
//    private OperationService operationService;
//
//    private List<StatutTransaction> transactionStatus;
//    private List<TypeTransaction> typeTransactions;
//    private List<Commission> commissions;
//
//    private List<Topic> topics;
//    private List<FileFormat> fichierTypes;
//    private List<Topic> selectedTopic = new ArrayList<>();
//
//    private String exportName;
//
//    @PostConstruct
//    public void init() {
//        transactions = transactionService.getTransactionsItems(8);
//        transactions = transactionService.findAllTransactions();
//        financialOders = financialOderService.getFinancialOder();
//        transactionExports = transactionService.getTransactions().stream().limit(8).toList();
//        transactions = transactionService.getTransactions();
//        operations = operationService.getOperations();
//        transactionStatus = StatutTransaction.listStatuts();
//        commissions = transactionService.getCommissions();
//        topics = transactionService.getTopics();
//        fichierTypes = FileFormat.fichierTypes();
//        typeTransactions = TypeTransaction.listTypeTransactions();
//
//    }
//
//    public boolean finalisee(Transaction transaction) {
//        return StatutTransaction.FINALISEE.equals(transaction.getStatutTransaction());
//    }
//
//    public boolean initier(Transaction transaction) {
//        return StatutTransaction.INITIEE.equals(transaction.getStatutTransaction());
//    }
//
//    public boolean desableBtn() {
//        if (selectedTopic.size() > 3) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public void message() {
//        if (selectedTopic.size() > 3) {
//            showError();
//        }
//    }
//
//    public void addMessage(FacesMessage.Severity severity, String summary, String detail) {
//        FacesContext.getCurrentInstance().
//                addMessage(null, new FacesMessage(severity, summary, detail));
//    }
//
//    public void showError() {
//        addMessage(FacesMessage.SEVERITY_ERROR, "Thèmes Data streaming ", "Désolé vous ne pouvez selectionner que trois (3) élements");
//    }
//}
