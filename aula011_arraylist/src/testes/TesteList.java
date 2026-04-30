package testes;

import java.util.ArrayList;

import vetores.Produto;

public class TesteList {

	public static void main(String[] args) {

		ArrayList<Produto> produtos = new ArrayList<>();
		produtos.add(new Produto("Caneta", 2, "Bic"));
		produtos.add(new Produto("Lapis", 1, "Fabercastell"));
		produtos.add(new Produto("Cola", 10, "Splash"));
		produtos.add(new Produto("Tesoura", 10, "Bic"));
		produtos.add(new Produto("Caderno", 10, "Tilibra"));
		
	
		System.out.println("\n### FOR ###\n");
		
		for (int i = 0; i < produtos.size() / 2; i++) {
			produtos.get(i).setPreco(1000);
			System.out.println(produtos.get(i));
		}
		System.out.println("\n### FOREACH ###\n");
		
		for (Produto produto : produtos) {
			produto.setPreco(9999);
			System.out.println(produto);
		}
		
	}

}
