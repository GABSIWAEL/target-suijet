package com.example.targetconge.controllers;

import com.example.targetconge.Services.SalaireEmpService;
import com.example.targetconge.entity.Employe;
import com.example.targetconge.entity.SalaireEmp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/salairies")
public class SalaireEmplController {
    @Autowired
    private SalaireEmpService salaireEmpService;
    @PostMapping("")
    public SalaireEmp AddSalaireEmp(@RequestBody SalaireEmp salaireEmp){
        return salaireEmpService.ajoutSalaire(salaireEmp);}

    @GetMapping("")
    public List<SalaireEmp> getAllSalaireEmpl() {
        return salaireEmpService.findAllSalaire();
    }
    @GetMapping("{numeroEmploye}")
    public SalaireEmp findSalaireById(@PathVariable("numeroEmploye") long numeroEmploye) {
        return salaireEmpService.findSalaireById(numeroEmploye);
    }

    @DeleteMapping("{numeroEmploye}")
    public void deleteempById(@PathVariable("numeroEmploye") long numeroEmploye) {
    salaireEmpService.deleteSalaireById(numeroEmploye);
    }
    @PutMapping("")
    public SalaireEmp UpdateempById(@RequestBody SalaireEmp salaireEmp)
    {
        return salaireEmpService.updateSalaire(salaireEmp);
    }





}
