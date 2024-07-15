package com.example.targetconge.Services;

import com.example.targetconge.entity.SalaireEmp;

import java.util.List;

public interface ISalaireEmpService {


    SalaireEmp ajoutSalaire(SalaireEmp salaireEmp);
    SalaireEmp updateSalaire(SalaireEmp salaireEmp);
    void deleteSalaireById(long idSalaire);
    SalaireEmp findSalaireById (long idSalaire);
    List<SalaireEmp> findAllSalaire ();
}
