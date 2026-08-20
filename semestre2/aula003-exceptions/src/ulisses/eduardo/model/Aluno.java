package ulisses.eduardo.model;

import java.util.Objects;

public class Aluno extends Pessoa {

    private int matricula;

    public Aluno(String nome, int idade, String cpf, String endereco, int matricula) {
        super(nome, idade, cpf, endereco);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return matricula == aluno.matricula;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }
}
