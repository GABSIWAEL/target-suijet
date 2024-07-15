package com.example.targetconge.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class ServiceComptable extends User {
    private long numerCom;

    public Long getIdServiceC() {
        return numerCom;
    }


}
