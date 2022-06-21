package padrões;

/**
 *
 *
 *
 */

public class Profissional {

    private String nome;
    private String dataNascimento;
    private String cpf;
    private int matricula;

    public Profissional() {

    }

    public Profissional(String nome, String dataNascimento, String cpf, int matricula) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }


    public String getDataNascimento() {
        return dataNascimento;
    }


    public String getCpf() {
        return cpf;
    }


    public int getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Profissional{" +
                "nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", cpf='" + cpf + '\'' +
                ", matricula=" + matricula +
                '}';
            }
}