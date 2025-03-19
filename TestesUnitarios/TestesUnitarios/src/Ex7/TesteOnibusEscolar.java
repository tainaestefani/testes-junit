package Ex7;

import org.junit.Test;
import static org.junit.Assert.*;

public class TesteOnibusEscolar {

    @Test
    public void testCriacaoOnibus() {
        OnibusEscolar onibus = new OnibusEscolar(30, 3);
        assertEquals(30, onibus.getQuantidadeVagas());
        assertEquals(3, onibus.getQuantidadeProfessores());
        assertEquals(0, onibus.getQuantidadeEstudantes());
    }

    @Test
    public void testAdicionarAlunosComVagasSuficientes() {
        OnibusEscolar onibus = new OnibusEscolar(20, 2);
        onibus.setAlunos(15);
        assertEquals(15, onibus.getQuantidadeEstudantes());
    }

    @Test
    public void testNaoAdicionarMaisAlunosQueVagasDisponiveis() {
        OnibusEscolar onibus = new OnibusEscolar(20, 2);
        onibus.setAlunos(25);
        assertEquals(18, onibus.getQuantidadeEstudantes());
    }

    @Test
    public void testRemoverAlunos() {
        OnibusEscolar onibus = new OnibusEscolar(20, 2);
        onibus.setAlunos(10);
        onibus.removerAlunos(4);
        assertEquals(6, onibus.getQuantidadeEstudantes());
    }

    @Test
    public void testNaoRemoverMaisAlunosDoQueExistem() {
        OnibusEscolar onibus = new OnibusEscolar(20, 2);
        onibus.setAlunos(5);
        onibus.removerAlunos(10);
        assertEquals(0, onibus.getQuantidadeEstudantes());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNaoPermitirProfessoresNegativos() {
        new OnibusEscolar(20, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNaoPermitirAlunosNegativos() {
        OnibusEscolar onibus = new OnibusEscolar(20, 2);
        onibus.setAlunos(-5);
    }

    @Test
    public void testRemocaoDeTodosProfessoresEAlunos() {
        OnibusEscolar onibus = new OnibusEscolar(20, 3);
        onibus.setAlunos(10);
        onibus.setProfessores(0);
        assertEquals(0, onibus.getQuantidadeEstudantes());
    }
}