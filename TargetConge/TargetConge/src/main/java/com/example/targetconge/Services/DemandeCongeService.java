package com.example.targetconge.Services;

import com.example.targetconge.Repositories.DemandeCongeRepository;
import com.example.targetconge.Repositories.EmployeRepository;
import com.example.targetconge.entity.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DemandeCongeService implements IDemandeCongeService{
    @Autowired
    DemandeCongeRepository demandeRepository ;

    @Autowired
    EmployeRepository empRepo;
    private static final Logger logger = (Logger) LoggerFactory.getLogger(DemandeCongeService.class);

    @Override
    public DemandeConge AddDemandeConge(DtoDemandeConge  demandeConge) {
        DemandeConge con = new DemandeConge();
        con.setReponse(ReponseType.Pending);
        Optional<Employe> emp = empRepo.findById(demandeConge.getIdEmployee());
        con.setEmployee(emp.get());
        return demandeRepository.save(con) ;
    }

    @Override
    public DemandeConge UpdateDemandeConge(DemandeConge demandeConge) {
        Optional<DemandeConge> optionalConge = demandeRepository.findById(demandeConge.getIdDemande());

        if (optionalConge.isPresent()) {
            DemandeConge existingConge = optionalConge.get();

            return demandeRepository.save(demandeConge);

        } else {
            String message = "Conge not found with id: " + demandeConge.getIdDemande();
            logger.info(message);
            return null;
        }    }

    @Override
    public List<DemandeConge> findAll() {
        return   (List<DemandeConge>)   demandeRepository.findAll();

    }

    @Override
    public void DeletedemandeConge(long idDemande) {
        Optional<DemandeConge> optionalDemandeConge = demandeRepository.findById(idDemande);
        if (optionalDemandeConge.isPresent()) {
            DemandeConge existingConge = optionalDemandeConge.get();

            demandeRepository.deleteById(idDemande);

        } else {
            String message = "Conge not found with id: " + idDemande;
            logger.info(message);

        }

    }

    @Override
    public DemandeConge findDemandeById(long idDemande) {
        return  demandeRepository.findById(idDemande).get();

    }

    public DemandeConge approve(Long id){
         Optional<DemandeConge> con = demandeRepository.findById(id);
         if (con.isEmpty())
                return null;
         con.get().setReponse(ReponseType.Approved);
         demandeRepository.save(con.get());
         return  con.get();

    }
}
