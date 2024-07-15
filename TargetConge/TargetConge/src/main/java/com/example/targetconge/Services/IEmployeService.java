package com.example.targetconge.Services;

import com.example.targetconge.entity.Employe;

import java.util.List;

public interface IEmployeService {

    Employe AddEmployee(Employe employe);

    Employe UpdateEmp(Employe employe);

    List<Employe> findAll ();

    void DeleteEmp(long  numeroEmp);

    Employe findEmpById(long numeroEmp);
}
