/**
 * Classe que implementa operações básicas de uma calculadora.
 * 
 * @author nana-genesis
 * @version 1.0
 */
public class Calculadora {

    /**
     * Soma dois números inteiros.
     * 
     * @param a primeiro número
     * @param b segundo número
     * @return resultado da soma
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai dois números inteiros.
     * 
     * @param a primeiro número
     * @param b segundo número
     * @return resultado da subtração (a - b)
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números inteiros.
     * 
     * @param a primeiro número
     * @param b segundo número
     * @return resultado da multiplicação
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide dois números inteiros.
     * 
     * @param a dividendo
     * @param b divisor
     * @return resultado da divisão (a / b)
     * @throws ArithmeticException se o divisor for zero
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida!");
        }
        return a / b;
    }
}
