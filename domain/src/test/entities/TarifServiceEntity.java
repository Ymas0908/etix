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
public class TarifServiceEntity {
    private ServiceEntity service;
    private Integer iD;
    private LocalDateTime dateHeureCreation;
    private Double montantForfait;
    private Float pourcentageForfait;
    private String typeTarif;
    private String statutService;

    public TarifServiceEntity initierUnTarifDeService() {
        throw new UnsupportedOperationException();
    }

    public TarifServiceEntity creerUnTarifDeService(TarifServiceEntity tarifService) {
        throw new UnsupportedOperationException();
    }

    public void annulerUnTarifDeService(TarifServiceEntity tarifService) {
        throw new UnsupportedOperationException();
    }

    public List<TarifServiceEntity> collecterLesTarifsDeServicesParService(Integer idService) {
        throw new UnsupportedOperationException();
    }

    public void modifierUnTarifDeService(TarifServiceEntity tarifDeService) {
        throw new UnsupportedOperationException();
    }

    public TarifServiceEntity collecterUnTarifDeService(TarifServiceEntity idTarifService) {
        throw new UnsupportedOperationException();
    }
}