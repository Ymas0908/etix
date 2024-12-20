package com.tix.etix.models;

import com.tix.etix.models.enumeration.TypeEvenement;
import com.tix.etix.models.enumeration.TypeTicket;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

@Entity
public class Tickets {
    @Id
    private Integer id;
    private String reference;
    private String libelle;
    private String description;
    private Double prix;
    private TypeTicket typeTicket;
    private Integer quantite;
    private Integer idUsager;
    @JoinColumn
    @ManyToOne
    private Evenement evenement;

    public Tickets( String reference,Evenement evenement, String libelle, String description, Double prix,TypeTicket typeTicket, Integer quantite , Integer idUsager) {
        this.reference = reference;
        this.libelle = libelle;
        this.description = description;
        this.prix = prix;
        this.quantite = quantite;
        this.idUsager = idUsager;
        this.typeTicket = typeTicket;
        this.evenement = evenement;

    }
    public Tickets() {

    }

    public TypeTicket getTypeTicket() {
        return typeTicket;
    }
    public void setTypeTicket(TypeTicket typeTicket) {
        this.typeTicket = typeTicket;
    }

    public Evenement getEvenement() {
        return evenement;
    }
    public void setEvenement(Evenement evenement) {
        this.evenement = evenement;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getReference() {
        return reference;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }
    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Double getPrix() {
        return prix;
    }
    public void setPrix(Double prix) {
        this.prix = prix;
    }
    public Integer getQuantite() {
        return quantite;
    }
    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public Integer getIdUsager() {
        return idUsager;
    }

    public void setIdUsager(Integer idUsager) {
        this.idUsager = idUsager;
    }
}
