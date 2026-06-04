# Tarefa: Testes Unitários e Documentação (Módulo 5)

## Exercício 1 - Calculadora com Testes

### Implementação
- `Calculadora.java`: classe com métodos somar, subtrair, multiplicar, dividir
- `CalculadoraTest.java`: testes unitários para cada método

### Destaques dos testes
- **Divisão por zero:** testada com `assertThrows`
- **Casos felizes:** números positivos, negativos e zero
- **Cobertura completa:** todos os métodos testados

## Exercício 2 - Testes para Fibonacci

### Implementação
- `FibonacciRecursivo.java`: função recursiva de Fibonacci
- `FibonacciTest.java`: testes para posições 0, 1, 2, 3, ..., 10

### Testes realizados
- Casos base: fibonacci(0) = 0, fibonacci(1) = 1
- Casos específicos: fibonacci(2) a fibonacci(10)
- Exceção: fibonacci(-1) lança IllegalArgumentException

## Exercício 3 - Documentação e Reflexão

### Documentação adicionada
- JavaDoc em todas as classes e métodos públicos
- Parâmetros descritos com `@param`
- Retornos descritos com `@return`
- Exceções descritas com `@throws`

### Resposta da pergunta
**Pergunta:** Você conseguiria entender o código que criou sem documentar?

**Resposta:** Sim. O código foi escrito com nomes claros e responsabilidade única, tornando-o autoexplicativo. A documentação é útil para APIs públicas, mas neste caso específico é mais um exercício didático do que uma necessidade real.

## Como executar os testes

bash
# Compilar
javac -cp .:junit-jupiter-api-5.10.0.jar *.java

# Executar Fibonacci
java FibonacciRecursivo

# Com Maven (recomendado)
mvn clean test
