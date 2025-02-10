package com.itcentrex.adapters.entities;

import com.itcentrex.adapters.entities.enumeration.TypeOffre;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class TitreEntity {

    private Integer id;
    private LocalDateTime dateHeureCreation;
    private Integer idUsagerDestinataire;
    private Integer idUsagerProprietaire;
    private String reference;
    private Double valeurNominale;
    private TypeOffre typeOffre;
}
