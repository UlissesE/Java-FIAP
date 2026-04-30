package vetores;

public class Produto {

	private String nome;
	private float preco;
	private String marca;
	
	public Produto() {
		super();
	}
	
	public Produto(String nome, float preco, String marca) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.marca = marca;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void imprimir() {
		System.out.printf("Produto: %s \nMarca: %s \nPreço: %.2f\n\n", this.nome, this.marca, this.preco);
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", marca=" + marca + "]";
	}
	
	
	
}
