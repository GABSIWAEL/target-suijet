package com.example.targetconge.Services;

import com.example.targetconge.entity.User;

import java.util.List;

public interface IUserService {
    User ajoutUser(User user);
    User updateUser(User user);

    void deleteUserById(long idUser);
    User findUserById (long idUser);
    List<User> findAllUser ();

}
