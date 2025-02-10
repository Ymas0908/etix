package com.itcentrex.adapters.entities;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class AbonnementEntity {

    private Integer id;
    private String numeroAbonnement;
    private LocalDateTime dateHeureAbonnement;
    private String codeClient;
    private Integer idContributeur;
    private Integer idUsager;

}
