package com.example.movie.service.Impl;

import com.example.movie.entity.UserDetails;
import com.example.movie.exception.UserExistByEmailException;
import com.example.movie.repository.UserRepository;
import com.example.movie.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

@Override
    public UserDetails addUserDetails(UserDetails userDetails){
    if (userRepository.existsByEmail(userDetails.getEmail())){
        throw new UserExistByEmailException("User with Email is already exists");
    }

    return userRepository.save(userDetails);
}


}


