package com.example.targetconge.Services;

import com.example.targetconge.Repositories.RapportMensuelRepository;
import com.example.targetconge.entity.RapportMensuel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RapportMensuelService implements IRapportMensuelService{
    private static final Logger logger = (Logger) LoggerFactory.getLogger(RapportMensuelService.class);

    @Autowired
    RapportMensuelRepository rapportMensuelRepository;
    @Override
    public RapportMensuel ajoutRapportMensuel(RapportMensuel rapport) {
        return rapportMensuelRepository.save(rapport);
    }

    @Override
    public RapportMensuel updateRapportMensuel(RapportMensuel rapport) {
        Optional<RapportMensuel> optionalRapportMensuel = rapportMensuelRepository.findById(rapport.getRapportMensuel());

        if (optionalRapportMensuel.isPresent()) {
            RapportMensuel existingRapportMensuel = optionalRapportMensuel.get();

            return rapportMensuelRepository.save(rapport);

        } else {
            String message = "RapportMensuel not found with id: " + rapport.getRapportMensuel();
            logger.info(message);
            return null;
        }
    }



    @Override
    public void deleteRapportMensuelById(Long idRapport) {
        Optional<RapportMensuel> optionalRapportMensuel = rapportMensuelRepository.findById(idRapport);
        if (optionalRapportMensuel.isPresent()) {
            RapportMensuel existingConge = optionalRapportMensuel.get();

            rapportMensuelRepository.deleteById(idRapport);

        } else {
            String message = "RapportMensuel not found with id: " + idRapport;
            logger.info(message);

        }

    }

    @Override
    public RapportMensuel findRapportById(Long idRapport) {
        return rapportMensuelRepository.findById(idRapport).get();
    }

    @Override
    public List<RapportMensuel> findAllRapport() {
        return (List<RapportMensuel>) rapportMensuelRepository.findAll();
    }
}
