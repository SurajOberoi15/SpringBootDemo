/*
package com.Practise;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@ControllerAdvice
@RestController
public class customizedExceptionHandling {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Object> handleValidationError(MethodArgumentNotValidException ex, WebRequest request){

        List<FieldError> fieldErrors = ex.getBindingResult().getFieldErrors();

        Map<String,String> errors = new LinkedHashMap<>();

        for(FieldError fieldError : fieldErrors) {
            errors.put(fieldError.getField(),fieldError.getDefaultMessage());
        }
        ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(),404,ex.getMessage(),errors);

        return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(Exception.class)
    public void Test(Exception ex){
        System.out.println("printing exception");
        System.out.println(ex.getMessage());
    }
}
*/
