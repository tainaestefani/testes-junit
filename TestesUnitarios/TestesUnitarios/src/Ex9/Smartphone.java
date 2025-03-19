package Ex9;

public class Smartphone extends Computador {
    private int operadora;
    private boolean cameraFrontal;

    public Smartphone(String modelo, double ram, double armazenamento, int operadora, boolean cameraFrontal) {
        super(modelo, ram, armazenamento);
        this.operadora = operadora;
        this.cameraFrontal = cameraFrontal;
    }

    public boolean tirarSelfie() {
        return cameraFrontal;
    }

    public boolean ligar(int num) {
        return String.valueOf(num).charAt(0) == String.valueOf(operadora).charAt(0);
    }

    @Override
    public boolean rodarAplicacao(String nomeArquivo) {
        return nomeArquivo.endsWith(".apk");
    }
}