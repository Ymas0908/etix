package com.itcentrex.adapters.entities;

import com.itcentrex.adapters.entities.enumeration.StatutServiceWeb;
import com.itcentrex.adapters.entities.enumeration.TypeServiceWeb;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ServiceWebEntity {
    private Integer iD;
    private LocalDateTime dateHeureCreation;
    private String nom;
    private String libelle;
    private String description;
    private String adresseIpEtPortLocalisation;
    private String cheminLocalisation;
    private TypeServiceWeb typeServiceWeb;
    private StatutServiceWeb statutServiceWeb;

    public ServiceWebEntity initierUnServiceWeb() {
        throw new UnsupportedOperationException();
    }

    public List<ServiceWebEntity> collecterLesServicesWebParService(int idService) {
        throw new UnsupportedOperationException();
    }

    public void activerLesServicesWeb(List<ServiceWebEntity> lesServicesWeb, String statutServiceWeb) {
        throw new UnsupportedOperationException();
    }

    public void desactiverLesServicesWeb(List<ServiceWebEntity> lesServicesWeb, String statutServiceWeb) {
        throw new UnsupportedOperationException();
    }

    public void supprimerLesServicesWebParService(int idService) {
        throw new UnsupportedOperationException();
    }

    public void modifierUnServiceWeb(int idServiceWeb) {
        throw new UnsupportedOperationException();
    }

    public void creerDesServicesWebPourUnService(int idService, List<ServiceWebEntity> lesServicesWeb) {
        throw new UnsupportedOperationException();
    }
}