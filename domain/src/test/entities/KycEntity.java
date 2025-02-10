package com.itcentrex.adapters.entities;


import com.itcentrex.adapters.entities.enumeration.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class KycEntity {
    private Integer id;
    private String reference;
    private LocalDateTime dateHeureCreation;
    private LocalDateTime dateheureDerniereModification;
    private String nom;
    private String prenoms;
    private LocalDate dateNaissance;
    private String lieuNaissance;
    private String paysNaissance;
    private Genre sexe;
    private String profession;
    private String nomEmployeur;
    private String adresseGeographiqueEmployeur;
    private String nomDuPere;
    private String nomDeLaMere;
    private String adressePostale;
    private String adresseGeographique;
    private String adresseEmail;
    private String contactMobile1;
    private String contactMobile2;
    private String nomPrenomConjoint;
    private String contactMobileConjoint;
    private SituationMatrimoniale situationMatrimoniale;
    private StatutKyc statutKyc;
    private String nationalite;
    private TypeKyc typeKyc;
    private StatutVerification statutVerification;
    private PaysEntity pays;

}