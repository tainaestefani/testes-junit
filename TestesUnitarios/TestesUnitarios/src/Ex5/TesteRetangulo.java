package Ex5;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class TesteRetangulo {

    @Test
    public void testeCalcularArea() {
        Retangulo retangulo = new Retangulo(2, 4);
        assertEquals(8, retangulo.calcularArea(), 0.001);
    }

    @Test
    public void testeCalcularAreaException() {
        assertThrows(IllegalArgumentException.class, () -> new Retangulo(-2, 4));
        assertThrows(IllegalArgumentException.class, () -> new Retangulo(2, -4));
        assertThrows(IllegalArgumentException.class, () -> new Retangulo(-2, -4));
    }

    @Test
    public void testeCalcularPerimetro() {
        Retangulo retangulo = new Retangulo(2, 4);
        assertEquals(12, retangulo.calcularPerimetro(), 0.001);
    }

    @Test
    public void testeCalcularPerimetroException() {
        assertThrows(IllegalArgumentException.class, () -> new Retangulo(2, -4));
        assertThrows(IllegalArgumentException.class, () -> new Retangulo(-2, 4));
    }

    @Test
    public void testeDescobrirMaiorArea() {
        List<Retangulo> retangulos = new ArrayList<>();
        Retangulo retangulo1 = new Retangulo(2, 4);
        Retangulo retangulo2 = new Retangulo(3, 5);
        Retangulo retangulo3 = new Retangulo(1, 6);

        retangulos.add(retangulo1);
        retangulos.add(retangulo2);
        retangulos.add(retangulo3);

        assertEquals(retangulo2, Retangulo.descobrirMaiorArea(retangulos));
    }

    @Test
    public void testeDescobrirMaiorAreaException() {
        List<Retangulo> retangulos = new ArrayList<>();
        assertThrows(IllegalArgumentException.class, () -> Retangulo.descobrirMaiorArea(retangulos));
    }

    @Test
    public void testeDescobrirMaiorPerimetro() {
        List<Retangulo> retangulos = new ArrayList<>();
        Retangulo retangulo1 = new Retangulo(2, 4);
        Retangulo retangulo2 = new Retangulo(3, 5);
        Retangulo retangulo3 = new Retangulo(1, 6);

        retangulos.add(retangulo1);
        retangulos.add(retangulo2);
        retangulos.add(retangulo3);

        assertEquals(retangulo2, Retangulo.descobrirMaiorPerimetro(retangulos));
    }

    @Test
    public void testeDescobrirMaiorPerimetroException() {
        List<Retangulo> retangulos = new ArrayList<>();
        assertThrows(IllegalArgumentException.class, () -> Retangulo.descobrirMaiorPerimetro(retangulos));
    }
}