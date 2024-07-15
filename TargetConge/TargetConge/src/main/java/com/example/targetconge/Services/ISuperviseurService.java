package com.example.targetconge.Services;

import com.example.targetconge.entity.Superviseur;

import java.util.List;

public interface ISuperviseurService {
 Superviseur AddSuperviseur(Superviseur superviseur);
  Superviseur updateSuperviseur(Superviseur superviseur);

  void deleteSuperviseur(long numerosup);

  List<Superviseur> afficheALL();

  Superviseur affichebyid(long numerosup);



}
