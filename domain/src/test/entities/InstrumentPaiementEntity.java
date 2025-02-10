package com.itcentrex.adapters.entities;

import com.itcentrex.adapters.entities.enumeration.StatutInstrument;
import com.itcentrex.adapters.entities.enumeration.TypeInstrument;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class InstrumentPaiementEntity {

    private Integer id;
    private String libelle;
    private TypeInstrument typeInstrument;
    private StatutInstrument statutInstrument;
    private Integer idContributeurEmetteur;
    private Integer usagerProprietaire;
}
