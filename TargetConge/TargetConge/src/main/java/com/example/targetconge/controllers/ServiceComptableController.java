package com.example.targetconge.controllers;

import com.example.targetconge.Services.ServiceComptableService;
import com.example.targetconge.Services.SuperviseurService;
import com.example.targetconge.entity.ServiceComptable;
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
@RequestMapping("/api/servicesComptables")
public class ServiceComptableController {


    @Autowired
    ServiceComptableService serviceComptableService;



    @PostMapping("")
    public ServiceComptable AddServiceComptable(@RequestBody ServiceComptable serviceComptable){
        return serviceComptableService.ajoutServiceComptable(serviceComptable);}

    @GetMapping("")
    public List<ServiceComptable> getAllServiceComptable() {
        return serviceComptableService.findAllServiceComptable();
    }

    @GetMapping("{numerCom}")
    public ServiceComptable findServiceComptableById(@PathVariable("numerCom") long numerCom) {
        return serviceComptableService.findServiceComptableById(numerCom);
    }

    @DeleteMapping("{numerCom}")
    public void deleteServiceComptableById(@PathVariable("numerCom") long numerCom) {
        serviceComptableService.deleteSServiceComptableById(numerCom);
    }
    @PutMapping("")
    public ServiceComptable UpdateServiceComptableById(@RequestBody ServiceComptable serviceComptable)
    {
        return serviceComptableService.updateServiceComptable(serviceComptable);
    }


}
