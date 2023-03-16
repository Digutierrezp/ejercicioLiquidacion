package com.liquidacion.exceptions;

import com.liquidacion.entity.Empleado;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HandleException {
    /*@ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleGereralException(Exception e) {
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.CONFLICT.value(), e.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.CONFLICT);*/

        @ExceptionHandler(DeduccionException.class)
        public ResponseEntity<ErrorResponse> handleDeduccionException(DeduccionException e){
            ErrorResponse errorResponse = new ErrorResponse(HttpStatus.BAD_REQUEST.value(), e.getMessage());
            return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
        }
        @ExceptionHandler(EmpleadoException.class)
        public ResponseEntity<ErrorResponse> handleEmpleadoException(EmpleadoException e){
            ErrorResponse errorResponse = new ErrorResponse(HttpStatus.BAD_REQUEST.value(), e.getMessage());
            return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);}

    }


