package br.com.fiap.rh.model;

public class Professor extends Pessoa {

	private String disciplina;
	
	public Professor() {
		super();
	}
	
	public Professor(String nome, String matricula, String cpf, String disciplina) {
		super(nome, matricula, cpf);
		this.disciplina = disciplina;
	}

	
	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public void ensinar() {
		System.out.printf("\nProfessor %s está ensinando %s", this.nome, this.disciplina);
	}
	
	public void corrigirProva() {
		System.out.printf("\nProfessor %s está corrigindo prova.", this.nome);
	}
	
}
