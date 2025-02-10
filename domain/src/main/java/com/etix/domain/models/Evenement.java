package com.etix.domain.models;

import com.etix.domain.models.enumerations.TypeEvenement;

import java.time.LocalDateTime;

public class Evenement {

    private Integer id;
    private String nom;
    private String lieu;

    private LocalDateTime date;

    private TypeEvenement typeEvenement;

    public Evenement(Integer id, String nom, String lieu, LocalDateTime date, TypeEvenement typeEvenement) {
        this.id = id;
        this.nom = nom;
        this.lieu = lieu;
        this.date = date;
        this.typeEvenement = typeEvenement;
    }
    public Evenement() {

    }

    private Evenement(Builder builder) {
        setId(builder.id);
        setNom(builder.nom);
        setLieu(builder.lieu);
        setDate(builder.date);
        setTypeEvenement(builder.typeEvenement);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public TypeEvenement getTypeEvenement() {
        return typeEvenement;
    }

    public void setTypeEvenement(TypeEvenement typeEvenement) {
        this.typeEvenement = typeEvenement;
    }

    public static final class Builder {
        private Integer id;
        private String nom;
        private String lieu;
        private LocalDateTime date;
        private TypeEvenement typeEvenement;

        public Builder() {
        }

        public Builder id(Integer val) {
            id = val;
            return this;
        }

        public Builder nom(String val) {
            nom = val;
            return this;
        }

        public Builder lieu(String val) {
            lieu = val;
            return this;
        }

        public Builder date(LocalDateTime val) {
            date = val;
            return this;
        }

        public Builder typeEvenement(TypeEvenement val) {
            typeEvenement = val;
            return this;
        }

        public Evenement build() {
            return new Evenement(this);
        }
    }
}
