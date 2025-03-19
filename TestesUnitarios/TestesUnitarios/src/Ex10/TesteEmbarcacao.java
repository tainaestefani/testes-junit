package Ex10;

import org.junit.Test;
import static org.junit.Assert.*;

public class TesteEmbarcacao {
    @Test
    public void testEmbarcacaoPlanejarViagem() {
        Embarcacao embarcacao = new Embarcacao("E001", "Genérico", 100, 1000, 0.5, 5);
        assertTrue(embarcacao.planejarViagem(1500));
        assertFalse(embarcacao.planejarViagem(3000));
    }
}