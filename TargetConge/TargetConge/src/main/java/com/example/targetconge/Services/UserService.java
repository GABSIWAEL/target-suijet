package com.example.targetconge.Services;

import com.example.targetconge.Repositories.UserRepository;
import com.example.targetconge.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserService implements IUserService{
    private static final Logger logger = (Logger) LoggerFactory.getLogger(UserService.class);

    @Autowired
    UserRepository userRepository;

    @Override
    public User ajoutUser(User user) {
        return userRepository.save(user);

    }

    @Override
    public User updateUser(User user) {
        Optional<User> optionalUser = userRepository.findById(user.getIdUser());

        if (optionalUser.isPresent()) {
            User existingUser = optionalUser.get();

            return userRepository.save(user);

        } else {
            String message = "User not found with id: " + user.getIdUser();
            logger.info(message);
            return null;
        }
    }



    @Override
    public void deleteUserById(long idUser) {

        Optional<User> optionalUser = userRepository.findById(idUser);
        if (optionalUser.isPresent()) {
            User existingUser = optionalUser.get();

            userRepository.deleteById(idUser);

        } else {
            String message = "User not found with id: " + idUser;
            logger.info(message);

        }}


    @Override
    public User findUserById(long idUser) {
        return userRepository.findById(idUser).get();

    }

    @Override
    public List<User> findAllUser() {
        return (List<User>) userRepository.findAll();
    }
}
