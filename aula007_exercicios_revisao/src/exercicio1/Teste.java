package exercicio1;

public class Teste {

	public static void main(String[] args) {

		Produto produto = new Produto("Banana", 2, 12);
		
		produto.exibitInformacoes();
		double total = produto.calcularValorTotal();
		
		System.out.println("Preço total em estoque: " + total);
		
	}

}
