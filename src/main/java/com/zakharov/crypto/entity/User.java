package com.zakharov.crypto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.Accessors;

@Entity
@Getter
@Setter
@ToString
@Accessors(chain = true)
@Table(name = "users")
public class User {

    @Id
    private Long id;

    private String name;
    private int age;
    private String email;

    public User(Long id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public User(){
    }

    public Long getId(){
        return this.id;
    }

}


