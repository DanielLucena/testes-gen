package com.example;

public class ValidadtionErrorException extends RuntimeException {

    ValidadtionErrorException(String validacao) {
        super("Erro de Validação: " + validacao);
    }

}
