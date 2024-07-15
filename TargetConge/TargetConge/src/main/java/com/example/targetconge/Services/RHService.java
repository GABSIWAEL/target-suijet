package com.example.targetconge.Services;

import com.example.targetconge.Repositories.RHRepository;
import com.example.targetconge.entity.RH;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RHService implements IRHService{
    private static final Logger logger = (Logger) LoggerFactory.getLogger(RHService.class);

    @Autowired
    private RHRepository rhRepository;
    @Override
    public RH ajoutRHl(RH rh) {
        return rhRepository.save(rh);
    }

    @Override
    public RH updateRH(RH rh) {
        Optional<RH> optionalRH = rhRepository.findById(rh.getNumeroRh());

        if (optionalRH.isPresent()) {
            RH existingRH = optionalRH.get();

            return rhRepository.save(rh);

        } else {
            String message = "RH not found with id: " + rh.getNumeroRh();
            logger.info(message);
            return null;
        }
    }


    @Override
    public void deleteRHById(long  numeroRh) {
        Optional<RH> optionalRH = rhRepository.findById(numeroRh);
        if (optionalRH.isPresent()) {
            RH existingRH = optionalRH.get();

            rhRepository.deleteById(numeroRh);

        } else {
            String message = "RapportMensuel not found with id: " + numeroRh;
            logger.info(message);
    }}

    @Override
    public  RH findRHById(long numeroRh) {

        return rhRepository.findById(numeroRh).get();
    }

    @Override
    public List<RH> findAllRH() {
        return (List<RH>) rhRepository.findAll();
    }
}
