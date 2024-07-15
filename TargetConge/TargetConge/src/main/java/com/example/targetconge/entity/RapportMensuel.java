package com.example.targetconge.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class RapportMensuel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idRapport ;

    @ManyToOne
    private RH rh ;

    public Long getRapportMensuel() {
        return idRapport;
    }
}
