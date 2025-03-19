package Ex9;

import org.junit.Test;
import static org.junit.Assert.*;

public class TesteSmartphone {
    @Test
    public void testTirarSelfie() {
        Smartphone sp = new Smartphone("Samsung", 4, 128, 9, true);
        assertTrue(sp.tirarSelfie());

        Smartphone sp2 = new Smartphone("Apple", 6, 256, 8, false);
        assertFalse(sp2.tirarSelfie());
    }

    @Test
    public void testLigar() {
        Smartphone sp = new Smartphone("Samsung", 4, 128, 9, true);
        assertTrue(sp.ligar(911234567));
        assertFalse(sp.ligar(811234567));
    }

    @Test
    public void testRodarAplicacaoSmartphone() {
        Smartphone sp = new Smartphone("Samsung", 4, 128, 9, true);
        assertTrue(sp.rodarAplicacao("app.apk"));
        assertFalse(sp.rodarAplicacao("app.exe"));
    }
}