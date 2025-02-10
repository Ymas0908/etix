package com.etix.adapters.entities;

import com.etix.domain.models.Usager;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Builder
@Table(name = "usager")
public class UsagerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private String prenom;
    private String email;

    public static UsagerEntity toEntity(Usager usager) {
        return new UsagerEntityBuilder()
                .id(usager.getId())
                .nom(usager.getNom())
                .prenom(usager.getPrenom())
                .email(usager.getEmail())
                .build();
    }

    public Usager toDomain() {
        return new Usager.Builder()
                .id(id)
                .nom(nom)
                .prenom(prenom)
                .email(email)
                .build();
    }
}

