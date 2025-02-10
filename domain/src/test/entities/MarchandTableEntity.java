package com.itcentrex.adapters.entities;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MarchandTableEntity {

    private Integer id;
    private LocalDateTime dateHeureCreation;
    private Integer idContributeurRestaurateur;
    private String numeroTable;
    private String localisation;


}
