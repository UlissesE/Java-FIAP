package exercicios.model;

public class Animal {

	protected String nome;
	
	protected int idade;
	
	public Animal() {
	
	}
	
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void dormir() {
		System.out.printf("\nAnimal %s está dormindo.", this.nome);
	}
	
	public void comer() {
		System.out.printf("\nAnimal %s está comendo.", this.nome);
	}
	
}
