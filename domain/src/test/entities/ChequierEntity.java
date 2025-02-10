package com.itcentrex.adapters.entities;

import com.itcentrex.adapters.entities.enumeration.TypeCheque;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class ChequierEntity {

    private Integer id;
    private String numeroChequier;
    private TypeCheque typeCheque;
    private LocalDateTime dateInitialisation;
    private Boolean oppose;
    private LocalDateTime dateOpposition;
    private String raisonOpposition;
    private String numeroDebutCheque;
    private String numeroFinCheque;
}
