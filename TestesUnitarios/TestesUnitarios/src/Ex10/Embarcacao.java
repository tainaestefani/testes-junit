package Ex10;

public class Embarcacao {
    protected String id;
    protected String modelo;
    protected int qtdPessoas;
    protected double capacidadeCombustivel;
    protected double queimaDeCombustivel;
    protected int qtdBotesSalvaVidas;

    public Embarcacao(String id, String modelo, int qtdPessoas, double capacidadeCombustivel, double queimaDeCombustivel, int qtdBotesSalvaVidas) {
        this.id = id;
        this.modelo = modelo;
        this.qtdPessoas = qtdPessoas;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.queimaDeCombustivel = queimaDeCombustivel;
        this.qtdBotesSalvaVidas = qtdBotesSalvaVidas;
    }

    public boolean planejarViagem(double distancia) {
        double combustivelNecessario = distancia * queimaDeCombustivel;
        return capacidadeCombustivel >= combustivelNecessario;
    }

    public String verificaSeguranca() {
        return "Segurança não definida";
    }
}