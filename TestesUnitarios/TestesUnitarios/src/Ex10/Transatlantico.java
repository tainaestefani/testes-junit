package Ex10;

public class Transatlantico extends Embarcacao {
    private int anoBatismo;
    private int capacidadeBoteSalvaVidas;

    public Transatlantico(String id, String modelo, int qtdPessoas, double capacidadeCombustivel, double queimaDeCombustivel, int qtdBotesSalvaVidas, int anoBatismo, int capacidadeBoteSalvaVidas) {
        super(id, modelo, qtdPessoas, capacidadeCombustivel, queimaDeCombustivel, qtdBotesSalvaVidas);
        this.anoBatismo = anoBatismo;
        this.capacidadeBoteSalvaVidas = capacidadeBoteSalvaVidas;
    }

    public void adicionaBotes(int novosBotes) {
        qtdBotesSalvaVidas += novosBotes;
    }

    @Override
    public String verificaSeguranca() {
        if (qtdBotesSalvaVidas * capacidadeBoteSalvaVidas >= qtdPessoas) {
            return "Botes OK";
        } else {
            return "ALERTA: embarcação necessitando de mais botes!";
        }
    }
}