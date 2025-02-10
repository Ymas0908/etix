package com.itcentrex.adapters.entities;

import com.itcentrex.adapters.entities.enumeration.TypeOtp;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class OtpEntity {

    private Integer id;
    private TypeOtp type;
    private LocalDateTime dateHeureCreation;
    private LocalDateTime dateHeureExpiration;
    private Integer idUsagerDestinataire;
    private Integer idUsagerEmetteur;
    private String otp;

}
