package testes;

import java.util.ArrayList;

import vetores.Carro;

public class ex1 {

	public static void main(String[] args) {

		ArrayList<Carro> carros = new ArrayList<Carro>();
		
		carros.add(new Carro("Mitsubitsh", "Lancer", 2014, 220));
		carros.add(new Carro("Hyundai", "Elantra", 2014, 180));
		carros.add(new Carro("Fiat", "Palio", 1996, 100));
		carros.add(new Carro("Chevrolet", "Corsa", 2008, 150));
		carros.add(new Carro("BMW", "320i", 2020, 250));
	
		Carro carroMaisRapido = carros.get(0);
		System.out.println(carroMaisRapido);
		for (int i = 1; i < carros.size(); i++) {
			if (carros.get(i).getMaxVelo() > carroMaisRapido.getMaxVelo()) {
				carroMaisRapido = carros.get(i);
			}
		}
		
		System.out.println(carroMaisRapido);
		
	}

}
