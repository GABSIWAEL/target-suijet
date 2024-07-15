package com.example.targetconge.controllers;

import com.example.targetconge.Services.EmployeService;
import com.example.targetconge.entity.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/employees")
public class EmployerController {
    @Autowired
private EmployeService employerService;
    @PostMapping("")
    public Employe AddEmployer(@RequestBody Employe employe){
        return employerService.AddEmployee(employe);}

    @GetMapping("")
    public List<Employe> getAllEmployer() {
        return employerService.findAll();
    }
    @GetMapping("/{numeroEmploye}")
    public Employe getempById(@PathVariable("numeroEmploye") long numeroEmploye) {
        return employerService.findEmpById(numeroEmploye);
    }


    @DeleteMapping("/{numeroEmploye}")
    public void deleteempById(@PathVariable("numeroEmploye") long numeroEmploye) {
        employerService.DeleteEmp(numeroEmploye);
    }
    @PutMapping("")
    public Employe UpdateempById(@RequestBody Employe employe)
    {
        return employerService.UpdateEmp(employe);
    }




}
