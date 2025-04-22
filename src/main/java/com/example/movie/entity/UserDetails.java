package com.example.movie.entity;

import com.example.movie.enums.UserRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Table
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "userId")
    private String userId;
    private String userName;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private UserRole userRole;
    private String phoneNumber;
    private LocalDate dateOfBirth;
    private long createAt;
    private long updateAt;


}