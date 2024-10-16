package com.example.randoop.segunda;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validaCriacaoSenha("hi!");
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: a senha deve conter apenas numeros");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        int int0 = com.example.Validador.incremental;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.example.Conta conta0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validarSaldoSuficiente(conta0, (java.lang.Double) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        int int0 = com.example.Validador.getIdIncremental();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.example.Conta conta0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validarSaldoSuficiente(conta0, (java.lang.Double) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.example.Validador.incremental = (byte) 0;
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.example.Validador.geraNumeroConta("hi!", "hi!", (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: a senha deve conter apenas numeros");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.example.Conta conta0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validaSenhaConta(conta0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validaDigitoVerificador((int) ' ', '#');
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: digito da conta na?o confere");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validaDigitoVerificador((int) (short) -1, ' ');
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: digito da conta na?o confere");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.example.Validador.geraNumeroConta("hi!", "", (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: a senha deve conter apenas numeros");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.example.Conta conta0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validaIsContaAtiva(conta0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.example.Validador.geraNumeroConta("", "hi!", (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: a senha deve conter apenas numeros");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.security.MessageDigest messageDigest0 = null;
        com.example.Validador.digest = messageDigest0;
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.example.Conta conta0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validaSenhaConta(conta0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        char char1 = com.example.Validador.calculaDigitoVerificador(0);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '0' + "'", char1 == '0');
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.example.Validador.incremental = 1;
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        char char1 = com.example.Validador.calculaDigitoVerificador((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '0' + "'", char1 == '0');
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validaDigitoVerificador((int) (byte) 1, ' ');
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: digito da conta na?o confere");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validaDigitoVerificador((int) (short) 10, ' ');
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: digito da conta na?o confere");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.security.MessageDigest messageDigest0 = com.example.Validador.digest;
        org.junit.Assert.assertNull(messageDigest0);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        char char1 = com.example.Validador.calculaDigitoVerificador((int) (short) 0);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '0' + "'", char1 == '0');
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        char char1 = com.example.Validador.calculaDigitoVerificador((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '2' + "'", char1 == '2');
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.example.Validador.geraNumeroConta("hi!", "", (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: a senha deve conter apenas numeros");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.example.Validador.geraNumeroConta("hi!", "hi!", (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: a senha deve conter apenas numeros");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        char char1 = com.example.Validador.calculaDigitoVerificador((int) (short) -1);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.example.Conta conta0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validarSaldoSuficiente(conta0, (java.lang.Double) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.example.Validador.geraNumeroConta("hi!", "", (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: a senha deve conter apenas numeros");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.example.Validador.incremental = (short) 100;
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.example.Conta conta0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validarSaldoSuficiente(conta0, (java.lang.Double) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validaDigitoVerificador((int) '4', 'a');
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: digito da conta na?o confere");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.example.Validador validador0 = new com.example.Validador();
        java.lang.Class<?> wildcardClass1 = validador0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.example.Validador.incremental = (byte) 10;
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        char char1 = com.example.Validador.calculaDigitoVerificador(1);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '2' + "'", char1 == '2');
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validaCriacaoSenha("");
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: a senha deve conter apenas numeros");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validaDigitoVerificador((int) (byte) 100, 'a');
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: digito da conta na?o confere");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validaDigitoVerificador((int) (byte) 0, '4');
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: digito da conta na?o confere");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.example.Validador.geraNumeroConta("hi!", "hi!", (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: a senha deve conter apenas numeros");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.example.Validador.geraNumeroConta("", "", (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: a senha deve conter apenas numeros");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validaDigitoVerificador((int) (short) 100, '\000');
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: digito da conta na?o confere");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.example.Validador.geraNumeroConta("", "", (java.lang.Long) 100L);
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: a senha deve conter apenas numeros");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.example.Validador.geraNumeroConta("", "", (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: a senha deve conter apenas numeros");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.example.Validador.incremental = '0';
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validaDigitoVerificador((int) (byte) 100, ' ');
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: digito da conta na?o confere");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.example.Validador.incremental = '2';
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validaDigitoVerificador((int) '0', 'a');
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: digito da conta na?o confere");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        char char1 = com.example.Validador.calculaDigitoVerificador(100);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '4' + "'", char1 == '4');
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validaDigitoVerificador((int) (byte) 1, 'a');
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: digito da conta na?o confere");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        char char1 = com.example.Validador.calculaDigitoVerificador((int) (short) 1);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '2' + "'", char1 == '2');
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        com.example.Validador.incremental = '4';
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validaDigitoVerificador(10, '4');
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: digito da conta na?o confere");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validaDigitoVerificador((int) '2', '#');
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: digito da conta na?o confere");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        com.example.Validador.incremental = (byte) -1;
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        com.example.Validador.incremental = 'a';
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validaDigitoVerificador((int) (short) -1, 'a');
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: digito da conta na?o confere");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.example.Validador.geraNumeroConta("", "hi!", (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: a senha deve conter apenas numeros");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validaDigitoVerificador((int) ' ', ' ');
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: digito da conta na?o confere");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        char char1 = com.example.Validador.calculaDigitoVerificador(10);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '3' + "'", char1 == '3');
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        com.example.Validador.incremental = (short) -1;
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validaDigitoVerificador((int) (byte) 0, '\000');
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: digito da conta na?o confere");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        com.example.Validador.incremental = 100;
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.example.Validador.geraNumeroConta("hi!", "", (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: a senha deve conter apenas numeros");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        com.example.Conta conta0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validarSaldoSuficiente(conta0, (java.lang.Double) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validaDigitoVerificador((int) '0', '4');
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: digito da conta na?o confere");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.example.Validador.geraNumeroConta("", "", (java.lang.Long) 0L);
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: a senha deve conter apenas numeros");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        com.example.Validador.validaDigitoVerificador((int) (byte) 1, '2');
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        com.example.Validador.validaDigitoVerificador((int) (short) 1, '2');
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        com.example.Validador.incremental = ' ';
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validaDigitoVerificador((int) (byte) 10, '\000');
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: digito da conta na?o confere");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        char char1 = com.example.Validador.calculaDigitoVerificador((int) ' ');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '2' + "'", char1 == '2');
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validaDigitoVerificador((int) (short) 1, '3');
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: digito da conta na?o confere");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        com.example.Validador.incremental = (short) 0;
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.example.Validador.geraNumeroConta("hi!", "", (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: a senha deve conter apenas numeros");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        char char1 = com.example.Validador.calculaDigitoVerificador((int) (short) 10);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '3' + "'", char1 == '3');
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.example.Validador.geraNumeroConta("hi!", "hi!", (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: a senha deve conter apenas numeros");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validaDigitoVerificador((int) (short) 0, '3');
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: digito da conta na?o confere");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validaDigitoVerificador(10, '\000');
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: digito da conta na?o confere");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        char char1 = com.example.Validador.calculaDigitoVerificador((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '3' + "'", char1 == '3');
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validaDigitoVerificador((-1), '4');
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: digito da conta na?o confere");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validaDigitoVerificador((int) (byte) 10, 'a');
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: digito da conta na?o confere");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validaDigitoVerificador((int) (byte) 100, '0');
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: digito da conta na?o confere");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validaDigitoVerificador((int) '3', ' ');
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: digito da conta na?o confere");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.example.Validador.geraNumeroConta("", "", (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: a senha deve conter apenas numeros");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test85");
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validaDigitoVerificador((int) '#', '2');
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: digito da conta na?o confere");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test86");
        com.example.Validador.incremental = 10;
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test87");
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validaDigitoVerificador((int) 'a', ' ');
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: digito da conta na?o confere");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test88");
        char char1 = com.example.Validador.calculaDigitoVerificador((int) 'a');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '8' + "'", char1 == '8');
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test89");
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validaDigitoVerificador(0, '3');
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: digito da conta na?o confere");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test90");
        com.example.Validador.incremental = 0;
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test91");
        char char1 = com.example.Validador.calculaDigitoVerificador((int) '2');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '4' + "'", char1 == '4');
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test92");
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validaDigitoVerificador(0, 'a');
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: digito da conta na?o confere");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test93");
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validaDigitoVerificador((int) '\000', '#');
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: digito da conta na?o confere");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test94");
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validaDigitoVerificador((int) '8', 'a');
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: digito da conta na?o confere");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test95() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test95");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.example.Validador.geraNumeroConta("hi!", "hi!", (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: a senha deve conter apenas numeros");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test96() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test96");
        com.example.Validador.incremental = (byte) 100;
    }

    @Test
    public void test97() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test97");
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validaDigitoVerificador((int) (short) 0, '4');
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: digito da conta na?o confere");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test98() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test98");
        // The following exception was thrown during execution in test generation
        try {
            com.example.Validador.validaDigitoVerificador((int) (byte) 100, '3');
            org.junit.Assert.fail("Expected exception of type com.example.ValidadtionErrorException; message: Erro de Validac?a?o: digito da conta na?o confere");
        } catch (com.example.ValidadtionErrorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test99() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test99");
        char char1 = com.example.Validador.calculaDigitoVerificador((-1));
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\000' + "'", char1 == '\000');
    }
}

