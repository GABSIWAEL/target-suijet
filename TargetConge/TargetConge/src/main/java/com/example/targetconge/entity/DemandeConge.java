package com.example.targetconge.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

 @Setter
 @Getter
 @NoArgsConstructor
 @AllArgsConstructor
 @Entity
 public class DemandeConge {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long idDemande ;
     private Date dateDeb ;
     private Date dateFin ;
     @Enumerated(EnumType.STRING)
     private ReponseType reponse ;
     @Enumerated(EnumType.STRING)
     private TypeConge typeConge ;
     private String raison ;
     @ManyToOne
     private Employe employee ;

 }
