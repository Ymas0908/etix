package com.itcentrex.adapters.entities;

import java.time.LocalDateTime;
import java.util.List;

public class AnnotationEntity {
    private UtilisateurEntity utilisateur;
    private ContributeurEntity contributeur;
    private Integer iD;
    private LocalDateTime dateHeureCreation;
    private String dateHeureLecture;
    private String commentaire;

    public AnnotationEntity initierUneAnnotation() {
        throw new UnsupportedOperationException();
    }

    public AnnotationEntity insererUneAnnotation(Integer idContributeur, String annotation, String statutAnnotation) {
        throw new UnsupportedOperationException();
    }

    public AnnotationEntity insererUneAnnotationCollectee(String annotation, Integer idUtilisateur) {
        throw new UnsupportedOperationException();
    }

    public List<AnnotationEntity> collecterLesAnnotationsParContributeur(Integer idContributeur) {
        throw new UnsupportedOperationException();
    }

    public AnnotationEntity insererUneAnnotationCollectee(Integer idContributeur, AnnotationEntity annotation) {
        throw new UnsupportedOperationException();
    }
}