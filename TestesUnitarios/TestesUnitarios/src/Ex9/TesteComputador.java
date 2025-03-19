package Ex9;

import org.junit.Test;
import static org.junit.Assert.*;

public class TesteComputador {
    @Test
    public void testLigarOuDesligar() {
        Computador pc = new Computador("Dell", 16, 512);
        assertEquals("Ligando", pc.ligarOuDesligar(true));
        assertEquals("Desligando", pc.ligarOuDesligar(false));
    }

    @Test
    public void testRodarAplicacaoComputador() {
        Computador pc = new Computador("Dell", 16, 512);
        assertTrue(pc.rodarAplicacao("app.exe"));
        assertFalse(pc.rodarAplicacao("app.apk"));
    }
}