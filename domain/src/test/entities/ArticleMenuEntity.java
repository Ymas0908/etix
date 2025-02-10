package com.itcentrex.adapters.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class ArticleMenuEntity {

    private Integer id;
    private String code;
    private String libelle;
    private String description;
    private Double prix;
    private String urlImage;
    private Integer idContributeurRestaurateur;

}
