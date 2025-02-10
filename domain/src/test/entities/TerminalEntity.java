package com.itcentrex.adapters.entities;

import com.itcentrex.adapters.entities.enumeration.StatutTerminal;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class TerminalEntity {

    private Integer id;
    private LocalDateTime dateHeureCreation;
    private String numeroSerie;
    private String model;
    private String marque;
    private Integer idUsager;
    private StatutTerminal statutTerminal;
}
