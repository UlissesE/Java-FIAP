public class Aluno extends Pessoa {

    private String matricula;

    public Aluno(String nome, String email, String documento, String matricula) {
        super(nome, email, documento);
        this.matricula = matricula;
    }

    public String getMatricula() { return matricula; }

    public void setMatricula(String matricula) { this.matricula = matricula; }


    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", documento='" + documento + '\'' +
                "}\n";
    }


}
