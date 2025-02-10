package com.itcentrex.adapters.entities;

import com.itcentrex.adapters.entities.enumeration.TypeArticle;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class OffreArticleEntity {

    private Integer id;

    private String dateHeureCreation;
    private Integer idContributeur;
    private Integer idArticle;
    private TypeArticle typeArticle;
    private String libelle;
    private String description;
    private String urlImage;
    private Double prixUnitaire;
    private Boolean optionComptant;
    private Boolean optionReservation;
    private Boolean optionCredit;
    private Integer idContributeurMarchand;
    private Integer quantiteDisponible;
    private Integer pointsFidelite;
}
