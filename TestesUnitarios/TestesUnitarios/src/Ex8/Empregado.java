package Ex8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Empregado {
    private String nome;
    private double salarioMensal;
    private LocalDate dataIngresso;
    private int horasTrabalhoSemanais;

    public Empregado(String nome, double salarioMensal, LocalDate dataIngresso, int horasTrabalhoSemanais) {
        this.nome = nome;
        this.salarioMensal = salarioMensal;
        this.dataIngresso = dataIngresso;
        this.horasTrabalhoSemanais = horasTrabalhoSemanais;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public LocalDate getDataIngresso() {
        return dataIngresso;
    }

    public int getHorasTrabalhoSemanais() {
        return horasTrabalhoSemanais;
    }

    public void reajustarSalarioPorTempoDeCasa() {
        long mesesTrabalhados = dataIngresso.until(LocalDate.now(), ChronoUnit.MONTHS);

        if (mesesTrabalhados < 12) {
            salarioMensal *= 1.05;
        } else {
            salarioMensal *= 1.07;
        }
    }

    public void reajustarSalarioPorHorasExtras() {
        int horasNormais = 40;
        if (horasTrabalhoSemanais > horasNormais) {
            int horasExtrasSemana = horasTrabalhoSemanais - horasNormais;
            int horasExtrasMes = horasExtrasSemana * 4;

            double valorHora = salarioMensal / (horasNormais * 4);
            double valorHoraExtra = valorHora * 1.5;

            double adicionalHorasExtras = horasExtrasMes * valorHoraExtra;
            salarioMensal += adicionalHorasExtras;
        }
    }

    public void aplicarReajustes() {
        reajustarSalarioPorTempoDeCasa();
        reajustarSalarioPorHorasExtras();
    }
}