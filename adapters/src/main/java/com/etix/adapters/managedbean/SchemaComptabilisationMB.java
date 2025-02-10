package com.etix.adapters.managedbean;/*
package com.itcentrex.adapters.managedbean;

import com.itcentrex.adapters.model.*;
import com.itcentrex.adapters.service.EcritureTypeService;
import com.itcentrex.adapters.service.SchemaComptabilisationService;
import com.itcentrex.adapters.service.TypeOperationComptableService;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Named
@ViewScoped
@Getter
@Setter
public class SchemaComptabilisationMB {

    SchemaComptabilisation schemaComptabilisation;
    List<SchemaComptabilisation> schemaComptabilisations;

    TypeOperationComptable typeOperationComptable;
    List<TypeOperationComptable> typeOperationComptables;

    EcritureType ecritureType;
    List<EcritureType> ecritureTypes;

    SensEcriture sensEcriture;
    List<SensEcriture> sensEcritures;

    FormatFichier formatFichier;
    @Autowired
    SchemaComptabilisationService schemaComptabilisationService;
    @Autowired
    TypeOperationComptableService typeOperationComptableService;

    @Autowired
    EcritureTypeService ecritureTypeService;

    @PostConstruct
    public void init() {
        schemaComptabilisations = new ArrayList<>();
        typeOperationComptables = new ArrayList<>();
        ecritureTypes = new ArrayList<>();
        sensEcritures = new ArrayList<>();
        typeOperationComptables = typeOperationComptableService.getTypeOperationComptables();
        schemaComptabilisations = schemaComptabilisationService.getSchemaComptabilisations();
        ecritureTypes = ecritureTypeService.getEcritureTypes();
        sensEcritures = Arrays.stream(SensEcriture.values()).toList();
    }

}
*/
