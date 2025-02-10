package com.itcentrex.adapters.entities.enumeration;

import java.util.List;

public enum TypeOtp {
    AUTHENTIFICATION, AUTORISATION;

    public static List<TypeOtp> typeOtpList() {
        return List.of(TypeOtp.values());
    }

}