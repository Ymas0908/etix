package com.itcentrex.adapters.entities;

import com.itcentrex.adapters.entities.enumeration.TypeOrdreFinancier;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class OrdreFinancierTypeEntity {
    private ServiceTypeEntity serviceType;
    private Integer iD;
    private String numeroSequence;
    private String libelleOperation;
    private String sensOperation;
    private TypeOrdreFinancier typeOrdreFinancier;
}