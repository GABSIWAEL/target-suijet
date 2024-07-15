package com.example.targetconge.Services;

import com.example.targetconge.Repositories.SalaireEmpRepository;
import com.example.targetconge.entity.SalaireEmp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class SalaireEmpService implements ISalaireEmpService{
    @Autowired
    private SalaireEmpRepository salaireEmpRepository;

    private static final Logger logger = (Logger) LoggerFactory.getLogger(SalaireEmpService.class);


    @Override
    public SalaireEmp ajoutSalaire(SalaireEmp salaireEmp) {
        return salaireEmpRepository.save(salaireEmp);
    }

    @Override
    public SalaireEmp updateSalaire(SalaireEmp salaireEmp) {
        Optional<SalaireEmp> optionalSalaire = salaireEmpRepository.findById(salaireEmp.getSalaire());

        if (optionalSalaire.isPresent()) {
            SalaireEmp existingSalaire = optionalSalaire.get();

            return salaireEmpRepository.save(salaireEmp);

        } else {
            String message = "RapportMensuel not found with id: " + salaireEmp.getSalaire();
            logger.info(message);
            return null;
        }
    }



    @Override
    public void deleteSalaireById(long idSalaire) {
        Optional<SalaireEmp> optionalSalaire = salaireEmpRepository.findById(idSalaire);
        if (optionalSalaire.isPresent()) {
            SalaireEmp existingSalaire = optionalSalaire.get();

            salaireEmpRepository.deleteById(idSalaire);

        } else {
            String message = "RapportMensuel not found with id: " + idSalaire;
            logger.info(message);

    }}

    @Override
    public SalaireEmp findSalaireById(long idSalaire) {
        return salaireEmpRepository.findById(idSalaire).get();
    }

    @Override
    public List<SalaireEmp> findAllSalaire() {
        return (List<SalaireEmp>)salaireEmpRepository.findAll();
    }
}
