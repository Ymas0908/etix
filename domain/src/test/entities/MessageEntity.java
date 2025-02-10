package com.itcentrex.adapters.entities;

import com.itcentrex.adapters.entities.enumeration.StatutMessage;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class MessageEntity {
    private Integer id;
    private String object;
    private LocalDateTime dateHeureCreation;
    private String contenu;
    private Integer idUsagerEmetteur;
    private Integer idUsagerDestinataire;
    private Integer idContributeurEmetteur;
    private Integer idContributeurDestinataire;
    private StatutMessage statutMessage;
    private LocalDateTime dateHeureLecture;
}
