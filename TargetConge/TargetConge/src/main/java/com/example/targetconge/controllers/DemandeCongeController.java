package com.example.targetconge.controllers;

import com.example.targetconge.Services.DemandeCongeService;
import com.example.targetconge.entity.DemandeConge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/demandeConges")

public class DemandeCongeController {
    @Autowired
    private DemandeCongeService demandeCongeService;
    @PostMapping("")
    public DemandeConge ajoutDemande( @RequestBody DemandeConge demandeConge){
        return demandeCongeService.AddDemandeConge(demandeConge);

    }
    @GetMapping("/{idDemande}")
    public DemandeConge retournerDemande (@PathVariable("idDemande") long idDemande){
        return demandeCongeService.findDemandeById(idDemande);
    }
    @GetMapping("/")
    public List<DemandeConge> retournerTout(){
        return demandeCongeService.findAll();}



    @DeleteMapping("{idDemande}")
    public void deleteById(@PathVariable("idDemande") long idDemande) {
        demandeCongeService.DeletedemandeConge(idDemande);
    }
    @PutMapping("/")
    public DemandeConge modifierDemande (@RequestBody DemandeConge demandeCoonge){
        return demandeCongeService.UpdateDemandeConge(demandeCoonge);
    }
    }