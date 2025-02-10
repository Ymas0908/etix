package com.itcentrex.adapters.entities;

import com.itcentrex.adapters.entities.enumeration.TypeAssurance;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class ContratAssuranceEntity {

    private Integer id;
    private String numeroContrat;
    private Integer idUsager;
    private Integer idContributeur;
    private LocalDateTime dateHeureCreation;
    private Integer idPoliceAssurance;
    private Double montantPrime;
    private Double montantCapital;
    private Double montantCotisation;
    private TypeAssurance typeAssurance;
}
