package com.itcentrex.adapters.entities;

import com.itcentrex.adapters.entities.enumeration.StatutArticlePanier;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ArticlePanierEntity {

    private Integer id;
    private Integer idPanier;
    private String referenceArticle;
    private LocalDateTime dateHeureCreation;
    private Integer quantite;
    private Double prix;
    private Double montant;
    private StatutArticlePanier statutArticlePanier;
    private Integer idContributeur;

}
