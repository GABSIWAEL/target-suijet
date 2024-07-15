package com.example.targetconge.controllers;

import com.example.targetconge.Services.CongeService;
import com.example.targetconge.Services.RHService;
import com.example.targetconge.entity.Conge;
import com.example.targetconge.entity.RH;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/rhs")
public class RHController {
    @Autowired
    private RHService rhService;
    @PostMapping("")
    public RH AddRh(@RequestBody RH rh){
        return rhService.ajoutRHl(rh);}

    @GetMapping("")
    public List<RH> findAllRH() {
        return rhService.findAllRH();
    }
    @GetMapping("{numeroRh}")
    public RH getRHById(@PathVariable("numeroRh") long numeroRh) {
        return rhService.findRHById(numeroRh);
    }


    @DeleteMapping("{numeroRh}")
    public void deleteRHyId(@PathVariable("numeroRh") long numeroRh) {
        rhService.deleteRHById(numeroRh);
    }
    @PutMapping("")
    public RH UpdateRHById(@RequestBody RH rh)
    {
        return rhService.updateRH(rh);
    }
}
