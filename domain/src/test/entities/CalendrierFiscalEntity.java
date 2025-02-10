package com.itcentrex.adapters.entities;

import com.itcentrex.adapters.entities.enumeration.TypeContribuable;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class CalendrierFiscalEntity {

    private Integer id;
    private Integer idNatureImpo;
    private TypeContribuable typeContribuable;
    private LocalDateTime dateDeclaration;
    private LocalDateTime datePaiement;
}
