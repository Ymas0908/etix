package com.itcentrex.adapters.entities;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class PosteComptableEntity {

    private Integer id;
    private String libelle;
    private String description;
    private Integer idContributeur;
    private LocalDateTime dateHeureCreation;

}
