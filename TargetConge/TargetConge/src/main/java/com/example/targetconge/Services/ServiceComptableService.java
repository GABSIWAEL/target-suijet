package com.example.targetconge.Services;

import com.example.targetconge.Repositories.ServiceComptableRepository;
import com.example.targetconge.entity.ServiceComptable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ServiceComptableService implements IServiceComptableService{
    @Autowired
    private ServiceComptableRepository serviceComptableRepository ;
    private static final Logger logger = (Logger) LoggerFactory.getLogger(ServiceComptableService.class);

    @Override
    public ServiceComptable ajoutServiceComptable(ServiceComptable serviveC) {
        return serviceComptableRepository.save(serviveC);

    }

    @Override
    public ServiceComptable updateServiceComptable(ServiceComptable serviveC) {
        Optional<ServiceComptable> optionalServiceComptable = serviceComptableRepository.findById(serviveC.getIdServiceC());

        if (optionalServiceComptable.isPresent()) {
            ServiceComptable existingServiceComptable = optionalServiceComptable.get();

            return serviceComptableRepository.save(serviveC);

        } else {
            String message = "serviveC not found with id: " + serviveC.getIdServiceC();
            logger.info(message);
            return null;
        }
    }



    @Override
    public void deleteSServiceComptableById(long numerCom) {


    Optional<ServiceComptable> optionalServiceComptable = serviceComptableRepository.findById(numerCom);
        if (optionalServiceComptable.isPresent()) {
            ServiceComptable existingServiceComptable = optionalServiceComptable.get();

        serviceComptableRepository.deleteById(numerCom);

    } else {
        String message = "Conge not found with id: " + numerCom;
        logger.info(message);
    }}
    @Override
    public ServiceComptable findServiceComptableById(long numerCom) {
        return   serviceComptableRepository.findById(numerCom).get();
    }

    @Override
    public List<ServiceComptable> findAllServiceComptable() {
        return (List<ServiceComptable>)   serviceComptableRepository.findAll();
    }
}
