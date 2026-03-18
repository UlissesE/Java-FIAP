package exercicio2;

public class Aluno {

	private int matricula;
	
	private String nome;
	
	private double nota;
	
	public Aluno() {
		this.matricula = 000000;
		this.nome = "Aluno sem matrícula";
		this.nota = 0;
	}
	
	public Aluno(int matricula, String nome, double nota) {
		this.matricula = matricula;
		this.nome = nome;
		this.nota = nota;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getNota() {
		return nota;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setNota(double nota) {
		this.nota = nota;
	}
	
}
