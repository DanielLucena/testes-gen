package com.example;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class Banco {

    private Long id;

    private String nome;

    private List<Conta> contas;

    public Banco(long id, String nome) {
        this.id = id;
        this.nome = nome;
        this.contas = new ArrayList<Conta>();
    }

    public void addConta(Conta conta) {
        char digito = conta.getDigitoVerificador();
        int numeroConta = conta.getNumeroConta();

        Validador.validaDigitoVerificador(numeroConta, digito);
        conta.ativarConta(this);
        this.contas.add(conta);
    }

    // transferencia
    public void transferencia(Conta origem, Conta destino, Double valor, String senha) {
        validaAcessoConta(origem, senha);
        Validador.validaIsContaAtiva(destino);
        Validador.validarSaldoSuficiente(origem, valor);

        origem.sacarValor(valor);
        destino.depositarValor(valor);

    }

    // depositar
    public void depositar(Conta conta, Double valor, String senha) {
        validaAcessoConta(conta, senha);
        conta.depositarValor(valor);
    }

    // sacar
    public void sacar(Conta conta, Double valor, String senha) {
        validaAcessoConta(conta, senha);
        Validador.validarSaldoSuficiente(conta, valor);
        conta.sacarValor(valor);
    }

    private void validaAcessoConta(Conta conta, String senha) {
        Validador.validaIsContaAtiva(conta);
        Validador.validaSenhaConta(conta, senha);
    }

    public Conta getConta(int numeroConta, char digitoVerificador) {
        Validador.validaDigitoVerificador(numeroConta, digitoVerificador);
        for (Conta conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        return null;
    }
}
