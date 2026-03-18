package exercicio1;

public class Produto {

	String nome;
	double preco;
	int quantidade;
	
	public Produto(String nome, double preco, int quantidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	void exibitInformacoes() {
		System.out.println("Nome do Produto: " + nome);
		System.out.println("Preço do Produto: " + preco);
		System.out.println("Quantidade em Estoque: " + quantidade);
	
	}
	
	double calcularValorTotal() {
		return preco * quantidade;
	}
	
}
