package com.example.chatgpt.primeira;

import org.junit.Before;
import org.junit.Test;

import com.example.Banco;
import com.example.Conta;
import com.example.Validador;
import com.example.ValidadtionErrorException;

import static org.junit.Assert.*;

public class ValidadorTest {

    private Conta conta;

    @Before
    public void setup() {
        // Criar uma conta válida para usar nos testes
        conta = new Conta("BeneficiarioTeste", "123456");
        conta.ativarConta(new Banco(1, "BancoTeste"));
        conta.depositarValor(1000.0);
    }

    @Test
    public void testCalculaDigitoVerificador() {
        int numeroConta = 12345678;
        char digitoEsperado = 'X';  // Esperado com base na lógica
        assertEquals(digitoEsperado, Validador.calculaDigitoVerificador(numeroConta));
    }

    @Test(expected = ValidadtionErrorException.class)
    public void testValidaDigitoVerificadorInvalido() {
        Validador.validaDigitoVerificador(12345678, '9'); // Deve lançar exceção
    }

    @Test
    public void testValidaDigitoVerificadorValido() {
        char digito = Validador.calculaDigitoVerificador(conta.getNumeroConta());
        Validador.validaDigitoVerificador(conta.getNumeroConta(), digito); // Não deve lançar exceção
    }

    @Test
    public void testGetIdIncremental() {
        int id1 = Validador.getIdIncremental();
        int id2 = Validador.getIdIncremental();
        assertEquals(id1 + 1, id2); // O próximo ID deve ser incremental
    }

    @Test(expected = ValidadtionErrorException.class)
    public void testValidaContaNaoAtiva() {
        Conta contaInativa = new Conta("BeneficiarioInativo", "654321");
        Validador.validaIsContaAtiva(contaInativa); // Deve lançar exceção
    }

    @Test
    public void testValidaContaAtiva() {
        Validador.validaIsContaAtiva(conta); // Não deve lançar exceção
    }

    @Test(expected = ValidadtionErrorException.class)
    public void testValidaCriacaoSenhaInvalida() {
        Validador.validaCriacaoSenha("senhaInvalida"); // Deve lançar exceção
    }

    @Test
    public void testValidaCriacaoSenhaValida() {
        Validador.validaCriacaoSenha("123456"); // Não deve lançar exceção
    }

    @Test
    public void testGeraNumeroConta() {
        int numeroConta = Validador.geraNumeroConta("BeneficiarioTeste", "123456", 1L);
        assertNotNull(numeroConta); // Deve retornar um número de conta válido
    }

    @Test(expected = ValidadtionErrorException.class)
    public void testValidaSenhaContaInvalida() {
        Validador.validaSenhaConta(conta, "654321"); // Deve lançar exceção
    }

    @Test
    public void testValidaSenhaContaValida() {
        Validador.validaSenhaConta(conta, "123456"); // Não deve lançar exceção
    }

    @Test(expected = ValidadtionErrorException.class)
    public void testValidarSaldoInsuficiente() {
        Validador.validarSaldoSuficiente(conta, 2000.0); // Deve lançar exceção
    }

    @Test
    public void testValidarSaldoSuficiente() {
        Validador.validarSaldoSuficiente(conta, 500.0); // Não deve lançar exceção
    }
}
