package com.example;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Conta {

    private Long id;

    private String beneficiario;

    private Banco banco;

    @Setter(AccessLevel.PRIVATE)
    private Double saldo;

    private boolean isAtiva;

    private int numeroConta;

    private char digitoVerificador;

    // string senha 6 numeros

    // adicionar criterio de validação salvando senha criptografada com salt no
    // numero da conta

    public Conta(String beneficiario, String senha) {
        // try {
        Validador.validaCriacaoSenha(senha);
        // } catch (ValidadtionErrorException e) {
        // System.out.println("Não foi possivel criar a conta");
        // System.err.println(e);
        // return;
        // }

        this.isAtiva = false;
        this.beneficiario = beneficiario;
        this.id = (long) Validador.getIdIncremental();
        this.saldo = .0;

        this.numeroConta = Validador.geraNumeroConta(beneficiario, senha, this.id.longValue());
        this.digitoVerificador = Validador.calculaDigitoVerificador(this.numeroConta);

        System.out.println("conta criada: " + numeroConta + "-" + digitoVerificador);
    }

    public void setDigitoVerificador() {
        this.digitoVerificador = Validador.calculaDigitoVerificador(numeroConta);
    }

    public void ativarConta(Banco banco) {
        this.banco = banco;
        this.isAtiva = true;
    }

    public void depositarValor(Double valor) {
        this.saldo += valor;
    }

    public void sacarValor(Double valor) {
        this.saldo -= valor;
    }

}
