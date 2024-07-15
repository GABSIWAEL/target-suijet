package com.example.targetconge.entity;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)


public abstract class User  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    protected long idUser;
    protected String nom ;
    protected String prenom ;

}
