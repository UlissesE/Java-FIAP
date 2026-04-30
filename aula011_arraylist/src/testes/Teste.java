package testes;

import vetores.Produto;

public class Teste {

	public static void main(String[] args) {

		Produto[] produtos = new Produto[5];
		
		produtos[0] = new Produto("Caneta", 2, "Bic");
		produtos[1] = new Produto("Lapis", 1, "Fabercastell");
		produtos[2] = new Produto("Cola", 10, "Splash");
		produtos[3] = new Produto("Tesoura", 10, "Bic");
		produtos[4] = new Produto("Caderno", 10, "Tilibra");
	
		System.out.println("\n### FOR ###\n");
		for (int i = 0; i < produtos.length / 2; i++) {
			produtos[i].setPreco(1000);
			System.out.println(produtos[i]);
		}
		System.out.println("\n### FOREACH ###\n");
		for (Produto produto : produtos) {
			produto.setPreco(9999);
			System.out.println(produto);
		}
	}

}
