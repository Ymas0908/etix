package com.itcentrex.adapters.entities;


import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ServiceTypeEntity {

    private Integer iD;
    private String libelle;
    private String description;
    private Integer ageMinimumLimite;
    private String urlLogo;

    public ServiceTypeEntity creerUnServiceType(ServiceTypeEntity serviceType) {
        throw new UnsupportedOperationException();
    }

    public List<ServiceTypeEntity> collecterLesServicesTypesParMmp(Integer idMmp) {
        throw new UnsupportedOperationException();
    }

    public void modifierUnServiceType(ServiceTypeEntity serviceType) {
        throw new UnsupportedOperationException();
    }

    public ServiceTypeEntity collecterUnServiceType(Integer idServiceType) {
        throw new UnsupportedOperationException();
    }

    public void desactiverUnServiceType(Integer idServiceType) {
        throw new UnsupportedOperationException();
    }
}