package com.example.targetconge.Services;

import com.example.targetconge.entity.RH;

import java.util.List;

public interface IRHService {

    RH ajoutRHl (RH rh);
   RH updateRH (RH rh);
    void deleteRHById(long numeroRh);


     RH findRHById(long numeroRh);

    List<RH> findAllRH ();
}
