package Ex9;

public class Computador {
    protected String modelo;
    protected double ram;
    protected double armazenamento;

    public Computador(String modelo, double ram, double armazenamento) {
        this.modelo = modelo;
        this.ram = ram;
        this.armazenamento = armazenamento;
    }

    public String ligarOuDesligar(boolean estado) {
        return estado ? "Ligando" : "Desligando";
    }

    public boolean rodarAplicacao(String nomeArquivo) {
        return nomeArquivo.endsWith(".exe");
    }
}