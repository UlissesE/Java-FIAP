package ulisses.eduardo.model;

import java.util.Objects;

public class Professor extends Pessoa {

    private int registro;

    public Professor(String nome, int idade, String cpf, String endereco, int registro) {
        super(nome, idade, cpf, endereco);
        this.registro = registro;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return registro == professor.registro;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(registro);
    }
}
