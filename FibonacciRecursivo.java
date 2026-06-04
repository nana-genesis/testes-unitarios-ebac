/**
 * Classe que implementa o cálculo da sequência de Fibonacci de forma recursiva.
 * 
 * @author nana-genesis
 * @version 1.0
 */
public class FibonacciRecursivo {

    /**
     * Calcula o n-ésimo número da sequência de Fibonacci.
     * Fibonacci(0) = 0
     * Fibonacci(1) = 1
     * Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)
     * 
     * @param n posição na sequência (n >= 0)
     * @return valor do n-ésimo número de Fibonacci
     * @throws IllegalArgumentException se n < 0
     */
    public static long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n não pode ser negativo");
        }
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Método main para teste rápido
    public static void main(String[] args) {
        System.out.println("=== SEQUÊNCIA DE FIBONACCI ===");
        for (int i = 0; i <= 10; i++) {
            System.out.printf("fibonacci(%d) = %d%n", i, fibonacci(i));
        }
    }
}
