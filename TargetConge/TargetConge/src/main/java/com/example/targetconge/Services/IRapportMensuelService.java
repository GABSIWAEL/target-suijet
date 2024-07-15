package com.example.targetconge.Services;

import com.example.targetconge.entity.RapportMensuel;

import java.util.List;

public interface IRapportMensuelService {
    RapportMensuel ajoutRapportMensuel (RapportMensuel rapport);
    RapportMensuel updateRapportMensuel (RapportMensuel rapport);
    void deleteRapportMensuelById(Long idRapport);
    RapportMensuel findRapportById (Long idRapport);
    List<RapportMensuel> findAllRapport ();

}
