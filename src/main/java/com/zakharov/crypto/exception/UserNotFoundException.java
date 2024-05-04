package com.zakharov.crypto.exception;

public class UserNotFoundException extends RuntimeException {
    long id;

    public UserNotFoundException(Long id){
        this.id = id;
    }

    @Override
    public String getMessage() {
        return "User with id: " + id + " not found!!!";
    }
}
