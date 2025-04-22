package com.example.movie.utility;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ErrorStructure<S> {
    private String type;
    private int status;
    private String message;
}