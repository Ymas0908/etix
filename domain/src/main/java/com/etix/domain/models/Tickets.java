package com.etix.domain.models;


public class Tickets {

    private Integer id;
    private String reference;
    private String libelle;
    private String description ;

    private Double prix;
    private Integer quantite;


    public Tickets(Integer id, String reference, String libelle, String description, Double prix, Integer quantite) {
        this.id = id;
        this.reference = reference;
        this.libelle = libelle;
        this.description = description;
        this.prix = prix;
        this.quantite = quantite;
    }

    private Tickets(Builder builder) {
        id = builder.id;
        reference = builder.reference;
        libelle = builder.libelle;
        description = builder.description;
        prix = builder.prix;
        quantite = builder.quantite;
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

    public static final class Builder {
        private Integer id;
        private String reference;
        private String libelle;
        private String description;
        private Double prix;
        private Integer quantite;

        public Builder() {
        }

        public Builder id(Integer val) {
            id = val;
            return this;
        }

        public Builder reference(String val) {
            reference = val;
            return this;
        }

        public Builder libelle(String val) {
            libelle = val;
            return this;
        }

        public Builder description(String val) {
            description = val;
            return this;
        }

        public Builder prix(Double val) {
            prix = val;
            return this;
        }

        public Builder quantite(Integer val) {
            quantite = val;
            return this;
        }

        public Tickets build() {
            return new Tickets(this);
        }
    }
}
