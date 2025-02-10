package com.itcentrex.adapters.entities;

import com.itcentrex.adapters.entities.enumeration.Statut;
import com.itcentrex.adapters.entities.enumeration.TypeTaxe;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class SignatureEntity {

    private Integer id;
    private String nomSignataire;
    private String urlImage;
    private Integer idInstrument;
    private Statut statut;
    private LocalDateTime dateHeureCreation;

}
