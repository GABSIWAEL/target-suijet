package com.example.targetconge.Repositories;

import com.example.targetconge.entity.Conge;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CongeRepository  extends CrudRepository <Conge, Long>{
}
