package padrões;

import tasks.calculadoraRemuneracao;

/**Classe é referente aos profissionais que recebem remuneração fixas
 */

public class ProfissionalSalário extends Profissional implements calculadoraRemuneracao {

    double salarioFixo;


    public ProfissionalSalário(String nome, String dataNascimento, String cpf, int matricula, double salarioFixo) {
        super(nome, dataNascimento, cpf, matricula);
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo( double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    @Override
    public double calculaRemuneracao(double porcentagem) {
        double comissao = salarioFixo;
        return salarioFixo;
    }

    @Override
    public String toString() {
        return "ProfissionalSalário{" +
                "nome='" + getNome() + '\'' +
                ", data de nascimento='" + getDataNascimento() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", matricula=" + getMatricula() +
                ", salarioFixo=" + salarioFixo +
                '}';
    }
}
