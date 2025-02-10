package com.itcentrex.adapters.entities;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class HistoriqueTarifServiceEntity {
    private TarifServiceEntity tarifService;
    private Integer iD;
    private LocalDateTime dateheureCreation;
    private Double montantForfait;
    private Float pourcentageForfait;

    public List<HistoriqueTarifServiceEntity> collecterLesHistoriquesDeTarifDeServiceParService(Integer idService) {
        throw new UnsupportedOperationException();
    }

    public void historiserUnTarifDeService(TarifServiceEntity tarifDeService) {
        throw new UnsupportedOperationException();
    }

    public List<HistoriqueTarifServiceEntity> collecterLesTarifsDeServicesHistorises(Integer idService) {
        throw new UnsupportedOperationException();
    }

    public void supprimerLesHistoriquesDeTarifsDeService(List<HistoriqueTarifServiceEntity> lesHistoDeTarif) {
        throw new UnsupportedOperationException();
    }
}