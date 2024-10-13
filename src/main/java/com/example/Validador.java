package com.example;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.stream.Stream;

public class Validador {

    public static int incremental = 0;

    public static MessageDigest digest;

    static {
        try {
            // Cria uma instância do algoritmo de hash SHA-256
            digest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Says hello to the world.
     * 
     * @param numeroConta numero da conta para ser validado.
     * @see https://www.creditas.com/exponencial/digito-da-conta-o-que-e-para-que-serve-e-como-encontra-lo/
     */
    public static char calculaDigitoVerificador(int numeroConta) {
        Integer[] digitosConta = new Integer[8];
        Arrays.fill(digitosConta, 0);
        int[] multiplicadores = { 2, 3, 4, 5, 6, 7, 8, 9 };
        String numeroContaAsString = new StringBuilder(
                String.valueOf(numeroConta))
                .reverse().toString();

        for (int i = 0; i < numeroContaAsString.length(); i++) {
            char c = numeroContaAsString.charAt(i);
            digitosConta[i] = (Integer) (Character.getNumericValue(c) * multiplicadores[i]);
        }

        int somaDigitos = Stream.of(digitosConta).reduce(0, Integer::sum);
        int restoDivisao = somaDigitos % 11;
        if (restoDivisao < 10) {
            return Character.forDigit(restoDivisao, 10);
        }
        return 'X';
    }

    public static void validaDigitoVerificador(int numeroConta, char digitoInformado) {
        char digitoCalculado = calculaDigitoVerificador(numeroConta);
        if (digitoInformado != digitoCalculado) {
            throw new ValidadtionErrorException("digito da conta não confere");
        }
    }

    public static int getIdIncremental() {
        incremental++;
        return incremental;
    }

    public static void validaIsContaAtiva(Conta conta) {
        if (!conta.isAtiva()) {
            throw new ValidadtionErrorException("essa conta nõo está ativa");
        }
    }

    public static void validaCriacaoSenha(String senha) {
        if (!senha.matches("\\d+")) {
            throw new ValidadtionErrorException("a senha deve conter apenas numeros");
        }
        if (senha.length() != 6) {
            throw new ValidadtionErrorException("a senha deve ter exatamente 6 numeros");
        }
    }

    public static int geraNumeroConta(String beneficiario, String senha, long id) {

        // Concatenar as entradas
        String concatenatedInput = beneficiario + senha + id;

        // Aplica o algoritmo de hash ao input concatenado
        byte[] hashBytes = digest.digest(concatenatedInput.getBytes());

        // Converter os primeiros bytes do hash para um valor numérico
        long hashValue = 0;
        for (int i = 0; i < 4; i++) { // Usar os 4 primeiros bytes para gerar um número
            hashValue = (hashValue << 8) + (hashBytes[i] & 0xFF);
        }

        // Garantir que o valor esteja entre 10.000.000 e 90.000.000
        int min = 0;
        int max = 90000000;
        int result = (int) (min + (hashValue % (max - min)));

        return result;
    }

    public static void validaSenhaConta(Conta conta, String senha) {
        int numeroContaCalculado = geraNumeroConta(conta.getBeneficiario(), senha, conta.getId().longValue());
        if (conta.getNumeroConta() != numeroContaCalculado) {
            throw new ValidadtionErrorException("senha incorreta");
        }
    }

    public static void validarSaldoSuficiente(Conta conta, Double valor) {
        if (valor.doubleValue() > conta.getSaldo().doubleValue()) {
            throw new ValidadtionErrorException("saldo insuficiente");
        }
    }
}
