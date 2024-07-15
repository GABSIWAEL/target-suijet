package com.example.targetconge.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity
public abstract class Employe extends User  {
  protected  long numeroEmploye ;
  protected  String departement;
  protected  Date dateEmploit;

    protected  int soldeConge ;
  @OneToOne
  protected  SalaireEmp salaire ;
  @OneToMany(cascade = CascadeType.ALL , mappedBy = "employee")
  private List<DemandeConge> demandesConges ;

  @OneToMany(cascade = CascadeType.ALL , mappedBy = "employe")
  private List<Conge> conges;


    public long getNumeroEmploye() {
      return numeroEmploye;
    }
}
