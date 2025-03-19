package Ex5;

import java.util.Comparator;
import java.util.List;

public class Retangulo {
    double altura, largura;

    public Retangulo(double altura, double largura) {
        if (altura < 0 || largura < 0) {
            throw new IllegalArgumentException("Altura e largura devem ser valores positivos.");
        }

        this.altura = altura;
        this.largura = largura;
    }

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return (largura * 2) + (altura * 2);
    }

    public static Retangulo descobrirMaiorArea(List<Retangulo> retangulos) {
        return retangulos.stream().max(Comparator.comparingDouble(Retangulo::calcularArea)).orElseThrow(() -> new IllegalArgumentException("A lista de retângulos não pode ser vazia."));
    }

    public static Retangulo descobrirMaiorPerimetro(List<Retangulo> retangulos) {
        return retangulos.stream().max(Comparator.comparingDouble(Retangulo::calcularPerimetro)).orElseThrow(() -> new IllegalArgumentException("A lista de retângulos não pode ser vazia."));
    }
}