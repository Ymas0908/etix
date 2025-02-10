package com.itcentrex.adapters.entities;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class QuotePartEntity {

    private Integer id;
    private LocalDateTime dateHeureCreation;
    private Integer idUsagerPayeur;
    private Integer idInstrumentPaiementPayeur;
    private String referenceFacture;
    private Double montantQuotePart;
}