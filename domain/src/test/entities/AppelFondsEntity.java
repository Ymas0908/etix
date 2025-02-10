package com.itcentrex.adapters.entities;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class AppelFondsEntity {

    private Integer id;
    private Integer idUsagerAppelant;
    private Integer idUsagerAppelle;
    private LocalDateTime dateHeureAppel;
    private String motifAppel;
    private Integer idInstrumentACrediter;
    private Double montantAppel;

}
