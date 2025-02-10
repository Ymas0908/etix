package com.itcentrex.adapters.entities;

import com.itcentrex.adapters.entities.enumeration.StatutContact;
import lombok.*;
import java.io.Serializable;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class UsagerEntity {

    private Integer id;
    private String nom;
    private String prenom;
    private String email;
    private String msidnContact;
    private String adressePushNotification;
    private StatutContact statutContact;

}
