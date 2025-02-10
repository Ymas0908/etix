package com.itcentrex.adapters.entities;

import com.itcentrex.adapters.entities.enumeration.TypeArticle;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ArticleEntity {

    private Integer id;
    private String reference;
    private String dateHeureCreation;
    private TypeArticle typeArticle;
    private String libelle;
    private String description;
    private String urlImage;
    private Double prixUnitaire;
    private Boolean optionComptant;
    private Boolean optionReservation;
    private Boolean optionCredit;
    private Integer idContributeurMarchand;
    private Integer quantiteMiniStock;
    private Integer quantiteStock;
    private Integer pointsFidelite;
}

