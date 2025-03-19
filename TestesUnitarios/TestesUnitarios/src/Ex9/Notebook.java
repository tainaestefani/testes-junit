package Ex9;

public class Notebook extends Computador {
    private double peso;

    public Notebook(String modelo, double ram, double armazenamento, double peso) {
        super(modelo, ram, armazenamento);
        this.peso = peso;
    }

    public void aumentarRam(double quantidade) {
        if(quantidade > 0) {
            this.ram += quantidade;
        }
    }

    @Override
    public boolean rodarAplicacao(String nomeArquivo) {
        return nomeArquivo.endsWith(".exe");
    }
}