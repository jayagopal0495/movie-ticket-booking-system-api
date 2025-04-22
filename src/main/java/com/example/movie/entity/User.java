package com.example.movie.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class User extends UserDetails{
    @Id
    private String userId;

}
