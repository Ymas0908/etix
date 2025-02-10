package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum NatureOperation {
    CP2CP, CP2CB, CB2CP, CB2CB, CB2MW, CP2MW, MW2CB, MW2CP, MW2MW, REMITTANCE;

    public static List<NatureOperation> natureOperations() {
        return List.of(NatureOperation.values());
    }

}