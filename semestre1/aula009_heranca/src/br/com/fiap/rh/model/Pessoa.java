package br.com.fiap.rh.model;

public class Pessoa {
	
	protected String nome;
	
	protected String matricula;
	
	protected String cpf;

	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String matricula, String cpf) {
		this.nome = nome;
		this.matricula = matricula;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	public void estudar() {
		System.out.printf("\nPessoa do nome %s, do CPF %s, com matricula %s, está estudando.", this.nome, this.cpf, this.matricula);
	}
	
	
}
