package com.example.movie.controller;

import com.example.movie.entity.UserDetails;
import com.example.movie.service.UserService;
import com.example.movie.utility.ResponseStructure;
import com.example.movie.utility.RestResponseBuilder;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/register")
public class UserController {

    private final UserService userService; // Use the interface instead of the implementation

    @PutMapping("/user")
    public ResponseEntity<ResponseStructure<UserDetails>> addUser(@RequestBody UserDetails userDetails) {
        UserDetails savedUser = userService.addUserDetails(userDetails);
        return RestResponseBuilder.created("User Details Created",savedUser,HttpStatus.CREATED.value());
    }
}