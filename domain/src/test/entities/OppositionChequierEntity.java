package com.itcentrex.adapters.entities;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class OppositionChequierEntity {

    private Integer id;
    private LocalDateTime dateHeureOpposition;
    private String referenceChequier;
    private String motifOpposition;
}
