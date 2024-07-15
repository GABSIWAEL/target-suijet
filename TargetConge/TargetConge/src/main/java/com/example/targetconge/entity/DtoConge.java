package com.example.targetconge.entity;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class DtoConge {
    private Date datedDeb;
    private Date dateFin ;
    private String raison ;
    @Enumerated(EnumType.STRING)
    private TypeConge type;
}
