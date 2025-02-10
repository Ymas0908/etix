package com.itcentrex.adapters.entities;

import com.itcentrex.adapters.entities.enumeration.TypeBeneficiaire;
import com.itcentrex.adapters.entities.enumeration.TypeFrais;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class FraisArepartirEntity {
    private ContributeurEntity contributeur;
    private ServiceEntity service;
    private Integer iD;
    private LocalDateTime dateHeureCreation;
    private String libelle;
    private String description;
    private TypeFrais typeFrais;
    private TypeBeneficiaire typeBeneficiaire;

    public FraisArepartirEntity initierUneFraisArepartir() {
        throw new UnsupportedOperationException();
    }

    public void creerUnFraisArepartirParService(FraisArepartirEntity fraisArepartir) {
        throw new UnsupportedOperationException();
    }

    public void modifierUnFraisArepartir(FraisArepartirEntity fraisArepartir) {
        throw new UnsupportedOperationException();
    }
}