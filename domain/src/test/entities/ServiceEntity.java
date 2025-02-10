package com.itcentrex.adapters.entities;


import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ServiceEntity {
    private ServiceTypeEntity serviceType;
    private Integer iD;
    private String libelle;
    private String description;

    public List<ServiceEntity> collecterLesServicesRattachesAlaMmp(Integer idMmp, Integer idPays, Integer idContributeur) {
        throw new UnsupportedOperationException();
    }

    public void supprimerLesServicesDuContributeurSurLaMmp(Integer idContributeur, List<ServiceEntity> lesServicesSelectionnes) {
        throw new UnsupportedOperationException();
    }

    public ServiceEntity creerUnServicePourUnContributeur(ServiceTypeEntity serviceType, String addrIpService, Integer numeroPortService) {
        throw new UnsupportedOperationException();
    }

    public void modifierUnService(Integer idService) {
        throw new UnsupportedOperationException();
    }

    public void SupprimerUnService(Integer idService) {
        throw new UnsupportedOperationException();
    }

    public void desactiverUnService(Integer idService) {
        throw new UnsupportedOperationException();
    }

    public List<ServiceEntity> collecterLesServicesParContributeurParMmp(Integer idContributeur, Integer idMmp) {
        throw new UnsupportedOperationException();
    }

    public void activerLesServicesParServiceType(Integer idServiceType, List<ServiceEntity> lesServices) {
        throw new UnsupportedOperationException();
    }

    public List<ServiceEntity> collecterLesServicesParServiceType(Integer idServiceType) {
        throw new UnsupportedOperationException();
    }

    public void supprimerLesServicesParMmp(List<ServiceEntity> lesServices) {
        throw new UnsupportedOperationException();
    }

    public void ajouterLesServicesAlaMmp(List<ServiceEntity> lesServices) {
        throw new UnsupportedOperationException();
    }

    public void retirerLesServicesDeLaMmp(List<ServiceEntity> lesServices) {
        throw new UnsupportedOperationException();
    }

    public ServiceEntity collecterUnService(Integer idService) {
        throw new UnsupportedOperationException();
    }

    public List<ServiceEntity> collecterLesServicesParContributeur(Integer idContributeur) {
        throw new UnsupportedOperationException();
    }

    public List<ServiceEntity> collecterLesServicesParMmp(Integer idMmp) {
        throw new UnsupportedOperationException();
    }

    public void desactiverLesServicesParServiceType(Integer idServiceType, List<ServiceEntity> lesServices) {
        throw new UnsupportedOperationException();
    }
}