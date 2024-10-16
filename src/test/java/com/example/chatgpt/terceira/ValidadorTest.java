package com.example.chatgpt.terceira;

import org.junit.Before;
import org.junit.Test;

import com.example.Banco;
import com.example.Conta;
import com.example.Validador;
import com.example.ValidadtionErrorException;

import static org.junit.Assert.*;

public class ValidadorTest {

    @Before
    public void setUp() throws Exception {
        // Reiniciar o incremental antes de cada teste
        Validador.incremental = 0;
    }

    @Test
    public void testCalculaDigitoVerificador() {
        int numeroConta = 12345678;
        char digitoEsperado = 'X';  // Ajuste conforme o cálculo da sua função
        char digitoCalculado = Validador.calculaDigitoVerificador(numeroConta);
        assertEquals(digitoEsperado, digitoCalculado);
    }

    @Test(expected = ValidadtionErrorException.class)
    public void testValidaDigitoVerificadorInvalido() {
        int numeroConta = 12345678;
        char digitoIncorreto = '5';
        Validador.validaDigitoVerificador(numeroConta, digitoIncorreto);
    }

    @Test
    public void testValidaDigitoVerificadorValido() {
        int numeroConta = 12345678;
        char digitoCorreto = Validador.calculaDigitoVerificador(numeroConta);
        Validador.validaDigitoVerificador(numeroConta, digitoCorreto);
    }

    @Test
    public void testGetIdIncremental() {
        int id1 = Validador.getIdIncremental();
        int id2 = Validador.getIdIncremental();
        assertEquals(1, id1);
        assertEquals(2, id2);
    }

    @Test(expected = ValidadtionErrorException.class)
    public void testValidaContaNaoAtiva() {
        Conta conta = new Conta("Beneficiário", "123456");
        Validador.validaIsContaAtiva(conta);  // Deve lançar uma exceção
    }

    @Test
    public void testValidaContaAtiva() {
        Conta conta = new Conta("Beneficiário", "123456");
        conta.ativarConta(new Banco(1L, "Banco Teste"));
        Validador.validaIsContaAtiva(conta);  // Não deve lançar exceção
    }

    @Test(expected = ValidadtionErrorException.class)
    public void testValidaCriacaoSenhaInvalidaCaracteres() {
        Validador.validaCriacaoSenha("abc123");  // Deve falhar pois contém caracteres não numéricos
    }

    @Test(expected = ValidadtionErrorException.class)
    public void testValidaCriacaoSenhaInvalidaTamanho() {
        Validador.validaCriacaoSenha("12345");  // Deve falhar pois a senha tem menos de 6 dígitos
    }

    @Test
    public void testValidaCriacaoSenhaValida() {
        Validador.validaCriacaoSenha("123456");  // Não deve lançar exceção
    }

    @Test
    public void testGeraNumeroConta() {
        String beneficiario = "Beneficiário";
        String senha = "123456";
        Long id = 1L;
        int numeroConta = Validador.geraNumeroConta(beneficiario, senha, id);
        assertTrue(numeroConta >= 0 && numeroConta <= 90000000);
    }

    @Test(expected = ValidadtionErrorException.class)
    public void testValidaSenhaContaInvalida() {
        Conta conta = new Conta("Beneficiário", "123456");
        Validador.validaSenhaConta(conta, "654321");  // Deve falhar pois a senha está incorreta
    }

    @Test
    public void testValidaSenhaContaValida() {
        Conta conta = new Conta("Beneficiário", "123456");
        Validador.validaSenhaConta(conta, "123456");  // Não deve lançar exceção
    }

    @Test(expected = ValidadtionErrorException.class)
    public void testValidarSaldoSuficienteInvalido() {
        Conta conta = new Conta("Beneficiário", "123456");
        conta.depositarValor(100.0);
        Validador.validarSaldoSuficiente(conta, 200.0);  // Deve falhar pois o saldo é insuficiente
    }

    @Test
    public void testValidarSaldoSuficienteValido() {
        Conta conta = new Conta("Beneficiário", "123456");
        conta.depositarValor(200.0);
        Validador.validarSaldoSuficiente(conta, 100.0);  // Não deve lançar exceção
    }
}
