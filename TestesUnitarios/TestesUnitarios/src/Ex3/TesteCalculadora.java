package Ex3;

import org.junit.Test;
import static org.junit.Assert.*;

public class TesteCalculadora {
    @Test
    public void testeSoma() {
        Calculadora calculadora = new Calculadora(10, 5);
        assertEquals(15, calculadora.soma(), 0.001);
    }

    @Test
    public void testeSubtracao() {
        Calculadora calculadora = new Calculadora(10, 5);
        assertEquals(5, calculadora.subtracao(), 0.001);
    }

    @Test
    public void testeMultiplicacao() {
        Calculadora calculadora = new Calculadora(10, 5);
        assertEquals(50, calculadora.multiplicacao(), 0.001);
    }

    @Test
    public void testeDivisao() {
        Calculadora calculadora = new Calculadora(10, 5);
        assertEquals(2, calculadora.divisao(), 0.001);
    }

    @Test
    public void testeDivisaoPorZero() {
        Calculadora calculadora = new Calculadora(10, 0);
        Exception exception = assertThrows(ArithmeticException.class, calculadora::divisao);
        assertEquals("Divisão por zero não é permitida.", exception.getMessage());
    }
}