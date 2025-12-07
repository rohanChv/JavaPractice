package com.example.RestAPI.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(FATFBlocked.class)
    public ResponseEntity<String> exceptionCountry(){
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body("Country is FATF Blocked");
    }
}
