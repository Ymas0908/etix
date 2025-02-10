package com.itcentrex.adapters.entities;

import com.itcentrex.adapters.entities.enumeration.StatutNotification;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class NotificationEntity {

    private LocalDateTime dateHeureCreation;
    private String objet;
    private String contenu;
    private Integer idEmetteur;
    private Integer idDestinataire;
    private StatutNotification statutNotification;
    private LocalDateTime dateHeureLecture;

}
