package com.desafio.itau.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(TransacaoInvalidaException.class)
    public ResponseEntity<Void> handleTransacaoInvalida(TransacaoInvalidaException ex) {
        return ResponseEntity.unprocessableEntity().build(); // 422
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<Void> handleJsonInvalido(HttpMessageNotReadableException ex) {
        return ResponseEntity.badRequest().build(); // 400
    }
}