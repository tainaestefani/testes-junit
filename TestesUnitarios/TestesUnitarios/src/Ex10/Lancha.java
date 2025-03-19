package Ex10;

public class Lancha extends Embarcacao {
    private double velMax;

    public Lancha(String id, String modelo, int qtdPessoas, double capacidadeCombustivel, double queimaDeCombustivel, int qtdBotesSalvaVidas, double velMax) {
        super(id, modelo, qtdPessoas, capacidadeCombustivel, queimaDeCombustivel, qtdBotesSalvaVidas);
        this.velMax = velMax;
    }

    public double tempoViagem(double distancia) {
        return distancia / velMax;
    }

    @Override
    public String verificaSeguranca() {
        if (qtdBotesSalvaVidas > 0) {
            return "Botes OK";
        } else {
            return "ALERTA: embarcação necessitando de mais botes!";
        }
    }
}