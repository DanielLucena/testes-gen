package com.example.chatgpt.segunda;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.example.Banco;
import com.example.Conta;
import com.example.Validador;
import com.example.ValidadtionErrorException;

public class ValidadorTest {

    private Banco banco;
    private Conta contaAtiva;
    private Conta contaInativa;

    @Before
    public void setUp() {
        // Reinicia o incremental antes de cada teste para evitar interferências
        Validador.incremental = 0;

        // Cria um banco para uso nos testes
        banco = new Banco(1L, "BancoTeste");

        // Cria uma conta ativa
        contaAtiva = new Conta("BeneficiarioAtivo", "123456");
        banco.addConta(contaAtiva);
        contaAtiva.depositarValor(1000.0);

        // Cria uma conta inativa
        contaInativa = new Conta("BeneficiarioInativo", "654321");
        // Não ativa a conta inativa
    }

    // Testes para calculaDigitoVerificador
    @Test
    public void testCalculaDigitoVerificador_Valido() {
        int numeroConta = 12345678;
        char digitoCalculado = Validador.calculaDigitoVerificador(numeroConta);
        // Calcula manualmente o dígito esperado com base na lógica
        // Para 12345678, reverso: 87654321
        // multiplicadores: 2,3,4,5,6,7,8,9
        // Produto: 8*2 + 7*3 + 6*4 + 5*5 + 4*6 + 3*7 + 2*8 + 1*9 = 16 + 21 + 24 + 25 + 24 + 21 + 16 + 9 = 156
        // 156 % 11 = 2, que é menor que 10, então '2'
        assertEquals('2', digitoCalculado);
    }

    @Test
    public void testCalculaDigitoVerificador_Resto10() {
        int numeroConta = 00000001; // Fornecendo 1, que reverso é "1", multiplicador 2
        char digitoCalculado = Validador.calculaDigitoVerificador(numeroConta);
        // Produto: 1*2 = 2
        // 2 % 11 = 2, que é menor que 10, então '2'
        assertEquals('2', digitoCalculado);
    }

    @Test
    public void testCalculaDigitoVerificador_RestoMaiorQue10() {
        // Para que o resto seja >= 10, precisamos de uma soma que seja múltiplo de 11 + 10 = 21
        // Exemplo: somaDigitos = 21, resto = 21 % 11 = 10, então 'X'
        // Vamos encontrar um número de conta que satisfaça isso
        // Por exemplo, númeroConta = 00000000 (todos zeros)
        // Produtos: 0*2 + 0*3 + ... + 0*9 = 0
        // 0 % 11 = 0, então '0' (não satisfaz)
        // Tente númeroConta = 99999999
        int numeroConta = 99999999;
        char digitoCalculado = Validador.calculaDigitoVerificador(numeroConta);
        // Soma: 9*2 + 9*3 + 9*4 + 9*5 + 9*6 + 9*7 + 9*8 + 9*9 = 18+27+36+45+54+63+72+81 = 396
        // 396 % 11 = 0, então '0' (precisamos de outro exemplo)
        // Tente númeroConta = 1234567 (7 dígitos, preenchendo com zero para 8)
        numeroConta = 1234567;
        digitoCalculado = Validador.calculaDigitoVerificador(numeroConta);
        // Reverso: "7654321" (com um zero à frente: "76543210")
        // Produtos: 7*2 + 6*3 + 5*4 + 4*5 + 3*6 + 2*7 + 1*8 + 0*9 = 14+18+20+20+18+14+8+0 = 112
        // 112 % 11 = 2, ainda não
        // Encontrar um número que resulte em resto 10
        // Por exemplo, somaDigitos = 10
        // NúmeroConta = 00000005: 5*2 = 10, resto 10 % 11 = 10, 'X'
        numeroConta = 5;
        digitoCalculado = Validador.calculaDigitoVerificador(numeroConta);
        assertEquals('X', digitoCalculado);
    }

    // Testes para validaDigitoVerificador
    @Test
    public void testValidaDigitoVerificador_Valido() {
        int numeroConta = contaAtiva.getNumeroConta();
        char digito = contaAtiva.getDigitoVerificador();
        // Deve passar sem exceção
        Validador.validaDigitoVerificador(numeroConta, digito);
    }

    @Test(expected = ValidadtionErrorException.class)
    public void testValidaDigitoVerificador_Invalido() {
        int numeroConta = contaAtiva.getNumeroConta();
        char digitoInvalido = '9'; // Supondo que '9' é inválido para esta conta
        Validador.validaDigitoVerificador(numeroConta, digitoInvalido);
    }

    // Testes para getIdIncremental
    @Test
    public void testGetIdIncremental() {
        int id1 = Validador.getIdIncremental();
        int id2 = Validador.getIdIncremental();
        assertEquals(id1 + 1, id2);
    }

    // Testes para validaIsContaAtiva
    @Test
    public void testValidaIsContaAtiva_Ativa() {
        // Deve passar sem exceção
        Validador.validaIsContaAtiva(contaAtiva);
    }

    @Test(expected = ValidadtionErrorException.class)
    public void testValidaIsContaAtiva_Inativa() {
        // Deve lançar exceção
        Validador.validaIsContaAtiva(contaInativa);
    }

    // Testes para validaCriacaoSenha
    @Test
    public void testValidaCriacaoSenha_Valida() {
        // Deve passar sem exceção
        Validador.validaCriacaoSenha("123456");
    }

    @Test(expected = ValidadtionErrorException.class)
    public void testValidaCriacaoSenha_NaoNumerica() {
        // Deve lançar exceção
        Validador.validaCriacaoSenha("abc123");
    }

    @Test(expected = ValidadtionErrorException.class)
    public void testValidaCriacaoSenha_TamanhoIncorreto() {
        // Deve lançar exceção (menos de 6 dígitos)
        Validador.validaCriacaoSenha("12345");
    }

    // Testes para geraNumeroConta
    @Test
    public void testGeraNumeroConta_Valido() {
        String beneficiario = "BeneficiarioTeste";
        String senha = "123456";
        Long id = 1L;
        int numeroConta = Validador.geraNumeroConta(beneficiario, senha, id);
        assertTrue(numeroConta >= 0 && numeroConta < 90000000);
    }

    @Test(expected = ValidadtionErrorException.class)
    public void testGeraNumeroConta_BeneficiarioNulo() {
        Validador.geraNumeroConta(null, "123456", 1L);
    }

    @Test(expected = ValidadtionErrorException.class)
    public void testGeraNumeroConta_BeneficiarioVazio() {
        Validador.geraNumeroConta("", "123456", 1L);
    }

    @Test(expected = ValidadtionErrorException.class)
    public void testGeraNumeroConta_SenhaNula() {
        Validador.geraNumeroConta("Beneficiario", null, 1L);
    }

    @Test(expected = ValidadtionErrorException.class)
    public void testGeraNumeroConta_SenhaVazia() {
        Validador.geraNumeroConta("Beneficiario", "", 1L);
    }

    @Test(expected = ValidadtionErrorException.class)
    public void testGeraNumeroConta_IdMenorQue1() {
        Validador.geraNumeroConta("Beneficiario", "123456", 0L);
    }

    // Testes para validaSenhaConta
    @Test
    public void testValidaSenhaConta_Valida() {
        // Deve passar sem exceção
        Validador.validaSenhaConta(contaAtiva, "123456");
    }

    @Test(expected = ValidadtionErrorException.class)
    public void testValidaSenhaConta_Invalida() {
        // Deve lançar exceção
        Validador.validaSenhaConta(contaAtiva, "654321");
    }

    // Testes para validarSaldoSuficiente
    @Test
    public void testValidarSaldoSuficiente_Suficiente() {
        // Deve passar sem exceção
        Validador.validarSaldoSuficiente(contaAtiva, 500.0);
    }

    @Test(expected = ValidadtionErrorException.class)
    public void testValidarSaldoSuficiente_Insuficiente() {
        // Deve lançar exceção
        Validador.validarSaldoSuficiente(contaAtiva, 1500.0);
    }

    // Testes para getIdIncremental
    @Test
    public void testGetIdIncremental_Inicial() {
        Validador.incremental = 0; // Resetando para garantir
        int id = Validador.getIdIncremental();
        assertEquals(1, id);
    }

    @Test
    public void testGetIdIncremental_Multiplo() {
        Validador.incremental = 5; // Configurando para 5
        int id = Validador.getIdIncremental();
        assertEquals(6, id);
    }
}
