package com.tix.etix.models;

import com.tix.etix.models.enumeration.TypeEvenement;
import com.tix.etix.models.enumeration.TypeTicket;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Evenement {
    @Id
    private Integer idEvenement;
private String urlImage;
    private String libelle;
    private String description;
    private LocalDate dateEvenement;
    private TypeEvenement typeEvenement;
    private String lieu;
    private String promotteur;
    private TypeTicket typeTicket;

    public Evenement() {

    }
     public Evenement ( int idEvenement,String urlImage, String libelle, String description, LocalDate dateEvenement, TypeEvenement typeEvenement, String lieu, String promotteur, TypeTicket typeTicket) {
        this.idEvenement = idEvenement;
        this.urlImage = urlImage;
        this.libelle = libelle;
        this.dateEvenement = dateEvenement;
        this.typeEvenement = typeEvenement;
        this.lieu = lieu;
        this.promotteur = promotteur;
        this.typeTicket = typeTicket;

    }


    public TypeTicket getTypeTicket() {
        return typeTicket;
    }
    public void setTypeTicket(TypeTicket typeTicket) {
        this.typeTicket = typeTicket;
    }

    public Integer getIdEvenement() {
        return idEvenement;
    }

    public void setIdEvenement(Integer idEvenement) {
        this.idEvenement = idEvenement;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
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

    public LocalDate getDateEvenement() {
        return dateEvenement;
    }

    public void setDateEvenement(LocalDate dateEvenement) {
        this.dateEvenement = dateEvenement;
    }

    public TypeEvenement getTypeEvenement() {
        return typeEvenement;
    }

    public void setTypeEvenement(TypeEvenement typeEvenement) {
        this.typeEvenement = typeEvenement;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getPromotteur() {
        return promotteur;
    }

    public void setPromotteur(String promotteur) {
        this.promotteur = promotteur;
    }


}
