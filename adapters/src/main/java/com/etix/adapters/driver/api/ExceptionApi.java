package com.etix.adapters.driver.api;


import com.etix.domain.exceptions.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class ExceptionApi {


    @ExceptionHandler(EntityNotExistsException.class)
    public ResponseEntity<ErrorResponseApi> notFound(EntityNotExistsException error) {
        return new ResponseEntity<>(new ErrorResponseApi(error.getMessage(), error.getStatus()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(EntityAlreadyExistsException.class)
    public ResponseEntity<ErrorResponseApi> alreadyExist(EntityAlreadyExistsException error) {
        return new ResponseEntity<>(new ErrorResponseApi(error.getMessage(), error.getStatus()), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(ApplicationAuthenticationException.class)
    public ResponseEntity<ErrorResponseApi> authentification(ApplicationAuthenticationException error) {
        return new ResponseEntity<>(new ErrorResponseApi(error.getMessage(), error.getStatus()), HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(ExpressionEvaluationException.class)
    public ResponseEntity<ErrorResponseApi> validation(ExpressionEvaluationException error) {
        return new ResponseEntity<>(new ErrorResponseApi(error.getMessage(), error.getStatus()), HttpStatus.FORBIDDEN);
    }


    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ErrorResponseApi> badCredential(BadRequestException error) {
        return new ResponseEntity<>(new ErrorResponseApi(error.getMessage(), error.getStatus()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponseApi> global(Exception error) {
        return new ResponseEntity<>(new ErrorResponseApi(error.getMessage(), 500), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
