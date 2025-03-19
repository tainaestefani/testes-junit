package Ex1;

import org.junit.Test;
import static org.junit.Assert.*;

public class TesteEx1 {
    @Test
    public void testeInformarEstacao() {
        Ex1 estacao = new Ex1();
        assertEquals("É verão.\nO tempo está quente.", estacao.informarEstacao(1));
        assertEquals("É outono.\nAs folhas estão secando.", estacao.informarEstacao(2));
        assertEquals("É inverno.\nEstá frio.", estacao.informarEstacao(3));
        assertEquals("É primavera.\nAs flores estão nascendo.", estacao.informarEstacao(4));
    }

    @Test
    public void testeInformarEstacaoException() {
        Ex1 estacao = new Ex1();
        assertThrows(IllegalArgumentException.class, () -> estacao.informarEstacao(5));
        assertThrows(IllegalArgumentException.class, () -> estacao.informarEstacao(0));
    }
}