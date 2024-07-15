package com.example.targetconge.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class SalaireEmp
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long idSalaire;
    private double montant ;

    @OneToOne(mappedBy= "salaire")
    private Employe employe ;

    public Long getSalaire() {
        return idSalaire;
    }
}
