package com.etix.adapters.service;//package com.itcentrex.adapters.service;
//
//
//import com.itcentrex.gimuemoa.gimregistra.application.model.Commission;
//import com.itcentrex.gimuemoa.gimregistra.application.model.Topic;
//import com.itcentrex.gimuemoa.gimregistra.application.model.Transaction;
//import com.itcentrex.gimuemoa.gimregistra.application.model.enumeration.CommissionType;
//import com.itcentrex.gimuemoa.gimregistra.application.model.enumeration.StatutTransaction;
//import com.itcentrex.gimuemoa.gimregistra.application.model.enumeration.TypeTransaction;
//import jakarta.annotation.PostConstruct;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDateTime;
//import java.util.*;
//
//
//@Service
//public class TransactionService {
//    List<Commission> commissions = new ArrayList<>();
//    List<Topic> topics = new ArrayList<>();
//
//    private List<Transaction> transactions = new ArrayList<>();
//
//    public List<Transaction> getTransactions() {
//        List<Transaction> transactions = new ArrayList<>();
//        transactions.add(new Transaction(1, LocalDateTime.now(), 7250000.0, 10000.00, 10000.0, "Transaction de dépot", LocalDateTime.now(), "TRAN001", StatutTransaction.INITIEE, TypeTransaction.A2A, "Achat"));
//        transactions.add(new Transaction(2, LocalDateTime.now(), 5220000.0, 10000.00, 10000.0, "Transaction de retrait", LocalDateTime.now(), "TRAN002", StatutTransaction.ANNULEE, TypeTransaction.A2C, "Dépôt"));
//        transactions.add(new Transaction(3, LocalDateTime.now(), 8230000.0, 10000.00, 10000.0, "Transaction de retrait", LocalDateTime.now(), "TRAN003", StatutTransaction.FINALISEE, TypeTransaction.A2C, "Dépôt"));
//        transactions.add(new Transaction(4, LocalDateTime.now(), 4810000.0, 10000.00, 10000.0, "Transaction de dépot", LocalDateTime.now(), "TRAN004", StatutTransaction.SUSPENDUE, TypeTransaction.A2A, "Achat"));
//        transactions.add(new Transaction(5, LocalDateTime.now(), 5570000.0, 10000.00, 10000.0, "Transaction de retrait", LocalDateTime.now(), "TRAN005", StatutTransaction.EN_COURS, TypeTransaction.A2M, "Dépôt"));
//        transactions.add(new Transaction(6, LocalDateTime.now(), 1023000.0, 10000.00, 10000.0, "Transaction de dépot", LocalDateTime.now(), "TRAN006", StatutTransaction.FINALISEE, TypeTransaction.C2C, "Achat"));
//        transactions.add(new Transaction(7, LocalDateTime.now(), 2720000.0, 10000.00, 10000.0, "Transaction de retrait", LocalDateTime.now(), "TRAN007", StatutTransaction.INITIEE, TypeTransaction.M2A, "Achat"));
//        transactions.add(new Transaction(8, LocalDateTime.now(), 2250000.0, 10000.00, 10000.0, "Transaction de dépot", LocalDateTime.now(), "TRAN008", StatutTransaction.FINALISEE, TypeTransaction.R2R, "Dépôt"));
//
//        return transactions;
//    }
//
//    public List<Transaction> findAllTransactions() {
//        List<Transaction> transactions = new ArrayList<>();
//        List<String> libelleTransactions = Arrays.asList("Achat biscuit", "Vente de ciment", "Vente de carburant", "Achat de pizza", "Achat de mate", "Achat de poulet", "Achat de tomate", "Vente de fromage", "Location de chaussure", "Vente de chaussure");
//        libelleTransactions.forEach(libelleTransaction -> {
//            Transaction transaction = new Transaction();
//            transaction.setReference(UUID.randomUUID().toString().substring(0, 6));
//            transaction.setDateCreation(LocalDateTime.now());
//            transaction.setLibelleTransaction(libelleTransaction);
//            transaction.setMontantTotalTransaction((Double) (transaction.getTransactionId()*500000));
//            transaction.setMontantNominal(400 * Math.random());
//            transaction.setMontantFrais(100 * Math.random());
//            transaction.setDateHeureDerniereMajStatut(LocalDateTime.now());
//            transaction.setStatutTransaction(StatutTransaction.values()[(Integer) (Math.random())]);
//            transaction.setTypeTransaction(TypeTransaction.values()[(Integer) (Math.random())]);
//            transactions.add(transaction);
//        });
//        return transactions;
//    }
//
//    @PostConstruct
//    public void init() {
//        transactions.add(new Transaction(1, LocalDateTime.now(), 7500000.00, 4500000.00, StatutTransaction.FINALISEE, TypeTransaction.A2M, "Achat"));
//        transactions.add(new Transaction(1, LocalDateTime.now(), 7500000.00, 4500000.00, StatutTransaction.FINALISEE, TypeTransaction.A2M, "Achat"));
//        transactions.add(new Transaction(1, LocalDateTime.now(), 7500000.00, 4500000.00, StatutTransaction.FINALISEE, TypeTransaction.A2M, "Achat"));
//        transactions.add(new Transaction(1, LocalDateTime.now(), 7500000.00, 4500000.00, StatutTransaction.FINALISEE, TypeTransaction.A2M, "Achat"));
//        transactions.add(new Transaction(1, LocalDateTime.now(), 7500000.00, 4500000.00, StatutTransaction.FINALISEE, TypeTransaction.A2M, "Achat"));
//        transactions.add(new Transaction(1, LocalDateTime.now(), 7500000.00, 4500000.00, StatutTransaction.FINALISEE, TypeTransaction.A2M, "Achat"));
//        transactions.add(new Transaction(1, LocalDateTime.now(), 7500000.00, 4500000.00, StatutTransaction.FINALISEE, TypeTransaction.A2M, "Achat"));
//        transactions.add(new Transaction(1, LocalDateTime.now(), 7500000.00, 4500000.00, StatutTransaction.FINALISEE, TypeTransaction.A2M, "Achat"));
//        transactions.add(new Transaction(1, LocalDateTime.now(), 7500000.00, 4500000.00, StatutTransaction.FINALISEE, TypeTransaction.A2M, "Achat"));
//        transactions.add(new Transaction(1, LocalDateTime.now(), 7500000.00, 4500000.00, StatutTransaction.FINALISEE, TypeTransaction.A2M, "Achat"));
//        transactions.add(new Transaction(1, LocalDateTime.now(), 7500000.00, 4500000.00, StatutTransaction.FINALISEE, TypeTransaction.A2M, "Achat"));
//        transactions.add(new Transaction(1, LocalDateTime.now(), 7500000.00, 4500000.00, StatutTransaction.FINALISEE, TypeTransaction.A2M, "Achat"));
//        transactions.add(new Transaction(1, LocalDateTime.now(), 7500000.00, 4500000.00, StatutTransaction.FINALISEE, TypeTransaction.A2M, "Achat"));
//    }
//
//    public List<Transaction> getTransactionsItems(Integer size) {
//        if (size > transactions.size()) {
//            Random rand = new Random();
//            List<Transaction> randomList = new ArrayList<>();
//            for (Integer i = 0; i < size; i++) {
//                Integer randomIndex = rand.nextInt(transactions.size());
//                randomList.add(transactions.get(randomIndex));
//            }
//            return randomList;
//        } else {
//            return new ArrayList<>(transactions.subList(0, size));
//        }
//    }
//
//    public List<Topic> getTopics() {
//        topics.add(new Topic("transfert01", "transfert marchant d'achat de produits"));
//        topics.add(new Topic("transfert01", "transfert marchant d'achat de produits"));
//        topics.add(new Topic("transfert01", "transfert marchant d'achat de produits"));
//        topics.add(new Topic("transfert01", "transfert marchant d'achat de produits"));
//        topics.add(new Topic("transfert02", "transfert marchant d'achat de produits"));
//        topics.add(new Topic("transfert02", "transfert marchant d'achat de produits"));
//        topics.add(new Topic("transfert02", "transfert marchant d'achat de produits"));
//        topics.add(new Topic("transfert02", "transfert marchant d'achat de produits"));
//        topics.add(new Topic("transfert02", "transfert marchant d'achat de produits"));
//        return topics;
//    }
//
//    public List<Commission> getCommissions() {
//
//        commissions.add(new Commission("Commission 1", 250000.0, CommissionType.FIXE, "BCEAO", "BNI"));
//        commissions.add(new Commission("Commission 2", 750000.0, CommissionType.VARIABLE, "BNI", "BCEAO"));
//        commissions.add(new Commission("Commission 3", 50000.0, CommissionType.VARIABLE, "BNI", "BNI"));
//        commissions.add(new Commission("Commission 4", 10000.0, CommissionType.FIXE, "BCEAO", "BCEAO"));
//        return commissions;
//    }
//
//}
