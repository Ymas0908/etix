package com.etix.domain.models;

public class Usager {
    private Integer id;
    private String nom;
    private String prenom;
    private String email;

    private Usager(Builder builder) {
        setId(builder.id);
        setNom(builder.nom);
        setPrenom(builder.prenom);
        setEmail(builder.email);
    }

    public Usager() {
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static final class Builder {
        private Integer id;
        private String nom;
        private String prenom;
        private String email;

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

        public Builder prenom(String val) {
            prenom = val;
            return this;
        }

        public Builder email(String val) {
            email = val;
            return this;
        }

        public Usager build() {
            return new Usager(this);
        }
    }
}
