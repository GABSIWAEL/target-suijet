package com.example.targetconge.entity;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class DtoDemandeConge {
    private Date dateDeb ;
    private Date dateFin ;

    @Enumerated(EnumType.STRING)
    private TypeConge typeConge ;
    private String raison ;
    private Long idEmployee;
}
