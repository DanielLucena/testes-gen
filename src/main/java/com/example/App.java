package com.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Banco bancoDoBrasil = new Banco(1, "Banco do Brasil");

        Conta contaFulano = new Conta("Fulano de Tal", "123456");
        Conta contaBeltrano = new Conta("Beltrano de não sei das quantas", "141516");

        bancoDoBrasil.addConta(contaFulano);
        bancoDoBrasil.addConta(contaBeltrano);

        System.out.println("saldo beltrano: " + contaBeltrano.getSaldo());
        bancoDoBrasil.depositar(contaBeltrano, 500.00, "141516");
        System.out.println("saldo beltrano: " + contaBeltrano.getSaldo());

        // char digito = Validador.calculaDigitoVerificador(262634);
        System.out.println("quantidade de contas: " + bancoDoBrasil.getContas().size());

        try {
            Conta contaSicrano = new Conta("Sicrano", "123456789");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Conta contaSicrano = new Conta("Sicrano", "1234");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Conta contaSicrano = new Conta("Sicrano", "558764");

        try {
            bancoDoBrasil.transferencia(contaBeltrano, contaSicrano, 5.50, "141516");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        bancoDoBrasil.addConta(contaSicrano);

        try {
            bancoDoBrasil.transferencia(contaBeltrano, contaSicrano, 5.50, "141516");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Runnable[] operations = {
                () -> bancoDoBrasil.depositar(contaSicrano, 1000.0, "558764"),
                () -> bancoDoBrasil.sacar(contaFulano, 1.0, "123456"),
                () -> bancoDoBrasil.sacar(contaSicrano, 500.51, "558763"),
                () -> bancoDoBrasil.transferencia(contaBeltrano, contaFulano, 5.50, "141516"),

        };

        for (Runnable operation : operations) {
            try {
                operation.run();
                System.out.println(
                        "Sucesso em operação " + operation.hashCode());
            } catch (RuntimeException e) {
                System.out.println(
                        "Falha   em operação " + operation.hashCode() + " [" + e.getMessage() + "] ");

            }

        }
    }
}
