package com.zakharov.crypto.controller;

import com.zakharov.crypto.entity.User;
import com.zakharov.crypto.server.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    UserService userService;

    UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public User findUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PostMapping("/user/save")
    public User saveUserById(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }
}
