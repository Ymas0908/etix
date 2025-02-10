package com.itcentrex.adapters.entities;

import com.itcentrex.adapters.entities.enumeration.StatutReservation;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ReservationEntity {

    private Integer id;
    private LocalDateTime dateHeureCreation;
    private Integer idArticle;
    private Integer idPanier;
    private Integer quantiteReservee;
    private Double avanceReservation;
    private StatutReservation statutReservation;
}
