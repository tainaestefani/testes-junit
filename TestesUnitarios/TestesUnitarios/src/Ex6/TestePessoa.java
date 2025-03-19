package Ex6;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestePessoa {

    @Test
    public void testeGerarNomeStarWars() {
        Pessoa pessoa = new Pessoa("Lucas", "Silva", "Souza", "Curitiba");
        assertEquals("SilLu SoCur", pessoa.gerarNomeStarWars());
    }

    @Test
    public void testeGerarNomeStarWarsNomeCurto() {
        Pessoa pessoa = new Pessoa("Li", "Si", "So", "Cu");
        assertEquals("SiLi SoCu", pessoa.gerarNomeStarWars());
    }

    @Test
    public void testeGerarNomeStarWarsNomeSolteiraCurto() {
        Pessoa pessoa = new Pessoa("Lucas", "Silva", "S", "Curitiba");
        assertEquals("SilLu SCur", pessoa.gerarNomeStarWars());
    }

    @Test
    public void testeGerarNomeStarWarsCidadeCurta() {
        Pessoa pessoa = new Pessoa("Lucas", "Silva", "Souza", "Cu");
        assertEquals("SilLu SoCu", pessoa.gerarNomeStarWars());
    }

    @Test
    public void testeGerarNomeStarWarsSobrenomeCurto() {
        Pessoa pessoa = new Pessoa("Lucas", "Si", "Souza", "Curitiba");
        assertEquals("SiLu SoCur", pessoa.gerarNomeStarWars());
    }
}