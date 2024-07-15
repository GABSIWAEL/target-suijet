package com.example.targetconge.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class RH extends Employe {
    private long numeroRh ;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "rh")
    private List<RapportMensuel> rapports ;
public long getRH(){
   return  numeroRh;
}
}
