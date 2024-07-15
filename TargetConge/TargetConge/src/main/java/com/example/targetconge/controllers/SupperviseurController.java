package com.example.targetconge.controllers;

import com.example.targetconge.Services.SalaireEmpService;
import com.example.targetconge.Services.SuperviseurService;
import com.example.targetconge.entity.SalaireEmp;
import com.example.targetconge.entity.Superviseur;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("/api/Superviseurs")
public class SupperviseurController {


    @Autowired
     SuperviseurService superviseurService;



    @PostMapping("")
    public Superviseur AddSuppperviser(@RequestBody Superviseur superviseur){
        return superviseurService.AddSuperviseur(superviseur);}

    @GetMapping("")
    public List<Superviseur> getAllSalaireEmpl() {
        return superviseurService.afficheALL();
    }

    @GetMapping("{numeroSuper}")
    public Superviseur findSalaireById(@PathVariable("numeroSuper") long numeroSuper) {
        return superviseurService.affichebyid(numeroSuper);
    }

    @DeleteMapping("{numeroSuper}")
    public void deleteempById(@PathVariable("numeroSuper") long numeroSuper) {
        superviseurService.deleteSuperviseur(numeroSuper);
    }
    @PutMapping("")
    public Superviseur UpdateempById(@RequestBody Superviseur superviseur)
    {
        return superviseurService.updateSuperviseur(superviseur);
    }


}
