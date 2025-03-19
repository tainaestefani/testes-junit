package Ex10;

import org.junit.Test;
import static org.junit.Assert.*;

public class TesteLancha {

    @Test
    public void testLanchaVerificaSeguranca() {
        Lancha lancha = new Lancha("L001", "Lancha Rápida", 5, 200, 0.5, 1, 80);
        assertEquals("Botes OK", lancha.verificaSeguranca());

        Lancha lanchaSemBotes = new Lancha("L002", "Lancha Simples", 5, 200, 0.5, 0, 80);
        assertEquals("ALERTA: embarcação necessitando de mais botes!", lanchaSemBotes.verificaSeguranca());
    }

    @Test
    public void testLanchaTempoViagem() {
        Lancha lancha = new Lancha("L001", "Lancha Rápida", 5, 200, 0.5, 1, 80);
        assertEquals(1.25, lancha.tempoViagem(100), 0.01);
    }
}