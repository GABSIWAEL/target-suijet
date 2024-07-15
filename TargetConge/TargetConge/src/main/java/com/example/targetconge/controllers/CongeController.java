package com.example.targetconge.controllers;

import com.example.targetconge.Services.CongeService;
import com.example.targetconge.entity.Conge;
import com.example.targetconge.entity.DtoConge;
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
@RequestMapping("/api/conges")
public class CongeController {
    @Autowired
    private CongeService congeService;
    @PostMapping("")
    public Conge AddConge(@RequestBody DtoConge dtoConge){
        return congeService.AddConge(dtoConge);}

    @GetMapping("")
    public List<Conge> getAllConges() {
        return congeService.findAllConge();
    }
    @GetMapping("{idConge}")
    public Conge getCongeById(@PathVariable("idConge") long idConge) {
        return congeService.findCongeById(idConge);
    }


    @DeleteMapping("{idConge}")
    public void deleteCongeById(@PathVariable("idConge") long idConge) {

        congeService.DeleteCongebyid(idConge);
}
    @PutMapping("/{id}")
    public Conge UpdateCongeById(@PathVariable("id") long id ,@RequestBody DtoConge dtoConge)
    {
        return congeService.UpdateConge(id,dtoConge);
    }








}












