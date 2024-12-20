package com.tix.etix.api;


import com.tix.etix.exceptions.*;
import com.tix.etix.exceptions.EntityNotExistsException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class ExceptionApi {


    @ExceptionHandler(EntityNotExistsException.class)
    public ResponseEntity<ResponseApi> notFound(EntityNotExistsException error) {
        ResponseApi responseApi = new ResponseApi(error.getMessage(), error.getStatus(), null);
        return new ResponseEntity<>(responseApi, HttpStatus.NOT_FOUND);
    }



//    @ExceptionHandler(EntityAlreadyExistsException.class)
//    public ResponseEntity<ResponseApi> alreadyExist(EntityAlreadyExistsException error) {
//        ResponseApi responseApi = new ResponseApi(error.getMessage(), error.getStatus(), null);
//        return new ResponseEntity<>(responseApi, HttpStatus.CONFLICT);
//    }

//    @ExceptionHandler(ApplicationAuthenticationException.class)
//    public ResponseEntity<ResponseApi> authentification(ApplicationAuthenticationException error) {
//        ResponseApi responseApi = new ResponseApi(error.getMessage(), error.getStatus(), null);
//        return new ResponseEntity<>(responseApi, HttpStatus.UNAUTHORIZED);
//    }

//    @ExceptionHandler(ExpressionEvaluationException.class)
//    public ResponseEntity<ResponseApi> validation(ExpressionEvaluationException error) {
//        ResponseApi responseApi = new ResponseApi(error.getMessage(), error.getStatus(), null);
//        return new ResponseEntity<>(responseApi, HttpStatus.FORBIDDEN);
//    }

//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public ResponseEntity<ResponseApi> validationBody(MethodArgumentNotValidException ex) {
//
//        Map<String, String> errors = new HashMap<>();
//        ex.getBindingResult().getAllErrors().forEach(
//                (error) -> {
//                    String fieldName = ((FieldError) error).getField();
//                    String errorMessage = error.getDefaultMessage();
//                    errors.put(fieldName, errorMessage);
//                }
//        );
//
////        Map<String, List<String>> result = new HashMap<>();
////        result.put("errors", errors);
//
//        ResponseApi responseApi = new ResponseApi(errors.toString(), 404, errors.toString());
//        return new ResponseEntity<>(responseApi, HttpStatus.FORBIDDEN);
//    }


//    @ExceptionHandler(BadRequestException.class)
//    public ResponseEntity<ResponseApi> badCredential(BadRequestException error) {
//        ResponseApi responseApi = new ResponseApi(error.getMessage(), error.getStatus(), null);
//        return new ResponseEntity<>(responseApi, HttpStatus.BAD_REQUEST);
//    }

//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<ResponseApi> global(Exception error) {
//        ResponseApi responseApi = new ResponseApi(error.getMessage(), 500, null);
//        return new ResponseEntity<>(responseApi, HttpStatus.INTERNAL_SERVER_ERROR);
//    }


//    @ExceptionHandler(ConstraintDeclarationException.class)
//    public ResponseEntity<?> notValid(ConstraintDeclarationException ex) {
//        List<String> errors = new ArrayList<>();
////        ex.getConstraintViolations().forEach(violation -> {
////            String message = violation.getMessage(); // Message de l'annotation
////            String invalidValue = violation.getInvalidValue() != null ? violation.getInvalidValue().toString() : "null";
////            errors.add("Invalid value: " + invalidValue + " - " + message);
////        });
//        ex.getMessage();
//
//        System.out.println("*******************************" + errors + "**************************");
//        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
//    }

//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public ResponseEntity<Map<String, String>> handleConstraintViolation(MethodArgumentNotValidException ex) {
//        // Récupérer les messages d'erreur.
//        Map<String, String> errors = new HashMap<>();
//        ex.getBindingResult().getFieldErrors().forEach(fieldError -> errors.put(fieldError.getField(), fieldError.getDefaultMessage()));
//
//
//        System.out.println("+++++++++++++++++++++++" + errors + "+++++++++++++++++++++++++");
//        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
//    }

}
