import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de testes unitários para a Calculadora.
 * 
 * @author nana-genesis
 * @version 1.0
 */
class CalculadoraTest {

    private Calculadora calc;

    @BeforeEach
    void setUp() {
        calc = new Calculadora();
    }

    // ========== TESTES PARA SOMA ==========
    
    @Test
    void testSomarDoisNumerosPositivos() {
        assertEquals(5, calc.somar(2, 3));
        assertEquals(10, calc.somar(4, 6));
        assertEquals(100, calc.somar(50, 50));
    }

    @Test
    void testSomarComNumeroNegativo() {
        assertEquals(1, calc.somar(-2, 3));
        assertEquals(-5, calc.somar(-2, -3));
        assertEquals(-10, calc.somar(5, -15));
    }

    @Test
    void testSomarComZero() {
        assertEquals(5, calc.somar(5, 0));
        assertEquals(5, calc.somar(0, 5));
        assertEquals(0, calc.somar(0, 0));
    }

    // ========== TESTES PARA SUBTRAÇÃO ==========

    @Test
    void testSubtrairDoisNumerosPositivos() {
        assertEquals(2, calc.subtrair(5, 3));
        assertEquals(0, calc.subtrair(5, 5));
        assertEquals(10, calc.subtrair(20, 10));
    }

    @Test
    void testSubtrairComNumeroNegativo() {
        assertEquals(-5, calc.subtrair(-2, 3));
        assertEquals(1, calc.subtrair(-2, -3));
        assertEquals(20, calc.subtrair(5, -15));
    }

    @Test
    void testSubtrairComZero() {
        assertEquals(5, calc.subtrair(5, 0));
        assertEquals(-5, calc.subtrair(0, 5));
        assertEquals(0, calc.subtrair(0, 0));
    }

    // ========== TESTES PARA MULTIPLICAÇÃO ==========

    @Test
    void testMultiplicarDoisNumerosPositivos() {
        assertEquals(6, calc.multiplicar(2, 3));
        assertEquals(20, calc.multiplicar(4, 5));
        assertEquals(100, calc.multiplicar(10, 10));
    }

    @Test
    void testMultiplicarComNumeroNegativo() {
        assertEquals(-6, calc.multiplicar(-2, 3));
        assertEquals(6, calc.multiplicar(-2, -3));
        assertEquals(-50, calc.multiplicar(5, -10));
    }

    @Test
    void testMultiplicarComZero() {
        assertEquals(0, calc.multiplicar(5, 0));
        assertEquals(0, calc.multiplicar(0, 5));
        assertEquals(0, calc.multiplicar(0, 0));
    }

    // ========== TESTES PARA DIVISÃO ==========

    @Test
    void testDividirDoisNumerosPositivos() {
        assertEquals(2, calc.dividir(6, 3));
        assertEquals(5, calc.dividir(20, 4));
        assertEquals(1, calc.dividir(5, 5));
    }

    @Test
    void testDividirComNumeroNegativo() {
        assertEquals(-2, calc.dividir(-6, 3));
        assertEquals(2, calc.dividir(-6, -3));
        assertEquals(-2, calc.dividir(6, -3));
    }

    @Test
    void testDividirUmPorZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calc.dividir(10, 0);
        });
        assertEquals("Divisão por zero não é permitida!", exception.getMessage());
    }

    @Test
    void testDividirZeroPorNumero() {
        assertEquals(0, calc.dividir(0, 5));
        assertEquals(0, calc.dividir(0, 100));
    }
}
