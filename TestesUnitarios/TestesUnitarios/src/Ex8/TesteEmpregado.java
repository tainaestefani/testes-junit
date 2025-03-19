package Ex8;

import java.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteEmpregado {

    @Test
    public void testReajusteMenosDe12Meses() {
        Empregado empregado = new Empregado("Tainá", 3000, LocalDate.now().minusMonths(10), 40);
        empregado.aplicarReajustes();
        assertEquals(3150.0, empregado.getSalarioMensal(), 0.001);
    }

    @Test
    public void testReajusteMaisDe12Meses() {
        Empregado empregado = new Empregado("Maria", 5000, LocalDate.now().minusYears(2), 40);
        empregado.aplicarReajustes();
        assertEquals(5350.0, empregado.getSalarioMensal(), 0.001);
    }

    @Test
    public void testReajusteComHoraExtra() {
        Empregado empregado = new Empregado("Gabriella", 4000, LocalDate.now().minusYears(3), 45);
        empregado.aplicarReajustes();
        double salarioEsperado = 4000 * 1.07 + (5 * (4000 / 160) * 1.5 * 4);
        assertEquals(salarioEsperado, empregado.getSalarioMensal(), 0.001);
    }

    @Test
    public void testSemReajusteHorasNormais() {
        Empregado empregado = new Empregado("Nathália", 3500, LocalDate.now().minusMonths(6), 40);
        empregado.aplicarReajustes();
        assertEquals(3675.0, empregado.getSalarioMensal(), 0.001);
    }

    @Test
    public void testSemHorasExtras() {
        Empregado empregado = new Empregado("Sayonara", 4500, LocalDate.now().minusYears(1), 40);
        empregado.aplicarReajustes();
        assertEquals(4815.0, empregado.getSalarioMensal(), 0.001);
    }
}