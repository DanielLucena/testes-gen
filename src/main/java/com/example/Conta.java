package com.example;

import java.util.Random;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Conta {

    private Long id;

    private String beneficiario;

    private Banco banco;

    private Double saldo;

    private boolean isAtiva;

    private int numeroConta;

    private char digitoVerificador;

    // string senha 6 numeros

    // adicionar criterio de validação salvando senha criptografada com salt no numero da conta

    public Conta(String beneficiario) {
        this.isAtiva = false;
        this.beneficiario = beneficiario;
        this.id = (long) Validador.getIdIncremental();
        this.saldo = .0;

        Random random = new Random();
        this.numeroConta = 10000000 + random.nextInt(90000000);
    }

    public void setDigitoVerificador() {
        this.digitoVerificador = Validador.calculaDigitoVerificador(numeroConta);
    }

    public void ativarConta(Banco banco) {
        this.banco = banco;
        this.isAtiva = true;
    }

}
