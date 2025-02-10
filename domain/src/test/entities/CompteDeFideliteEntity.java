package com.itcentrex.adapters.entities;

import com.itcentrex.adapters.entities.enumeration.StatutCompteFidelite;
import com.itcentrex.adapters.entities.enumeration.TypeCompteFidelite;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class CompteDeFideliteEntity {

    private Integer id;
    private String numeroCompteFidelite;
    private LocalDateTime dateHeureCreation;
    private StatutCompteFidelite statutCompteFidelite;
    private Integer idUsager;
    private TypeCompteFidelite typeCompteFidelite;
    private Integer nbPointsFidelite;
    private Double montantConverstiPoints;
}
