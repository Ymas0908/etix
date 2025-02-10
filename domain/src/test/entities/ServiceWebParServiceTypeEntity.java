package com.itcentrex.adapters.entities;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ServiceWebParServiceTypeEntity {
    private ServiceWebEntity serviceWeb;
    private ServiceTypeEntity serviceType;
    private Integer iD;

    public List<ServiceWebEntity> collecterLesServicesWebParServiceType(Integer idServiceType) {
        throw new UnsupportedOperationException();
    }

    public ServiceWebEntity collecterUnServiceWebParServiceType(Integer idServiceType) {
        throw new UnsupportedOperationException();
    }
}