package Ex10;

import org.junit.Test;
import static org.junit.Assert.*;

public class TesteTransatlantico {

    @Test
    public void testTransatlanticoVerificaSeguranca() {
        Transatlantico transatlantico = new Transatlantico("T001", "Titanic", 3000, 50000, 10, 15, 1912, 200);
        assertEquals("Botes OK", transatlantico.verificaSeguranca());

        transatlantico.adicionaBotes(-10);
        assertEquals("ALERTA: embarcação necessitando de mais botes!", transatlantico.verificaSeguranca());
    }

    @Test
    public void testTransatlanticoPlanejarViagem() {
        Transatlantico transatlantico = new Transatlantico("T001", "Titanic", 3000, 50000, 10, 15, 1912, 200);
        assertTrue(transatlantico.planejarViagem(4000));
        assertFalse(transatlantico.planejarViagem(6000));
    }
}