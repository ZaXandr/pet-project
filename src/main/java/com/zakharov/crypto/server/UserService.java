package com.zakharov.crypto.server;

import com.zakharov.crypto.entity.User;
import com.zakharov.crypto.exception.UserAlreadyExist;
import com.zakharov.crypto.exception.UserNotFoundException;
import com.zakharov.crypto.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    UserRepository userRepository;

    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
    }

    public User saveUser(User user) {
        long id = user.getId();
         if(userRepository.findById(id).isEmpty())
             return userRepository.save(user);
         else throw new UserAlreadyExist(id);
    }

    public void deleteUser(Long id) {
        if (userRepository.findById(id).isPresent())
            userRepository.deleteById(id);
        else throw new UserNotFoundException(id);
    }

}
