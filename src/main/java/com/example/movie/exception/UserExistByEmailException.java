package com.example.movie.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter

public class UserExistByEmailException extends RuntimeException {
  public UserExistByEmailException(String message) {
    super(message);
  }
}
