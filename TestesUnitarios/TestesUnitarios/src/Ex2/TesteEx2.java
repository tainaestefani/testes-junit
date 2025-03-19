package Ex2;

import org.junit.Test;
import static org.junit.Assert.*;

public class TesteEx2 {
    @Test
    public void testeVerificarPar() {
        Ex2 num = new Ex2();
        assertTrue(num.verificarPar(2));
        assertFalse(num.verificarPar(3));
        assertTrue(num.verificarPar(4));
        assertFalse(num.verificarPar(9));
    }
}