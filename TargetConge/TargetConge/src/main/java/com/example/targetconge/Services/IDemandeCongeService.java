package com.example.targetconge.Services;

import com.example.targetconge.entity.DemandeConge;
import com.example.targetconge.entity.DtoDemandeConge;

import java.util.List;

public interface IDemandeCongeService {

    DemandeConge AddDemandeConge(DtoDemandeConge con);

    DemandeConge UpdateDemandeConge(DemandeConge demandeConge);

    List<DemandeConge> findAll ();

    void DeletedemandeConge(long idDemande);
    DemandeConge findDemandeById(long idDemande);



}
