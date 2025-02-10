package com.itcentrex.adapters.entities;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MmpParPaysEntity {
    private PaysEntity pays;
    private MmpEntity mmp;
    private Integer iD;

    public List<MmpEntity> collecterLesMmpParPays(Integer idPays) {
        throw new UnsupportedOperationException();
    }

    public void supprimerLesMmpParPays(List<MmpEntity> lesMmps) {
        throw new UnsupportedOperationException();
    }

    public void rattacherLesMmpsSelectionneesAuPays(List<MmpEntity> lesMmps) {
        throw new UnsupportedOperationException();
    }

    public void retirerLesMmpsSelectionneesDuPays(List<MmpEntity> lesMmps) {
        throw new UnsupportedOperationException();
    }

    public void collecterLesMmpsDisponiblesParPaysDeOperation(List<MmpParPaysEntity> lesMmpParPays) {
        throw new UnsupportedOperationException();
    }
}