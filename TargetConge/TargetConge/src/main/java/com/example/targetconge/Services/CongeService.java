package com.example.targetconge.Services;

import com.example.targetconge.Repositories.CongeRepository;
import com.example.targetconge.entity.Conge;
import com.example.targetconge.entity.DtoConge;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;




@Service
public class CongeService implements ICongeService {

    @Autowired
    private CongeRepository congeRepository ;

    private static final Logger logger = (Logger) LoggerFactory.getLogger(CongeService.class);

    @Override
    public Conge AddConge(DtoConge dtoConge) {
         Conge con = new Conge();
         con.setRaison(dtoConge.getRaison());
         // fibisg
        return congeRepository.save(con);
    }

    @Override
    public Conge UpdateConge(Long id,DtoConge conge) {

        Optional<Conge> optionalConge = congeRepository.findById(id);

        if (optionalConge.isEmpty()) {
            logger.info("no conge found for the given id" + id);
            return null;
        }
        Conge con = optionalConge.get();
        con.setType(conge.getType());
        // finish the rest
        return congeRepository.save(con);
    }

    @Override
    public void DeleteCongebyid(long idConge) {
        Optional<Conge> optionalConge = congeRepository.findById(idConge);
        if (optionalConge.isPresent()) {
            congeRepository.deleteById(idConge);

        } else {
            String message = "Conge not found with id: " + idConge;
            logger.info(message);
        }

    }

    @Override
    public List<Conge> findAllConge() {

        return   (List<Conge>)   congeRepository.findAll();
    }

    @Override
    public Conge findCongeById(long IdConge) {
        return  congeRepository.findById(IdConge).get();
    }
}
