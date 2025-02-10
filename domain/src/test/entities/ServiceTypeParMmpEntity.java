package com.itcentrex.adapters.entities;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ServiceTypeParMmpEntity {
    private ServiceTypeEntity serviceType;
    private MmpEntity mmp;
    private Integer iD;

    public List<ServiceTypeParMmpEntity> collecterLesServicesTypesRattachesParMmp(Integer idMmp) {
        throw new UnsupportedOperationException();
    }

    public void rattacherUnServiceTypeAuneMmp(Integer idServiceType, Integer idMmp) {
        throw new UnsupportedOperationException();
    }

    public void detacherUnServiceTypeDeMmp(Integer idServiceType, Integer idMmp) {
        throw new UnsupportedOperationException();
    }

    public void retirerLesServicesTypes(List<ServiceTypeEntity> lesServicesTypes, Integer idMmp) {
        throw new UnsupportedOperationException();
    }

    public void ajouterLesServicesTypes(List<ServiceTypeEntity> lesServicesTypes, Integer idMmp) {
        throw new UnsupportedOperationException();
    }
}