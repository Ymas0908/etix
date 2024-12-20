package com.tix.etix.models;

import com.tix.etix.models.enumeration.TypeEvenement;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Evenement {
    @Id
    private Integer idEvenement;
private String urlImage;
    private String libelle;
    private LocalDate dateEvenement;
    private TypeEvenement typeEvenement;
    private String lieu;
    private String promotteur;

    public Evenement() {

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

    public Evenement(Integer idEvenement, String urlImage, String libelle, LocalDate dateEvenement, TypeEvenement typeEvenement, String lieu, String promotteur) {
        this.idEvenement = idEvenement;
        this.urlImage = urlImage;
        this.libelle = libelle;
        this.dateEvenement = dateEvenement;
        this.typeEvenement = typeEvenement;
        this.lieu = lieu;
        this.promotteur = promotteur;
    }
}
