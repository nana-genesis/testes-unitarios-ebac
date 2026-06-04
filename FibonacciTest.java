import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de testes unitários para o Fibonacci Recursivo.
 * 
 * @author nana-genesis
 * @version 1.0
 */
class FibonacciTest {

    // ========== CASOS BASE ==========
    
    @Test
    void testFibonacciCasoBaseZero() {
        assertEquals(0, FibonacciRecursivo.fibonacci(0));
    }

    @Test
    void testFibonacciCasoBaseUm() {
        assertEquals(1, FibonacciRecursivo.fibonacci(1));
    }

    // ========== CASOS ESPECÍFICOS ==========
    
    @Test
    void testFibonacciPosicaoDois() {
        assertEquals(1, FibonacciRecursivo.fibonacci(2)); // 0,1,1
    }

    @Test
    void testFibonacciPosicaoTres() {
        assertEquals(2, FibonacciRecursivo.fibonacci(3)); // 0,1,1,2
    }

    @Test
    void testFibonacciPosicaoQuatro() {
        assertEquals(3, FibonacciRecursivo.fibonacci(4)); // 0,1,1,2,3
    }

    @Test
    void testFibonacciPosicaoCinco() {
        assertEquals(5, FibonacciRecursivo.fibonacci(5)); // 0,1,1,2,3,5
    }

    @Test
    void testFibonacciPosicaoSeis() {
        assertEquals(8, FibonacciRecursivo.fibonacci(6)); // 0,1,1,2,3,5,8
    }

    @Test
    void testFibonacciPosicaoSete() {
        assertEquals(13, FibonacciRecursivo.fibonacci(7));
    }

    @Test
    void testFibonacciPosicaoOito() {
        assertEquals(21, FibonacciRecursivo.fibonacci(8));
    }

    @Test
    void testFibonacciPosicaoNove() {
        assertEquals(34, FibonacciRecursivo.fibonacci(9));
    }

    @Test
    void testFibonacciPosicaoDez() {
        assertEquals(55, FibonacciRecursivo.fibonacci(10));
    }

    // ========== TESTE DE EXCEÇÃO ==========
    
    @Test
    void testFibonacciNumeroNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            FibonacciRecursivo.fibonacci(-1);
        });
    }
}
