package Ex7;

class OnibusEscolar {
    int qntVagas, qntProfessores, qntEstudantes;

    public OnibusEscolar(int quantidadeVagas, int qntProfessores) {
        this.qntVagas = quantidadeVagas;
        setProfessores(qntProfessores);
    }

    public int getQuantidadeVagas() {
        return qntVagas;
    }

    public int getQuantidadeProfessores() {
        return qntProfessores;
    }

    public int getQuantidadeEstudantes() {
        return qntEstudantes;
    }

    public void setProfessores(int qntProfessores) {
        if (qntProfessores < 0) {
            throw new IllegalArgumentException("A quantidade de professores não pode ser negativa.");
        }
        this.qntProfessores = qntProfessores;

        if (qntProfessores == 0) {
            this.qntEstudantes = 0;
        }
    }

    public void setAlunos(int qntEstudantes) {
        if (qntEstudantes < 0) {
            throw new IllegalArgumentException("A quantidade de alunos não pode ser negativa.");
        }

        int vagasDisponiveis = qntVagas - qntProfessores;

        if (qntProfessores == 0) {
            this.qntEstudantes = 0;
        } else {
            this.qntEstudantes = Math.min(qntEstudantes, vagasDisponiveis);
        }
    }

    public void removerAlunos(int qntRemover) {
        if (qntRemover < 0) {
            throw new IllegalArgumentException("A quantidade a remover não pode ser negativa.");
        }

        this.qntEstudantes = Math.max(0, this.qntEstudantes - qntRemover);
    }
}