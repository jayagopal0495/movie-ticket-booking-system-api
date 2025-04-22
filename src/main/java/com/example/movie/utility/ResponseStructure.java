package com.example.movie.utility;

import lombok.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseStructure<T> {
    private int status;
    private String message;
    private T data;

    public <T> ResponseEntity<ResponseStructure<T>> success(HttpStatus status, String message, T data) {
        ResponseStructure<T> responseStructure = ResponseStructure.<T>builder().status(status.value()).message(message).data(data).build();
        return ResponseEntity.status(status).body(responseStructure);
    }
}