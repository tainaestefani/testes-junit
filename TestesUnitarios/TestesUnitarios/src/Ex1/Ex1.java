package Ex1;

public class Ex1 {
    public String informarEstacao(int num) {
        return switch (num) {
            case 1 -> "É verão.\nO tempo está quente.";
            case 2 -> "É outono.\nAs folhas estão secando.";
            case 3 -> "É inverno.\nEstá frio.";
            case 4 -> "É primavera.\nAs flores estão nascendo.";
            default -> throw new IllegalArgumentException();
        };
    }
}