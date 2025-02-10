package com.itcentrex.adapters.entities;

import com.itcentrex.adapters.entities.enumeration.StatutAutorisation;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class AutorisationAccesEntity {

    private Integer id;
    private Integer idUsager;
    private Integer idContributeur;
    private LocalDateTime dateHeureCreation;
    private LocalDateTime dateHeureValidation;
    private StatutAutorisation statut;

}
