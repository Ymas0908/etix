package com.tix.etix.models;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Usager {
    @Id
    private Integer id;
    private String nom;
    private String prenom;
    private String email;
    private Integer telephone;

    public Usager( String nom, String prenom, String email, Integer telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;

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

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }
}
