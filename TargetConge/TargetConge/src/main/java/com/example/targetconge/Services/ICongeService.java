package com.example.targetconge.Services;

import com.example.targetconge.entity.Conge;
import com.example.targetconge.entity.DtoConge;

import java.util.List;

public interface ICongeService {
   Conge AddConge(DtoConge dtoConge);
   Conge UpdateConge (Long id, DtoConge dtoConge);
   void DeleteCongebyid  (long idConge);

   List<Conge>findAllConge();

   Conge findCongeById(long IdConge);






}
