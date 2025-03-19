package Ex4;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TesteAtleta {
    @Test
    public void testeClassificarAtleta() {
        Atleta atleta = new Atleta(19, 1.74, 62);
        assertEquals("Juvenil", atleta.classificarAtleta());
    }

    @Test
    public void testeCalcularIMC() {
        Atleta atleta = new Atleta(19, 1.74, 62);
        assertEquals(20.48, atleta.calcularIMC(), 0.001);
    }

    @Test
    public void testeClassificarIMC() {
        Atleta atleta = new Atleta(19, 1.74, 62);
        assertEquals("Saudável", atleta.classificarIMC(atleta.calcularIMC()));
    }
}