package com.itcentrex.adapters.entities;

import com.itcentrex.adapters.entities.enumeration.Statut;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ProgrammeFideliteEntity{

    private Integer id;
    private String libelle;
    private String description;
    private Integer idContributeur;
    private Statut statut;
    private Double fraisSouscription;

}
