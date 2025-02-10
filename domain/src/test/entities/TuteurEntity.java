package com.itcentrex.adapters.entities;

import com.itcentrex.adapters.entities.enumeration.Statut;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class TuteurEntity {

    private Integer id;
    private LocalDateTime dateHeureCreation;
    private Integer idUsagerTuteur;
    private Integer idUsagerSousTutelle;
    private Statut statut;
}
