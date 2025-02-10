package com.itcentrex.adapters.entities;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class DocumentEntity {
    private DocumentTypeEntity documentType;
    private ContributeurEntity contributeur;
    private Integer iD;
    private LocalDateTime dateHeureCreation;
    private String libelle;
    private String description;
    private String urlArchivage;

    public List<DocumentEntity> collecterLesDocumentsParContributeur(Integer idContributeur) {
        throw new UnsupportedOperationException();
    }
}