package Ex3;

public class Calculadora {
    double num1, num2;

    public Calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double soma() {
        return num1 + num2;
    }

    public double subtracao() {
        return num1 - num2;
    }

    public double multiplicacao() {
        return num1 * num2;
    }

    public double divisao() {
        if(num2 == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return num1 / num2;
    }
}