package com.example.targetconge.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Superviseur extends Employe {
    private long numeroSuper;

    public Long getIdSuperviseur() {
        return  numeroSuper;
    }
}
