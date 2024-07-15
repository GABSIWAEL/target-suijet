package com.example.targetconge.Repositories;

import com.example.targetconge.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
