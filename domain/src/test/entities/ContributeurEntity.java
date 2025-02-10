package com.itcentrex.adapters.entities;


import com.itcentrex.adapters.entities.enumeration.ProfilContributeur;
import com.itcentrex.adapters.entities.enumeration.TypeContributeur;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ContributeurEntity {

    private Integer iD;
    private String identifiantFiscal;
    private String identifiantSocial;
    private String referenceAgrement;
    private String raisonSociale;
    private String descriptionActivites;
    private String contactTelephonique;
    private String contactElectronique;
    private String emetteurAgrement;
    private String adresseGeographique;
    private String adressePostale;
    private String nomDirigeant;
    private String fonctionDirigeant;
    private String courrielDirigeant;
    private String mobileDirigeant;
    private String urlLogo;
    private ProfilContributeur profilContributeur;
    private TypeContributeur typeContributeur;

    public String collecterUnTypeDeContributeur(String typeContributeur) {
        throw new UnsupportedOperationException();
    }

    public ContributeurEntity creerUnContributeur(ContributeurEntity contributeur, String statutDeContributeur) {
        throw new UnsupportedOperationException();
    }

    public void changerLeStatutDuContributeur(Integer idContributeur, String statutContributeur) {
        throw new UnsupportedOperationException();
    }

    public String genererUrlDeValidationDeInscription(Integer idContributeur) {
        throw new UnsupportedOperationException();
    }

    public void activerLeContributeur(Integer idContributeur) {
        throw new UnsupportedOperationException();
    }

    public void desactiverUnContributeur(Integer idContributeur) {
        throw new UnsupportedOperationException();
    }

    public void desinscrireLeContributeur(Integer idContributeur) {
        throw new UnsupportedOperationException();
    }

    public List<ContributeurEntity> rechercherLesContributeursParStatut(String statutContributeur) {
        throw new UnsupportedOperationException();
    }

    public void autoriserLaDesinscriptionDuContributeur(Integer idContributeur, String statutContributeur) {
        throw new UnsupportedOperationException();
    }

    public void rejeterLaDesinscriptionDuContributeur(Integer idContributeur, String statutContributeur) {
        throw new UnsupportedOperationException();
    }

    public List<ContributeurEntity> collecterLesContributeursParMmp(Integer idMmp) {
        throw new UnsupportedOperationException();
    }

    public List<ContributeurEntity> collecterLesContributeursAautoriser(Integer idContributeurPromoteur) {
        throw new UnsupportedOperationException();
    }

    public List<ContributeurEntity> collecterLesContributeurs(String critere) {
        throw new UnsupportedOperationException();
    }

    public void changerLeStatutDuContributeur(Integer idContributeur) {
        throw new UnsupportedOperationException();
    }

    public ContributeurEntity collecterUnContributeur(Integer idContributeur) {
        throw new UnsupportedOperationException();
    }
}