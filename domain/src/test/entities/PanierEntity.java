package com.itcentrex.adapters.entities;

import com.itcentrex.adapters.entities.enumeration.StatutPanier;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class PanierEntity {

    private Integer id;
    private String referenceVente;
    private LocalDateTime dateHeureCreation;
    private StatutPanier statutPanier;
    private Integer idUsagerProprietaire;
    private Integer idMmp;

}
