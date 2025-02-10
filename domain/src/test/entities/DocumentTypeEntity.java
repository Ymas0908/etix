package com.itcentrex.adapters.entities;

import com.itcentrex.adapters.entities.enumeration.FormatAutorise;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class DocumentTypeEntity {
    private Integer iD;
    private String libelle;
    private String description;
    private FormatAutorise formatAutorise;
}