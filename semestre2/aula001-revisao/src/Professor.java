public class Professor extends Pessoa {

    private String inscricao;

    public Professor(String nome, String email, String documento, String inscricao) {
        super(nome, email, documento);
        this.inscricao = inscricao;
    }

    public String getInscricao() { return inscricao; }

    public void setInscricao(String inscricao) { this.inscricao = inscricao; }

    @Override
    public String toString() {
        return "Professor{" +
                "inscricao='" + inscricao + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", documento='" + documento + '\'' +
                "}\n";
    }

}
