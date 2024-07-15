package com.example.targetconge.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity

public class Conge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idConge;
    private Date datedDeb;
    private Date dateFin;
    private String raison;

    @Enumerated(EnumType.STRING)
    private TypeConge type;

    @ManyToOne
    private Employe employe;
}