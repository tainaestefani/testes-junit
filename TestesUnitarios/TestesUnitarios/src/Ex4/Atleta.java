package Ex4;

public class Atleta {
    int idade;
    double altura, peso;

    public Atleta(int idade, double altura, double peso) {
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public String classificarAtleta() {
        if (idade >= 5 && idade <= 7) {
            return "Pré-Mirim";
        } else if (idade >= 8 && idade <= 10) {
            return "Mirim";
        } else if (idade >= 11 && idade <= 13) {
            return "Infantil";
        } else if (idade >= 14 && idade <= 17) {
            return "Infanto-Juvenil";
        } else if (idade >= 18 && idade <= 20) {
            return "Juvenil";
        } else if (idade >= 21) {
            return "Adulto";
        } else {
            return "Idade fora das categorias";
        }
    }

    public double calcularIMC() {
        double imc = peso / (altura * altura);
        return imc;
    }

    public String classificarIMC(double imc) {
        if (imc < 18.5) {
            return "Magreza";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Saudável";
        } else if (imc >= 25.0 && imc <= 29.9) {
            return "Sobrepeso";
        } else if (imc >= 30.0 && imc <= 34.9) {
            return "Obesidade Grau I";
        } else if (imc >= 35.0 && imc <= 39.9) {
            return "Obesidade Grau II (severa)";
        } else {
            return "Obesidade Grau III (mórbida)";
        }
    }
}