package com.example.targetconge.Services;

import com.example.targetconge.Repositories.EmployeRepository;
import com.example.targetconge.entity.Employe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeService implements IEmployeService{
    @Autowired
    private EmployeRepository employeRepository ;

    private static final Logger logger = (Logger) LoggerFactory.getLogger(EmployeService.class);

    @Override
    public Employe AddEmployee(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employe UpdateEmp(Employe employe) {

        Optional<Employe> optionalEmploye = employeRepository.findById(employe.getNumeroEmploye());

        if (optionalEmploye.isPresent()) {
            Employe existingEmploye = optionalEmploye.get();

            return employeRepository.save(employe);

        } else {
            String message = " Employe not found with id: " + employe.getNumeroEmploye();
            logger.info(message);
            return null;
        }
    }

    @Override
    public List<Employe> findAll() {
        return (List<Employe>)employeRepository.findAll();
    }

    @Override
    public void DeleteEmp(long numeroEmp) {
        Optional<Employe> optionalConge = employeRepository.findById(numeroEmp);
        if (optionalConge.isPresent()) {
            Employe existingConge = optionalConge.get();

            employeRepository.deleteById(numeroEmp);

        } else {
            String message = "Conge not found with id: " + numeroEmp;
            logger.info(message);
        }

    }

    @Override
    public Employe findEmpById(long numeroEmp) {
        return employeRepository.findById(numeroEmp).get();
    }
}
