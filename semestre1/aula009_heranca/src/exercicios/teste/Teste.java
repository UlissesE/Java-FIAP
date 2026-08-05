package exercicios.teste;

import exercicios.model.Cachorro;
import exercicios.model.Gato;

public class Teste {

	public static void main(String[] args) {

		Cachorro cachorro = new Cachorro("Estrela", 12);
		cachorro.comer();
		cachorro.dormir();
		cachorro.latir();
		
		Gato gato = new Gato("Nina", 16);
		gato.comer();
		gato.dormir();
		gato.miar();
		
	}

}
