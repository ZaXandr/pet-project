package com.zakharov.crypto.exception;

public class UserAlreadyExist extends RuntimeException {
    long id;
    public UserAlreadyExist(long id) {
        this.id = id;
    }

    @Override
    public String getMessage() {
        return "User with id: " + id + " already exist!!!";
    }
}
