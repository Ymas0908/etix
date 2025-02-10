package com.itcentrex.adapters.entities;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MmpEntity {
    private Integer iD;
    private String libelle;
    private String description;
    private String urlLogo;


    public boolean verifierLaValiditeDesInfosSignaletiques(MmpEntity MmpEntity) {
        throw new UnsupportedOperationException();
    }

    public List<MmpEntity> collecterLesMmpEntityParPaysOperation(Integer idPaysOperation) {
        throw new UnsupportedOperationException();
    }

    public List<MmpEntity> collecterLesMmpEntitys() {
        throw new UnsupportedOperationException();
    }

    public MmpEntity creerUneMmpEntity(String libelle, String description, String statutMmpEntity) {
        throw new UnsupportedOperationException();
    }

    public void modifierUneMmpEntity(MmpEntity MmpEntity) {
        throw new UnsupportedOperationException();
    }

    public List<MmpEntity> collecterLesMmpEntitys(String critere) {
        throw new UnsupportedOperationException();
    }

    public void activerUneMmpEntity(Integer idMmpEntity) {
        throw new UnsupportedOperationException();
    }

    public void desactiverUneMmpEntity(Integer idMmpEntity) {
        throw new UnsupportedOperationException();
    }

    public void supprimerUneMmpEntity(Integer idMmpEntity) {
        throw new UnsupportedOperationException();
    }

    public MmpEntity collecterUneMmpEntity(Integer idMmpEntity) {
        throw new UnsupportedOperationException();
    }
}