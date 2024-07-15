package com.example.targetconge.Services;

import com.example.targetconge.Repositories.SuperviseurRepository;
import com.example.targetconge.entity.Superviseur;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class SuperviseurService implements ISuperviseurService{
    private static final Logger logger = (Logger) LoggerFactory.getLogger(SuperviseurService.class);

    @Autowired
    SuperviseurRepository superviseurRepository;

    @Override
    public Superviseur AddSuperviseur(Superviseur superviseur) {
        return superviseurRepository.save(superviseur) ;
    }

    @Override
    public Superviseur updateSuperviseur(Superviseur superviseur) {
        Optional<Superviseur> optionalSuperviseur = superviseurRepository.findById(superviseur.getIdSuperviseur());

        if (optionalSuperviseur.isPresent()) {
            Superviseur existingSuperviseur = optionalSuperviseur.get();

            return superviseurRepository.save(superviseur);

        } else {
            String message = "Superviseur not found with id: " + superviseur.getIdSuperviseur();
            logger.info(message);
            return null;
        }
    }

    @Override
    public void deleteSuperviseur(long  numerosup) {

        Optional<Superviseur> optionalSuperviseur = superviseurRepository.findById(numerosup);
        if (optionalSuperviseur.isPresent()) {
            Superviseur existingSuperviseur = optionalSuperviseur.get();

            superviseurRepository.deleteById(numerosup);

        } else {
            String message = "Conge not found with id: " + numerosup;
            logger.info(message);

        }}

    @Override
    public List<Superviseur> afficheALL() {
        return (List<Superviseur>) superviseurRepository.findAll();
    }

    @Override
    public Superviseur affichebyid(long numerosup) {
        return superviseurRepository.findById(numerosup).get();
    }
}
