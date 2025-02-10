package com.itcentrex.adapters.entities;

import com.itcentrex.adapters.entities.enumeration.TypeFrais;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class HistoriqueFraisEntity {
    private FraisArepartirEntity frais_Arepartir;
    private Integer iD;
    private LocalDateTime dateHeureCreation;
    private String libelle;
    private String description;
    private TypeFrais typeFrais;

    public HistoriqueFraisEntity creerUnHistoriqueDeFraisArepartir(Integer idFraisArepartir) {
        throw new UnsupportedOperationException();
    }

    public List<HistoriqueFraisEntity> collecterLesFraisArepartirHistorisesParContributeur(Integer idContributeur) {
        throw new UnsupportedOperationException();
    }

    public void supprimerLesFraisArepartirHistorises(List<HistoriqueFraisEntity> lesHistoriquesFrais) {
        throw new UnsupportedOperationException();
    }
}