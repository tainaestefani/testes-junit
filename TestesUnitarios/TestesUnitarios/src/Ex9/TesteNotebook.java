package Ex9;

import org.junit.Test;
import static org.junit.Assert.*;

public class TesteNotebook {
    @Test
    public void testAumentarRam() {
        Notebook nb = new Notebook("Acer", 8, 256, 2.5);
        nb.aumentarRam(4);
        assertEquals(12, nb.ram);
    }

    @Test
    public void testRodarAplicacaoNotebook() {
        Notebook nb = new Notebook("Acer", 8, 256, 2.5);
        assertTrue(nb.rodarAplicacao("software.exe"));
        assertFalse(nb.rodarAplicacao("software.apk"));
    }
}