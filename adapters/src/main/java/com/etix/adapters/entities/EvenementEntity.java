package com.etix.adapters.entities;

import com.etix.domain.models.Evenement;
import com.etix.domain.models.enumerations.TypeEvenement;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Builder
@Table(name = "evenement")
public class EvenementEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nom;
    private String lieu;
    private LocalDateTime date;
    @Enumerated(EnumType.STRING)
    private TypeEvenement typeEvenement;

    public static EvenementEntity toEntity(Evenement evenement) {
        return new EvenementEntityBuilder()
                .id(evenement.getId())
                .nom(evenement.getNom())
                .lieu(evenement.getLieu())
                .date(evenement.getDate())
                .typeEvenement(evenement.getTypeEvenement())
                .build();
    }

    public Evenement toDomain() {
        return new Evenement.Builder()
                .id(id)
                .nom(nom)
                .lieu(lieu)
                .date(date)
                .typeEvenement(typeEvenement)
                .build();
    }

}
