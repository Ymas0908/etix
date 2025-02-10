package com.itcentrex.adapters.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class TypeDocumentEntity {
    private Integer id;
    private String libelle;
    private String description;
}
