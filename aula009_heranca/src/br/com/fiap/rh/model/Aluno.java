package br.com.fiap.rh.model;

public class Aluno extends Pessoa {
	
	private String curso;
	
	public Aluno() {
		super();
	}
	
	public Aluno(String nome, String matricula, String cpf, String curso) {
		super(nome, matricula, cpf);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public void fazerProva() {
		System.out.printf("\nAluno %s, do curso %s, está fazendo prova", this.nome, this.curso);
	}
	
	
}
