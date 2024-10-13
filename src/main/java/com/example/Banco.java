package com.example;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Banco {

    private Long id;

    private String nome;

    private List<Conta> contas;

    public void addConta(Conta conta) {
        char digito = conta.getDigitoVerificador();
        int numeroConta = conta.getNumeroConta();
        //adicionar verificação de se ja existe outra conta com o mesmo nome de beneficioario
        

        Validador.validaDigitoVerificador(numeroConta + 1, digito);
        conta.ativarConta(this);
        this.contas.add(conta);
    }

    public void transferencia(Conta origem, Conta destino, Double valor) {
        if (origem.getSaldo() >= valor) {
            origem.setSaldo(origem.getSaldo() - valor);
            destino.setSaldo(destino.getSaldo() + valor);
        }
    }

    // depositar

    // sacar
}
