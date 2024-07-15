package com.example.targetconge.entity;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.util.Date;

public class DtoEmploye {
    protected  String departement;
    protected Date dateEmploit;

    protected  int soldeConge ;

    @Enumerated(EnumType.STRING)
    private TypeConge typeConge ;
}
